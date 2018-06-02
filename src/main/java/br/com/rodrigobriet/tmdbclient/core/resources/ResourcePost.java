package br.com.rodrigobriet.tmdbclient.core.resources;

import com.google.gson.Gson;

import br.com.rodrigobriet.tmdbclient.core.mapping.GsonMapping;
import br.com.rodrigobriet.tmdbclient.core.models.StatusMessage;
import br.com.rodrigobriet.tmdbclient.core.requests.interfaces.RequestCallback;
import br.com.rodrigobriet.tmdbclient.core.requests.interfaces.RequestMediator;
import br.com.rodrigobriet.tmdbclient.core.requests.interfaces.RequestService;
import br.com.rodrigobriet.tmdbclient.core.resources.query.QueryField;

public class ResourcePost<QueryT extends QueryField, BodyT> extends ResourceQuery<StatusMessage, QueryT> {

	protected BodyT body;
	
	public ResourcePost(String path, String apiKey, RequestService requestService, BodyT body, int ... pathValues) {
		super(path, apiKey, requestService, new GsonMapping<>(StatusMessage.class), pathValues);
		
		this.body = body;
	}

	@Override
	protected void request(RequestCallback<StatusMessage> callback, RequestMediator requestMediator) {
		requestService.post(buildPath(), new Gson().toJson(body), requestMediator);
	}

}
