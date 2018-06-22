package br.com.rodrigobriet.tmdbclient.resources.genres;

import br.com.rodrigobriet.tmdbclient.core.mappings.interfaces.MappingService;
import br.com.rodrigobriet.tmdbclient.core.requests.interfaces.RequestService;
import br.com.rodrigobriet.tmdbclient.core.resources.ResourceQuery;
import br.com.rodrigobriet.tmdbclient.core.resources.ResourcesHolder;
import br.com.rodrigobriet.tmdbclient.core.resources.queries.LanguageQuery;
import br.com.rodrigobriet.tmdbclient.resources.genres.models.GenresMovieList;
import br.com.rodrigobriet.tmdbclient.resources.genres.models.GenresTvList;

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
