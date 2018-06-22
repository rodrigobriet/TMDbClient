package br.com.rodrigobriet.tmdbclient.core.resources;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import br.com.rodrigobriet.tmdbclient.core.exceptions.InvalidParameterValue;
import br.com.rodrigobriet.tmdbclient.core.mappings.interfaces.MappingService;
import br.com.rodrigobriet.tmdbclient.core.models.Header;
import br.com.rodrigobriet.tmdbclient.core.models.StatusMessage;
import br.com.rodrigobriet.tmdbclient.core.requests.interfaces.RequestCallback;
import br.com.rodrigobriet.tmdbclient.core.requests.interfaces.RequestMediator;
import br.com.rodrigobriet.tmdbclient.core.requests.interfaces.RequestService;

public class Resource<ModelT> {

	private RequestService requestService;
	private MappingService mappingService;
	protected String apiKey;
	
	private ResourceMethod resourceMethod;
	
	private String path;
	private String[] pathValues;
	
	private Class<ModelT> modelClass;
	private Type modelType;
	
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
	
	protected void request(RequestCallback<?> callback, RequestMediator requestMediator) {
		if(resourceMethod == ResourceMethod.GET) {
			requestService.get(buildPath(), requestMediator);
		} else if(resourceMethod == ResourceMethod.POST) {
			requestService.post(buildPath(), mappingService.toJson(bodyContent), requestMediator);
		} else if(resourceMethod == ResourceMethod.DELETE) {
			requestService.delete(buildPath(), requestMediator);
		}
	}
	
	protected String buildPath() {
		return createParametizedURI() + buildQueryString();
	}
	
	private String createParametizedURI() {			
		return buildURI(replaceParams(cleanEmpty(path.split("/"))));
	}
	
	private List<String> cleanEmpty(String[] values) {
		List<String> cleanValues = new ArrayList<>();
		
		for(String v: values) {
			if(!v.isEmpty())
				cleanValues.add(v);
		}
		
		return cleanValues;
	}
	
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
	
	protected String buildQueryString() {
		return "?api_key=" + apiKey;
	}
	
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
