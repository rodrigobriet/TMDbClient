package br.com.rodrigobriet.tmdbclient.resources.changes;

import br.com.rodrigobriet.tmdbclient.core.mapping.GsonMapping;
import br.com.rodrigobriet.tmdbclient.core.requests.interfaces.RequestService;
import br.com.rodrigobriet.tmdbclient.core.resources.ResourceQuery;
import br.com.rodrigobriet.tmdbclient.core.resources.ResourcesConf;
import br.com.rodrigobriet.tmdbclient.core.resources.query.PaggedDateQuery;
import br.com.rodrigobriet.tmdbclient.resources.changes.models.ChangeMovieList;
import br.com.rodrigobriet.tmdbclient.resources.changes.models.ChangePersonList;
import br.com.rodrigobriet.tmdbclient.resources.changes.models.ChangeTvList;

public class Changes extends ResourcesConf {

	public Changes(String apiKey, RequestService requestService) {
		super(apiKey, requestService);
	}
	
	public ResourceQuery<ChangeMovieList, PaggedDateQuery> getMovieChangeList() {
		return new ResourceQuery<>("/movie/changes", apiKey, requestService, new GsonMapping<>(ChangeMovieList.class));
	}
	
	public ResourceQuery<ChangeTvList, PaggedDateQuery> getTvChangeList() {
		return new ResourceQuery<>("/tv/changes", apiKey, requestService, new GsonMapping<>(ChangeTvList.class));
	}
	
	public ResourceQuery<ChangePersonList, PaggedDateQuery> getPersonChangeList() {
		return new ResourceQuery<>("/person/changes", apiKey, requestService, new GsonMapping<>(ChangePersonList.class));
	}

}
