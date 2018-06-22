package br.com.rodrigobriet.tmdbclient.resources.discover;

import br.com.rodrigobriet.tmdbclient.core.mappings.interfaces.MappingService;
import br.com.rodrigobriet.tmdbclient.core.requests.interfaces.RequestService;
import br.com.rodrigobriet.tmdbclient.core.resources.ResourcesHolder;

public class Discover extends ResourcesHolder {

	public Discover(String apiKey, RequestService requestService, MappingService mappingService) {
		super(apiKey, requestService, mappingService);
	}

	public MovieDiscover getMovieDiscover() {
		return new MovieDiscover(apiKey, requestService, mappingService);
	}
	
	public TvDiscover getTvDiscover() {
		return new TvDiscover(apiKey, requestService, mappingService);
	}
	
}
