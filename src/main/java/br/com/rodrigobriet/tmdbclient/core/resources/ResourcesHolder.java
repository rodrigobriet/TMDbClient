package br.com.rodrigobriet.tmdbclient.core.resources;

import br.com.rodrigobriet.tmdbclient.core.mappings.interfaces.MappingService;
import br.com.rodrigobriet.tmdbclient.core.requests.interfaces.RequestService;

/**
 * An abstract implementation for classes that hold resources.
 * Each resource package has his own ResourcesBuilder to generate the resource for each endpoint.
 */
public abstract class ResourcesHolder {

	protected String apiKey;
	protected RequestService requestService;
	protected MappingService mappingService;
	
	public ResourcesHolder(String apiKey, RequestService requestService, MappingService mappingService) {
		this.apiKey = apiKey;
		this.requestService = requestService;
		this.mappingService = mappingService;
	}
	
}
