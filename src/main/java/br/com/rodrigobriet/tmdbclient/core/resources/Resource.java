package br.com.rodrigobriet.tmdbclient.core.resources;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import br.com.rodrigobriet.tmdbclient.core.exceptions.InvalidParameterValue;
import br.com.rodrigobriet.tmdbclient.core.mapping.MappingService;
import br.com.rodrigobriet.tmdbclient.core.models.Header;
import br.com.rodrigobriet.tmdbclient.core.requests.interfaces.RequestCallback;
import br.com.rodrigobriet.tmdbclient.core.requests.interfaces.RequestMediator;
import br.com.rodrigobriet.tmdbclient.core.requests.interfaces.RequestService;

public class Resource<ModelT> {

	protected String path;
	protected int[] intPathValues;
	protected String[] StringPathValues;
	
	protected String apiKey;	
	
	protected RequestService requestService;
	protected MappingService<ModelT> mappingService;
	
	public Resource(String path, String apiKey, RequestService requestService, MappingService<ModelT> mappingService) {
		this.path = path;
		this.apiKey = apiKey;
		this.requestService = requestService;
		this.mappingService = mappingService;
	}
	
	public Resource(String path, String apiKey, RequestService requestService, MappingService<ModelT> mappingService, int ... pathValues) {
		this.path = path;
		this.apiKey = apiKey;
		this.requestService = requestService;
		this.mappingService = mappingService;
		this.intPathValues = pathValues;
	}
	
	public Resource(String path, String apiKey, RequestService requestService, MappingService<ModelT> mappingService, String ... pathValues) {
		this.path = path;
		this.apiKey = apiKey;
		this.requestService = requestService;
		this.mappingService = mappingService;
		this.StringPathValues = pathValues;
	}
	
	public void request(RequestCallback<ModelT> callback) {
		RequestMediator requestMediator = new RequestMediator() {
			
			@Override
			public void onSucces(Header header, String body) {
				callback.onSucess(header, mappingService.map(body));
			}

			@Override
			public void onFail(Header header, String body) {
				callback.OnFail(header, mappingService.mapError(body));
			}
			
			@Override
			public void onError(Header requestHeader, IOException e) {
				callback.onError(requestHeader, e);
			}
		};
		
		request(callback, requestMediator);
	}
	
	protected void request(RequestCallback<ModelT> callback, RequestMediator requestMediator) {
		requestService.get(buildPath(), requestMediator);
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
					if(intPathValues != null) {
						values.set(i, ""+intPathValues[j]);
					} else {
						values.set(i, StringPathValues[j]);
					}
					
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
}
