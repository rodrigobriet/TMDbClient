package br.com.rodrigobriet.tmdbclient.resources.discover;

import br.com.rodrigobriet.tmdbclient.core.requests.interfaces.RequestService;
import br.com.rodrigobriet.tmdbclient.core.resources.ResourcesConf;

public class Discover extends ResourcesConf {

	public Discover(String apiKey, RequestService requestService) {
		super(apiKey, requestService);
	}

	public MovieDiscover getMovieDiscover() {
		return new MovieDiscover(apiKey, requestService);
	}
	
	public TvDiscover getTvDiscover() {
		return new TvDiscover(apiKey, requestService);
	}
	
}
