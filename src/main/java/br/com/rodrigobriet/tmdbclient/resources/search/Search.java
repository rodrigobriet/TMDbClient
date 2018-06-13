package br.com.rodrigobriet.tmdbclient.resources.search;

import br.com.rodrigobriet.tmdbclient.core.mapping.GsonMapping;
import br.com.rodrigobriet.tmdbclient.core.requests.interfaces.RequestService;
import br.com.rodrigobriet.tmdbclient.core.resources.ResourceQuery;
import br.com.rodrigobriet.tmdbclient.core.resources.ResourcesConf;
import br.com.rodrigobriet.tmdbclient.core.resources.query.SearchMoviesQuery;
import br.com.rodrigobriet.tmdbclient.core.resources.query.SearchQuery;
import br.com.rodrigobriet.tmdbclient.core.resources.query.SearchTvQuery;
import br.com.rodrigobriet.tmdbclient.core.resources.query.SearchWithLanguageQuery;
import br.com.rodrigobriet.tmdbclient.core.resources.query.SearchWithRegionQuery;
import br.com.rodrigobriet.tmdbclient.resources.search.models.SearchCollections;
import br.com.rodrigobriet.tmdbclient.resources.search.models.SearchCompanies;
import br.com.rodrigobriet.tmdbclient.resources.search.models.SearchKeywords;
import br.com.rodrigobriet.tmdbclient.resources.search.models.SearchMovies;
import br.com.rodrigobriet.tmdbclient.resources.search.models.SearchMulti;
import br.com.rodrigobriet.tmdbclient.resources.search.models.SearchPerson;
import br.com.rodrigobriet.tmdbclient.resources.search.models.SearchTvShows;

public class Search extends ResourcesConf {

	public Search(String apiKey, RequestService requestService) {
		super(apiKey, requestService);
	}
	
	public ResourceQuery<SearchCompanies, SearchQuery> searchCompanies(String query) {
		ResourceQuery<SearchCompanies, SearchQuery> r = 
				new ResourceQuery<>("/search/company", apiKey, requestService, new GsonMapping<>(SearchCompanies.class));
		r.setQuery(SearchQuery.QUERY, query);
		return r;
	}
	
	public ResourceQuery<SearchCollections, SearchWithLanguageQuery> searchCollections(String query) {
		ResourceQuery<SearchCollections, SearchWithLanguageQuery> r = 
				new ResourceQuery<>("/search/collection", apiKey, requestService, new GsonMapping<>(SearchCollections.class));
		r.setQuery(SearchWithLanguageQuery.QUERY, query);
		return r;
	}
	
	public ResourceQuery<SearchKeywords, SearchQuery> searchKeywords(String query) {
		ResourceQuery<SearchKeywords, SearchQuery> r = 
				new ResourceQuery<>("/search/keyword", apiKey, requestService, new GsonMapping<>(SearchKeywords.class));
		r.setQuery(SearchQuery.QUERY, query);
		return r;
	}
	
	public ResourceQuery<SearchMovies, SearchMoviesQuery> searchMovies(String query) {
		ResourceQuery<SearchMovies, SearchMoviesQuery> r = 
				new ResourceQuery<>("/search/movie", apiKey, requestService, new GsonMapping<>(SearchMovies.class));
		r.setQuery(SearchMoviesQuery.QUERY, query);
		return r;
	}

	public ResourceQuery<SearchMulti, SearchWithRegionQuery> multiSearch(String query) {
		 ResourceQuery<SearchMulti, SearchWithRegionQuery> r =
				 new ResourceQuery<>("/search/multi", apiKey, requestService, new GsonMapping<>(SearchMulti.class));
		 r.setQuery(SearchWithRegionQuery.QUERY, query);
		 return r;
	}
	
	public ResourceQuery<SearchPerson, SearchWithRegionQuery> searchPerson(String query) {
		 ResourceQuery<SearchPerson, SearchWithRegionQuery> r =
				 new ResourceQuery<>("/search/person", apiKey, requestService, new GsonMapping<>(SearchPerson.class));
		 r.setQuery(SearchWithRegionQuery.QUERY, query);
		 return r;
	}
	
	public ResourceQuery<SearchTvShows, SearchTvQuery> searchTv(String query) {
		 ResourceQuery<SearchTvShows, SearchTvQuery> r =
				 new ResourceQuery<>("/search/tv", apiKey, requestService, new GsonMapping<>(SearchTvShows.class));
		 r.setQuery(SearchTvQuery.QUERY, query);
		 return r;
	}
	
}
