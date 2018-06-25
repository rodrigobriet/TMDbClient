package com.github.rodrigobriet.tmdbclient.resources.changes;

import com.github.rodrigobriet.tmdbclient.core.mappings.interfaces.MappingService;
import com.github.rodrigobriet.tmdbclient.core.requests.interfaces.RequestService;
import com.github.rodrigobriet.tmdbclient.core.resources.ResourceQuery;
import com.github.rodrigobriet.tmdbclient.core.resources.ResourcesHolder;
import com.github.rodrigobriet.tmdbclient.core.resources.queries.PaggedDateQuery;
import com.github.rodrigobriet.tmdbclient.resources.changes.models.ChangeMovieList;
import com.github.rodrigobriet.tmdbclient.resources.changes.models.ChangePersonList;
import com.github.rodrigobriet.tmdbclient.resources.changes.models.ChangeTvList;

public class Changes extends ResourcesHolder {

	public Changes(String apiKey, RequestService requestService, MappingService mappingService) {
		super(apiKey, requestService, mappingService);
	}
	
	public ResourceQuery<ChangeMovieList, PaggedDateQuery> getMovieChangeList() {
		return new ResourceQuery.Builder<ChangeMovieList, PaggedDateQuery>(requestService, mappingService, apiKey)
				.setPath("/movie/changes")
				.setModelClass(ChangeMovieList.class)
				.build();
	}
	
	public ResourceQuery<ChangeTvList, PaggedDateQuery> getTvChangeList() {
		return new ResourceQuery.Builder<ChangeTvList, PaggedDateQuery>(requestService, mappingService, apiKey)
				.setPath("/tv/changes")
				.setModelClass(ChangeTvList.class)
				.build();
	}
	
	public ResourceQuery<ChangePersonList, PaggedDateQuery> getPersonChangeList() {
		return new ResourceQuery.Builder<ChangePersonList, PaggedDateQuery>(requestService, mappingService, apiKey)
				.setPath("/person/changes")
				.setModelClass(ChangePersonList.class)
				.build();
	}

}
