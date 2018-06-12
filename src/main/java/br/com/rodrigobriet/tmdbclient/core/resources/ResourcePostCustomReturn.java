package br.com.rodrigobriet.tmdbclient.core.resources;

import com.google.gson.Gson;

import br.com.rodrigobriet.tmdbclient.core.mapping.MappingService;
import br.com.rodrigobriet.tmdbclient.core.requests.interfaces.RequestCallback;
import br.com.rodrigobriet.tmdbclient.core.requests.interfaces.RequestMediator;
import br.com.rodrigobriet.tmdbclient.core.requests.interfaces.RequestService;
import br.com.rodrigobriet.tmdbclient.core.resources.query.QueryField;

public class ResourcePostCustomReturn<ModelT, QueryT extends QueryField, BodyT> extends ResourceQuery<ModelT, QueryT> {

	protected BodyT body;
	
	public ResourcePostCustomReturn(String path, String apiKey, RequestService requestService, MappingService<ModelT> mappingService, BodyT body, int ... pathValues) {
		super(path, apiKey, requestService, mappingService, pathValues);
		
		this.body = body;
	}

	@Override
	protected void request(RequestCallback<ModelT> callback, RequestMediator requestMediator) {
		requestService.post(buildPath(), new Gson().toJson(body), requestMediator);
	}
	
}
