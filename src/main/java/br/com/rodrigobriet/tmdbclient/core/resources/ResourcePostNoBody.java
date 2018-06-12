package br.com.rodrigobriet.tmdbclient.core.resources;

import com.google.gson.Gson;

import br.com.rodrigobriet.tmdbclient.core.mapping.GsonMapping;
import br.com.rodrigobriet.tmdbclient.core.models.StatusMessage;
import br.com.rodrigobriet.tmdbclient.core.requests.interfaces.RequestCallback;
import br.com.rodrigobriet.tmdbclient.core.requests.interfaces.RequestMediator;
import br.com.rodrigobriet.tmdbclient.core.requests.interfaces.RequestService;
import br.com.rodrigobriet.tmdbclient.core.resources.query.QueryField;

public class ResourcePostNoBody<QueryT extends QueryField> extends ResourceQuery<StatusMessage, QueryT> {
	
	public ResourcePostNoBody(String path, String apiKey, RequestService requestService) {
		super(path, apiKey, requestService, new GsonMapping<>(StatusMessage.class));
	}
	
	public ResourcePostNoBody(String path, String apiKey, RequestService requestService, int ... pathValues) {
		super(path, apiKey, requestService, new GsonMapping<>(StatusMessage.class), pathValues);
	}
	
	public ResourcePostNoBody(String path, String apiKey, RequestService requestService, String ... pathValues) {
		super(path, apiKey, requestService, new GsonMapping<>(StatusMessage.class), pathValues);
	}

	@Override
	protected void request(RequestCallback<StatusMessage> callback, RequestMediator requestMediator) {
		requestService.post(buildPath(), new Gson().toJson(""), requestMediator);
	}
	
}
