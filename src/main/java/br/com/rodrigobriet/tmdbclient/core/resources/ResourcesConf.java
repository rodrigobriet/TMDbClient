package br.com.rodrigobriet.tmdbclient.core.resources;

import br.com.rodrigobriet.tmdbclient.core.requests.interfaces.RequestService;

public class ResourcesConf {

	protected String apiKey;
	protected RequestService requestService;
	
	public ResourcesConf(String apiKey, RequestService requestService) {
		this.apiKey = apiKey;
		this.requestService = requestService;
	}
	
}
