package com.github.rodrigobriet.tmdbclient.resources.genres;

import com.github.rodrigobriet.tmdbclient.core.mappings.interfaces.MappingService;
import com.github.rodrigobriet.tmdbclient.core.requests.interfaces.RequestService;
import com.github.rodrigobriet.tmdbclient.core.resources.ResourceQuery;
import com.github.rodrigobriet.tmdbclient.core.resources.ResourcesHolder;
import com.github.rodrigobriet.tmdbclient.core.resources.queries.LanguageQuery;
import com.github.rodrigobriet.tmdbclient.resources.genres.models.GenresMovieList;
import com.github.rodrigobriet.tmdbclient.resources.genres.models.GenresTvList;

public class Genres extends ResourcesHolder {

	public Genres(String apiKey, RequestService requestService, MappingService mappingService) {
		super(apiKey, requestService, mappingService);
	}
	
	public ResourceQuery<GenresMovieList, LanguageQuery> getMovieList() {
		return new ResourceQuery.Builder<GenresMovieList, LanguageQuery>(requestService, mappingService, apiKey)
				.setPath("/genre/movie/list")
				.setModelClass(GenresMovieList.class)
				.build();
	}
	
	public ResourceQuery<GenresTvList, LanguageQuery> getTvList() {
		return new ResourceQuery.Builder<GenresTvList, LanguageQuery>(requestService, mappingService, apiKey)
				.setPath("/genre/tv/list")
				.setModelClass(GenresTvList.class)
				.build();
	}

}
