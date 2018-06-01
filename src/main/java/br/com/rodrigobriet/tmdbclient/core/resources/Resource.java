package br.com.rodrigobriet.tmdbclient.core.resources;

import java.io.IOException;

import br.com.rodrigobriet.tmdbclient.core.mapping.MappingService;
import br.com.rodrigobriet.tmdbclient.core.models.Header;
import br.com.rodrigobriet.tmdbclient.core.requests.RequestCallback;
import br.com.rodrigobriet.tmdbclient.core.requests.RequestMediator;
import br.com.rodrigobriet.tmdbclient.core.requests.RequestService;

public class Resource<ModelT> {

	protected String path;
	
	protected String apiKey;	
	
	protected RequestService requestService;
	protected MappingService<ModelT> mappingService;
	
	public Resource(String path, String apiKey, RequestService requestService, MappingService<ModelT> mappingService) {
		this.path = path;
		this.apiKey = apiKey;
		this.requestService = requestService;
		this.mappingService = mappingService;
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
		return path + buildQueryString();
	}
	
	protected String buildQueryString() {
		return "?api_key=" + apiKey;
	}
}
