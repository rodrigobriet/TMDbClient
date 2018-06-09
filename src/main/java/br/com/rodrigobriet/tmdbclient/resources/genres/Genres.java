package br.com.rodrigobriet.tmdbclient.resources.genres;

import br.com.rodrigobriet.tmdbclient.core.mapping.GsonMapping;
import br.com.rodrigobriet.tmdbclient.core.requests.interfaces.RequestService;
import br.com.rodrigobriet.tmdbclient.core.resources.ResourceQuery;
import br.com.rodrigobriet.tmdbclient.core.resources.ResourcesConf;
import br.com.rodrigobriet.tmdbclient.core.resources.query.LanguageQuery;
import br.com.rodrigobriet.tmdbclient.resources.genres.models.GenresMovieList;
import br.com.rodrigobriet.tmdbclient.resources.genres.models.GenresTvList;

public class Genres extends ResourcesConf {

	public Genres(String apiKey, RequestService requestService) {
		super(apiKey, requestService);
	}
	
	public ResourceQuery<GenresMovieList, LanguageQuery> getMovieList() {
		return new ResourceQuery<>("/genre/movie/list", apiKey, requestService, new GsonMapping<>(GenresMovieList.class));
	}
	
	public ResourceQuery<GenresTvList, LanguageQuery> getTvList() {
		return new ResourceQuery<>("/genre/tv/list", apiKey, requestService, new GsonMapping<>(GenresTvList.class));
	}

}
