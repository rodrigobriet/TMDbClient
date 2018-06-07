package br.com.rodrigobriet.tmdbclient.resources.discover;

import br.com.rodrigobriet.tmdbclient.core.mapping.GsonMapping;
import br.com.rodrigobriet.tmdbclient.core.requests.interfaces.RequestCallback;
import br.com.rodrigobriet.tmdbclient.core.requests.interfaces.RequestService;
import br.com.rodrigobriet.tmdbclient.core.resources.ResourceQuery;
import br.com.rodrigobriet.tmdbclient.resources.discover.models.MovieDiscoverResult;
import br.com.rodrigobriet.tmdbclient.resources.discover.query.MovieDiscoverQuery;

public class MovieDiscover {

	private ResourceQuery<MovieDiscoverResult, MovieDiscoverQuery> resource;
	
	public MovieDiscover(String apiKey, RequestService requestService) {
		resource = new ResourceQuery<>("/discover/movie", apiKey, requestService, new GsonMapping<>(MovieDiscoverResult.class));
	}
	
	public void request(RequestCallback<MovieDiscoverResult> callback) {
		resource.request(callback);
	}

	public MovieDiscover setLanguage(String value) {
		resource.setQuery(MovieDiscoverQuery.LANGUAGE, value);
		return this;
	}

	public MovieDiscover setRegion(String value) {
		resource.setQuery(MovieDiscoverQuery.REGION, value);
		return this;
	}

	public MovieDiscover setSortBy(String value) {
		resource.setQuery(MovieDiscoverQuery.SORT_BY, value);
		return this;
	}

	public MovieDiscover setCertificationCountry(String value) {
		resource.setQuery(MovieDiscoverQuery.CERTIFICATION_COUNTRY, value);
		return this;
	}

	public MovieDiscover setCertification(String value) {
		resource.setQuery(MovieDiscoverQuery.CERTIFICATION, value);
		return this;
	}

	public MovieDiscover setCertificationLTE(String value) {
		resource.setQuery(MovieDiscoverQuery.CERTIFICATION_LTE, value);
		return this;
	}

	public MovieDiscover setIncludeAdult(boolean value) {
		resource.setQuery(MovieDiscoverQuery.INCLUDE_ADULT, ""+value);
		return this;
	}

	public MovieDiscover setIncludeVideo(boolean value) {
		resource.setQuery(MovieDiscoverQuery.INCLUDE_VIDEO, ""+value);
		return this;
	}

	public MovieDiscover setPage(int value) {
		resource.setQuery(MovieDiscoverQuery.PAGE, ""+value);
		return this;
	}

	public MovieDiscover setPrimaryReleaseYear(int value) {
		resource.setQuery(MovieDiscoverQuery.PRIMARY_RELEASE_YEAR, ""+value);
		return this;
	}

	public MovieDiscover setPrimaryReleaseDateGte(String value) {
		resource.setQuery(MovieDiscoverQuery.PRIMARY_RELEASE_DATE_GTE, value);
		return this;
	}

	public MovieDiscover setPrimaryReleaseDateLTE(String value) {
		resource.setQuery(MovieDiscoverQuery.PRIMARY_RELEASE_DATE_LTE, value);
		return this;
	}

	public MovieDiscover setReleaseDateGte(String value) {
		resource.setQuery(MovieDiscoverQuery.RELEASE_DATE_GTE, value);
		return this;
	}

	public MovieDiscover setReleaseDateLTE(String value) {
		resource.setQuery(MovieDiscoverQuery.RELEASE_DATE_LTE, value);
		return this;
	}

	public MovieDiscover setVoteCountGte(int value) {
		resource.setQuery(MovieDiscoverQuery.VOTE_COUNT_GTE, ""+value);
		return this;
	}

	public MovieDiscover setVoteCountLTE(int value) {
		resource.setQuery(MovieDiscoverQuery.VOTE_COUNT_LTE, ""+value);
		return this;
	}

	public MovieDiscover setVoteAverageGte(float value) {
		resource.setQuery(MovieDiscoverQuery.VOTE_AVERAGE_GTE, ""+value);
		return this;
	}

	public MovieDiscover setVoteAverageLTE(float value) {
		resource.setQuery(MovieDiscoverQuery.VOTE_AVERAGE_LTE, ""+value);
		return this;
	}

	public MovieDiscover setWithCast(String value) {
		resource.setQuery(MovieDiscoverQuery.WITH_CAST, value);
		return this;
	}

	public MovieDiscover setWithCrew(String value) {
		resource.setQuery(MovieDiscoverQuery.WITH_CREW, value);
		return this;
	}

	public MovieDiscover setWithCompanies(String value) {
		resource.setQuery(MovieDiscoverQuery.WITH_COMPANIES, value);
		return this;
	}

	public MovieDiscover setWithGenres(String value) {
		resource.setQuery(MovieDiscoverQuery.WITH_GENRES, value);
		return this;
	}

	public MovieDiscover setWithKeywords(String value) {
		resource.setQuery(MovieDiscoverQuery.WITH_KEYWORDS, value);
		return this;
	}

	public MovieDiscover setWithPeople(String value) {
		resource.setQuery(MovieDiscoverQuery.WITH_PEOPLE, value);
		return this;
	}

	public MovieDiscover setYear(int value) {
		resource.setQuery(MovieDiscoverQuery.YEAR, ""+value);
		return this;
	}

	public MovieDiscover setWithoutGenres(String value) {
		resource.setQuery(MovieDiscoverQuery.WITHOUT_GENRES, value);
		return this;
	}

	public MovieDiscover setWithRuntimeGte(int value) {
		resource.setQuery(MovieDiscoverQuery.WITH_RUNTIME_GTE, ""+value);
		return this;
	}

	public MovieDiscover setWithRuntimeLTE(int value) {
		resource.setQuery(MovieDiscoverQuery.WITH_RUNTIME_LTE, ""+value);
		return this;
	}

	public MovieDiscover setWithReleaseType(int value) {
		resource.setQuery(MovieDiscoverQuery.WITH_RELEASE_TYPE, ""+value);
		return this;
	}

	public MovieDiscover setWithOriginalLanguage(String value) {
		resource.setQuery(MovieDiscoverQuery.WITH_ORIGINAL_LANGUAGE, value);
		return this;
	}

	public MovieDiscover setWithoutKeywords(String value) {
		resource.setQuery(MovieDiscoverQuery.WITHOUT_KEYWORDS, value);
		return this;
	}
	
}
