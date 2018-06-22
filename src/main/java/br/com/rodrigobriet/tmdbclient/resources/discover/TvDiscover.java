package br.com.rodrigobriet.tmdbclient.resources.discover;

import br.com.rodrigobriet.tmdbclient.core.mappings.interfaces.MappingService;
import br.com.rodrigobriet.tmdbclient.core.requests.interfaces.RequestCallback;
import br.com.rodrigobriet.tmdbclient.core.requests.interfaces.RequestService;
import br.com.rodrigobriet.tmdbclient.core.resources.ResourceQuery;
import br.com.rodrigobriet.tmdbclient.resources.discover.models.TvDiscoverResult;
import br.com.rodrigobriet.tmdbclient.resources.discover.query.TvDiscoverQuery;

public class TvDiscover {

private ResourceQuery<TvDiscoverResult, TvDiscoverQuery> resource;
	
	public TvDiscover(String apiKey, RequestService requestService, MappingService mappingService) {
		resource = new ResourceQuery.Builder<TvDiscoverResult, TvDiscoverQuery>(requestService, mappingService, apiKey)
				.setPath("/discover/tv")
				.setModelClass(TvDiscoverResult.class)
				.build();
	}
	
	public void request(RequestCallback<TvDiscoverResult> callback) {
		resource.request(callback);
	}
	
	public TvDiscover setLanguage(String value) {
		resource.setQuery(TvDiscoverQuery.LANGUAGE, value);
		return this;
	}

	public TvDiscover setSortBy(String value) {
		resource.setQuery(TvDiscoverQuery.SORT_BY, value);
		return this;
	}

	public TvDiscover setAirDateGte(String value) {
		resource.setQuery(TvDiscoverQuery.AIR_DATE_GTE, value);
		return this;
	}

	public TvDiscover setAirDateLTE(String value) {
		resource.setQuery(TvDiscoverQuery.AIR_DATE_LTE, value);
		return this;
	}

	public TvDiscover setFirstAirDateGte(String value) {
		resource.setQuery(TvDiscoverQuery.FIRST_AIR_DATE_GTE, value);
		return this;
	}

	public TvDiscover setFirstAirDateLTE(String value) {
		resource.setQuery(TvDiscoverQuery.FIRST_AIR_DATE_LTE, value);
		return this;
	}

	public TvDiscover setFirstAirDateYear(int value) {
		resource.setQuery(TvDiscoverQuery.FIRST_AIR_DATE_YEAR, ""+value);
		return this;
	}

	public TvDiscover setPage(int value) {
		resource.setQuery(TvDiscoverQuery.PAGE, ""+value);
		return this;
	}

	public TvDiscover setTimezone(String value) {
		resource.setQuery(TvDiscoverQuery.TIMEZONE, value);
		return this;
	}

	public TvDiscover setVoteAverageGte(float value) {
		resource.setQuery(TvDiscoverQuery.VOTE_AVERAGE_GTE, ""+value);
		return this;
	}

	public TvDiscover setVoteCountGte(int value) {
		resource.setQuery(TvDiscoverQuery.VOTE_COUNT_GTE, ""+value);
		return this;
	}

	public TvDiscover setWithGenres(String value) {
		resource.setQuery(TvDiscoverQuery.WITH_GENRES, value);
		return this;
	}

	public TvDiscover setWithNetworks(String value) {
		resource.setQuery(TvDiscoverQuery.WITH_NETWORKS, value);
		return this;
	}

	public TvDiscover setWithoutGenres(String value) {
		resource.setQuery(TvDiscoverQuery.WITHOUT_GENRES, value);
		return this;
	}

	public TvDiscover setWithRuntimeGte(int value) {
		resource.setQuery(TvDiscoverQuery.WITH_RUNTIME_GTE, ""+value);
		return this;
	}

	public TvDiscover setWithRuntimeLTE(int value) {
		resource.setQuery(TvDiscoverQuery.WITH_RUNTIME_LTE, ""+value);
		return this;
	}

	public TvDiscover setIncludeNullFirstAirDates(boolean value) {
		resource.setQuery(TvDiscoverQuery.INCLUDE_NULL_FIRST_AIR_DATES, ""+value);
		return this;
	}

	public TvDiscover setWithOriginalLanguage(String value) {
		resource.setQuery(TvDiscoverQuery.WITH_ORIGINAL_LANGUAGE, value);
		return this;
	}

	public TvDiscover setWithoutKeywords(String value) {
		resource.setQuery(TvDiscoverQuery.WITHOUT_KEYWORDS, value);
		return this;
	}

	public TvDiscover setScreenedTheatrically(boolean value) {
		resource.setQuery(TvDiscoverQuery.SCREENED_THEATRICALLY, ""+value);
		return this;
	}

	public TvDiscover setWithCompanies(String value) {
		resource.setQuery(TvDiscoverQuery.WITH_COMPANIES, value);
		return this;
	}
	
}
