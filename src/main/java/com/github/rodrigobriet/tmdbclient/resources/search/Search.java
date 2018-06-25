package com.github.rodrigobriet.tmdbclient.resources.search;

import com.github.rodrigobriet.tmdbclient.core.mappings.interfaces.MappingService;
import com.github.rodrigobriet.tmdbclient.core.requests.interfaces.RequestService;
import com.github.rodrigobriet.tmdbclient.core.resources.ResourceQuery;
import com.github.rodrigobriet.tmdbclient.core.resources.ResourcesHolder;
import com.github.rodrigobriet.tmdbclient.core.resources.queries.SearchMoviesQuery;
import com.github.rodrigobriet.tmdbclient.core.resources.queries.SearchQuery;
import com.github.rodrigobriet.tmdbclient.core.resources.queries.SearchTvQuery;
import com.github.rodrigobriet.tmdbclient.core.resources.queries.SearchWithLanguageQuery;
import com.github.rodrigobriet.tmdbclient.core.resources.queries.SearchWithRegionQuery;
import com.github.rodrigobriet.tmdbclient.resources.search.models.SearchCollections;
import com.github.rodrigobriet.tmdbclient.resources.search.models.SearchCompanies;
import com.github.rodrigobriet.tmdbclient.resources.search.models.SearchKeywords;
import com.github.rodrigobriet.tmdbclient.resources.search.models.SearchMovies;
import com.github.rodrigobriet.tmdbclient.resources.search.models.SearchMulti;
import com.github.rodrigobriet.tmdbclient.resources.search.models.SearchPerson;
import com.github.rodrigobriet.tmdbclient.resources.search.models.SearchTvShows;

public class Search extends ResourcesHolder {

	public Search(String apiKey, RequestService requestService, MappingService mappingService) {
		super(apiKey, requestService, mappingService);
	}

	public ResourceQuery<SearchCompanies, SearchQuery> searchCompanies(String query) {
		ResourceQuery<SearchCompanies, SearchQuery> r =  new ResourceQuery.Builder<SearchCompanies, SearchQuery>(requestService, mappingService, apiKey)
				.setPath("/search/company")
				.setModelClass(SearchCompanies.class)
				.build();
		return r.setQuery(SearchQuery.QUERY, query);
	}
	
	public ResourceQuery<SearchCollections, SearchWithLanguageQuery> searchCollections(String query) {
		ResourceQuery<SearchCollections, SearchWithLanguageQuery> r =  new ResourceQuery.Builder<SearchCollections, SearchWithLanguageQuery>(requestService, mappingService, apiKey)
				.setPath("/search/collection")
				.setModelClass(SearchCollections.class)
				.build();
		return r.setQuery(SearchWithLanguageQuery.QUERY, query);
	}
	
	public ResourceQuery<SearchKeywords, SearchQuery> searchKeywords(String query) {
		ResourceQuery<SearchKeywords, SearchQuery> r =  new ResourceQuery.Builder<SearchKeywords, SearchQuery>(requestService, mappingService, apiKey)
				.setPath("/search/keyword")
				.setModelClass(SearchKeywords.class)
				.build();
		return r.setQuery(SearchQuery.QUERY, query);
	}
	
	public ResourceQuery<SearchMovies, SearchMoviesQuery> searchMovies(String query) {
		ResourceQuery<SearchMovies, SearchMoviesQuery> r =  new ResourceQuery.Builder<SearchMovies, SearchMoviesQuery>(requestService, mappingService, apiKey)
				.setPath("/search/movie")
				.setModelClass(SearchMovies.class)
				.build();
		return r.setQuery(SearchMoviesQuery.QUERY, query);
	}

	public ResourceQuery<SearchMulti, SearchWithRegionQuery> multiSearch(String query) {
		 ResourceQuery<SearchMulti, SearchWithRegionQuery> r =  new ResourceQuery.Builder<SearchMulti, SearchWithRegionQuery>(requestService, mappingService, apiKey)
					.setPath("/search/multi")
					.setModelClass(SearchMulti.class)
					.build();
		 return r.setQuery(SearchWithRegionQuery.QUERY, query);
	}
	
	public ResourceQuery<SearchPerson, SearchWithRegionQuery> searchPerson(String query) {
		 ResourceQuery<SearchPerson, SearchWithRegionQuery> r =  new ResourceQuery.Builder<SearchPerson, SearchWithRegionQuery>(requestService, mappingService, apiKey)
					.setPath("/search/person")
					.setModelClass(SearchPerson.class)
					.build();
		 return r.setQuery(SearchWithRegionQuery.QUERY, query);
	}
	
	public ResourceQuery<SearchTvShows, SearchTvQuery> searchTv(String query) {
		 ResourceQuery<SearchTvShows, SearchTvQuery> r =  new ResourceQuery.Builder<SearchTvShows, SearchTvQuery>(requestService, mappingService, apiKey)
					.setPath("/search/tv")
					.setModelClass(SearchTvShows.class)
					.build();
		 return r.setQuery(SearchTvQuery.QUERY, query);
	}
	
}
