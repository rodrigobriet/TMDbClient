package com.github.rodrigobriet.tmdbclient.core.resources;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import com.github.rodrigobriet.tmdbclient.core.exceptions.InvalidParameterValue;
import com.github.rodrigobriet.tmdbclient.core.mappings.interfaces.MappingService;
import com.github.rodrigobriet.tmdbclient.core.models.Header;
import com.github.rodrigobriet.tmdbclient.core.models.StatusMessage;
import com.github.rodrigobriet.tmdbclient.core.requests.interfaces.RequestCallback;
import com.github.rodrigobriet.tmdbclient.core.requests.interfaces.RequestMediator;
import com.github.rodrigobriet.tmdbclient.core.requests.interfaces.RequestService;

/**
 * Represents a resource. Need to be created using the {@link Resource.Builder}.
 * @param <ModelT> The type of the resource model.
 */
public class Resource<ModelT> {

	/**
	 * The request service used to perform the resource request.
	 */
	private RequestService requestService;
	
	/**
	 * The mapping service used to map the returned request value to the ModelT class.
	 */
	private MappingService mappingService;
	
	/**
	 * The API key used to request the resource.
	 */
	protected String apiKey;
	
	/**
	 * The resource HTTP method.
	 */
	private ResourceMethod resourceMethod;
	
	/**
	 * The resource path with variables.
	 */
	private String path;
	
	/**
	 * The path variables values.
	 */
	private String[] pathValues;
	
	/**
	 * The model class or type.
	 */
	private Class<ModelT> modelClass;
	private Type modelType;
	
	/**
	 * The body content when POST.
	 */
	private Object bodyContent;
	
	protected Resource(RequestService requestService, 
			MappingService mappingService, 
			String apiKey, 
			String path,
			Class<ModelT> modelClass, 
			Type modelType, 
			ResourceMethod resourceMethod, 
			String[] pathValues, 
			Object bodyContent) {
		this.requestService = requestService;
		this.mappingService = mappingService;
		this.apiKey = apiKey;
		this.path = path;
		this.modelClass = modelClass;
		this.modelType = modelType;
		this.resourceMethod = resourceMethod;
		this.pathValues = pathValues;
		this.bodyContent = bodyContent;
	}

	/**
	 * Make the request to get the resource data.
	 * @param callback A {@link RequestCallback} for this specified resource data.
	 */
	public void request(RequestCallback<ModelT> callback) {
		RequestMediator requestMediator = new RequestMediator() {
			
			@SuppressWarnings("unchecked")
			@Override
			public void onSucces(Header header, String body) {
				if(modelClass != null) {
					callback.onSucess(header, modelClass.cast(mappingService.toObject(body, modelClass)));
				} else {
					callback.onSucess(header, (ModelT) mappingService.toObject(body, modelType));
				}
			}

			@Override
			public void onFail(Header header, String body) {
				callback.OnFail(header, (StatusMessage) mappingService.toObject(body, StatusMessage.class));
			}
			
			@Override
			public void onError(Header requestHeader, IOException e) {
				callback.onError(requestHeader, e);
			}
		};
		
		request(callback, requestMediator);
	}
	
	/**
	 * Call the correct {@link RequestService} method for each {@link ResourceMethod}
	 * @param callback
	 * @param requestMediator
	 */
	protected void request(RequestCallback<?> callback, RequestMediator requestMediator) {
		if(resourceMethod == ResourceMethod.GET) {
			requestService.get(buildPath(), requestMediator);
		} else if(resourceMethod == ResourceMethod.POST) {
			requestService.post(buildPath(), mappingService.toJson(bodyContent), requestMediator);
		} else if(resourceMethod == ResourceMethod.DELETE) {
			requestService.delete(buildPath(), requestMediator);
		}
	}
	
	/**
	 * Build the resource path with query string.
	 * @return A {@link String} with the resource path.
	 */
	protected String buildPath() {
		return createParametizedURI() + buildQueryString();
	}
	
	/**
	 * Create the resource path replacing the variables.
	 * @return The resource path with the variables replaced.
	 */
	private String createParametizedURI() {			
		return buildURI(replaceParams(cleanEmpty(path.split("/"))));
	}
	
	/**
	 * Remove empty values from the path array.
	 */
	private List<String> cleanEmpty(String[] values) {
		List<String> cleanValues = new ArrayList<>();
		
		for(String v: values) {
			if(!v.isEmpty())
				cleanValues.add(v);
		}
		
		return cleanValues;
	}
	
	/**
	 * Replace the variables with the values;
	 */
	private List<String> replaceParams(List<String> values) {
		int j = 0;
		for(int i = 0; i < values.size(); i++) {
			String v = values.get(i);
			if(v.matches("^\\{.+\\}$")) {
				try {
					values.set(i, pathValues[j]);
					j++;
				} catch (Exception e) {
					throw new InvalidParameterValue("Number of path params and values not match.");
				}
			}
				
		}
		
		return values;
	}
	
	
	/**
	 * Rebuild the path from List to String.
	 */
	private String buildURI(List<String> uriS) {
		StringBuilder sb = new StringBuilder();
		
		for(String v: uriS) {
			if(sb.length() != 0) {
				sb.append("/");
			}
				
			sb.append(v);
		}
		
		return sb.toString();
	}
	
	/**
	 * Build the resource query string.
	 */
	protected String buildQueryString() {
		return "?api_key=" + apiKey;
	}
	
	/**
	 * Create a Resource with the specified data.
	 * @param <ModelT> The type of the resource model.
	 */
	public static class Builder<ModelT> extends ResourceBuilder<ModelT, Resource<ModelT>> {

		public Builder(RequestService requestService, MappingService mappingService, String apiKey) {
			super(requestService, mappingService, apiKey);
		}

		@Override
		public Resource<ModelT> build() {
			return new Resource<ModelT>(requestService, mappingService, apiKey, path, modelClass, modelType, resourceMethod, pathValues, bodyContent);
		}
		
	}
}
