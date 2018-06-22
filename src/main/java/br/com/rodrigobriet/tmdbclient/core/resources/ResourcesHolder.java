package br.com.rodrigobriet.tmdbclient.core.resources;

import br.com.rodrigobriet.tmdbclient.core.mappings.interfaces.MappingService;
import br.com.rodrigobriet.tmdbclient.core.requests.interfaces.RequestService;

public class ResourcesHolder {

	protected String apiKey;
	protected RequestService requestService;
	protected MappingService mappingService;
	
	public ResourcesHolder(String apiKey, RequestService requestService, MappingService mappingService) {
		this.apiKey = apiKey;
		this.requestService = requestService;
		this.mappingService = mappingService;
	}
	
}
