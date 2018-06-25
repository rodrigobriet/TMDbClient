package com.github.rodrigobriet.tmdbclient.resources.discover;

import com.github.rodrigobriet.tmdbclient.core.mappings.interfaces.MappingService;
import com.github.rodrigobriet.tmdbclient.core.requests.interfaces.RequestService;
import com.github.rodrigobriet.tmdbclient.core.resources.ResourcesHolder;

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
