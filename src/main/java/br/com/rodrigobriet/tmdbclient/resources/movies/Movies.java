package br.com.rodrigobriet.tmdbclient.resources.movies;

import br.com.rodrigobriet.tmdbclient.core.mapping.GsonMapping;
import br.com.rodrigobriet.tmdbclient.core.requests.interfaces.RequestService;
import br.com.rodrigobriet.tmdbclient.core.resources.Resource;
import br.com.rodrigobriet.tmdbclient.core.resources.ResourceDelete;
import br.com.rodrigobriet.tmdbclient.core.resources.ResourcePost;
import br.com.rodrigobriet.tmdbclient.core.resources.ResourceQuery;
import br.com.rodrigobriet.tmdbclient.core.resources.ResourceQueryAppend;
import br.com.rodrigobriet.tmdbclient.core.resources.ResourcesConf;
import br.com.rodrigobriet.tmdbclient.core.resources.query.AuthSessionWithGuestQuery;
import br.com.rodrigobriet.tmdbclient.core.resources.query.CountryQuery;
import br.com.rodrigobriet.tmdbclient.core.resources.query.ImageQuery;
import br.com.rodrigobriet.tmdbclient.core.resources.query.LanguageQuery;
import br.com.rodrigobriet.tmdbclient.core.resources.query.MoviesDetailsAppendQuery;
import br.com.rodrigobriet.tmdbclient.core.resources.query.PaggedQuery;
import br.com.rodrigobriet.tmdbclient.core.resources.query.PaggedWithRegion;
import br.com.rodrigobriet.tmdbclient.resources.movies.appends.MoviesAppend;
import br.com.rodrigobriet.tmdbclient.resources.movies.models.MoviesAccountStates;
import br.com.rodrigobriet.tmdbclient.resources.movies.models.MoviesAlternativeTitles;
import br.com.rodrigobriet.tmdbclient.resources.movies.models.MoviesCredits;
import br.com.rodrigobriet.tmdbclient.resources.movies.models.MoviesDetails;
import br.com.rodrigobriet.tmdbclient.resources.movies.models.MoviesExternalIds;
import br.com.rodrigobriet.tmdbclient.resources.movies.models.MoviesImages;
import br.com.rodrigobriet.tmdbclient.resources.movies.models.MoviesKeywords;
import br.com.rodrigobriet.tmdbclient.resources.movies.models.MoviesLatest;
import br.com.rodrigobriet.tmdbclient.resources.movies.models.MoviesLists;
import br.com.rodrigobriet.tmdbclient.resources.movies.models.MoviesNowPlaying;
import br.com.rodrigobriet.tmdbclient.resources.movies.models.MoviesPopular;
import br.com.rodrigobriet.tmdbclient.resources.movies.models.MoviesRecommendations;
import br.com.rodrigobriet.tmdbclient.resources.movies.models.MoviesReleaseDates;
import br.com.rodrigobriet.tmdbclient.resources.movies.models.MoviesReviews;
import br.com.rodrigobriet.tmdbclient.resources.movies.models.MoviesSimilar;
import br.com.rodrigobriet.tmdbclient.resources.movies.models.MoviesTopRated;
import br.com.rodrigobriet.tmdbclient.resources.movies.models.MoviesTranslations;
import br.com.rodrigobriet.tmdbclient.resources.movies.models.MoviesUpcoming;
import br.com.rodrigobriet.tmdbclient.resources.movies.models.MoviesVideos;
import br.com.rodrigobriet.tmdbclient.resources.movies.requestbody.MoviesRate;

public class Movies extends ResourcesConf {

	public Movies(String apiKey, RequestService requestService) {
		super(apiKey, requestService);
	}

	public ResourceQueryAppend<MoviesDetails, LanguageQuery, MoviesAppend, MoviesDetailsAppendQuery> getDetails(int movieId, MoviesAppend ... appends) {
		ResourceQueryAppend<MoviesDetails, LanguageQuery, MoviesAppend, MoviesDetailsAppendQuery> r =
				new ResourceQueryAppend<>("/movie/{movie_id}", apiKey, requestService, new GsonMapping<>(MoviesDetails.class), movieId);
		
		for(MoviesAppend m: appends) {
			r.addAppend(m);
		}
		
		return r;
	}
	
	public ResourceQuery<MoviesAccountStates, AuthSessionWithGuestQuery> getAccountStates(int movieId) {
		return new ResourceQuery<>("/movie/{movie_id}/account_states", apiKey, requestService, new GsonMapping<>(MoviesAccountStates.class), movieId);
	}
	
	public ResourceQuery<MoviesAlternativeTitles, CountryQuery> getAlternativeTitles(int movieId) {
		return new ResourceQuery<>("/movie/{movie_id}/alternative_titles", apiKey, requestService, new GsonMapping<>(MoviesAlternativeTitles.class), movieId);
	}
	
	public Resource<MoviesCredits> getCredits(int movieId) {
		return new Resource<>("/movie/{movie_id}/credits", apiKey, requestService, new GsonMapping<>(MoviesCredits.class), movieId);
	}
	
	public Resource<MoviesExternalIds> getExternalIds(int movieId) {
		return new Resource<>("/movie/{movie_id}/external_ids", apiKey, requestService, new GsonMapping<>(MoviesExternalIds.class), movieId);
	}
	
	public ResourceQuery<MoviesImages, ImageQuery> getImages(int movieId) {
		return new ResourceQuery<>("/movie/{movie_id}/images", apiKey, requestService, new GsonMapping<>(MoviesImages.class), movieId);
	}
	
	public Resource<MoviesKeywords> getKeywords(int movieId) {
		return new Resource<>("/movie/{movie_id}/keywords", apiKey, requestService, new GsonMapping<>(MoviesKeywords.class), movieId);
	}
	
	public Resource<MoviesReleaseDates> getReleaseDates(int movieId) {
		return new Resource<>("/movie/{movie_id}/release_dates", apiKey, requestService, new GsonMapping<>(MoviesReleaseDates.class), movieId);
	}
	
	public ResourceQuery<MoviesVideos, ImageQuery> getVideos(int movieId) {
		return new ResourceQuery<>("/movie/{movie_id}/videos", apiKey, requestService, new GsonMapping<>(MoviesVideos.class), movieId);
	}
	
	public Resource<MoviesTranslations> getTranslations(int movieId) {
		return new Resource<>("/movie/{movie_id}/translations", apiKey, requestService, new GsonMapping<>(MoviesTranslations.class), movieId);
	}
	
	public ResourceQuery<MoviesRecommendations, PaggedQuery> getRecommendations(int movieId) {
		return new ResourceQuery<>("/movie/{movie_id}/recommendations", apiKey, requestService, new GsonMapping<>(MoviesRecommendations.class), movieId);
	}
	
	public ResourceQuery<MoviesSimilar, PaggedQuery> getSimilar(int movieId) {
		return new ResourceQuery<>("/movie/{movie_id}/similar", apiKey, requestService, new GsonMapping<>(MoviesSimilar.class), movieId);
	}
	
	public ResourceQuery<MoviesReviews, PaggedQuery> getReviews(int movieId) {
		return new ResourceQuery<>("/movie/{movie_id}/reviews", apiKey, requestService, new GsonMapping<>(MoviesReviews.class), movieId);
	}
	
	public ResourceQuery<MoviesLists, PaggedQuery> getLists(int movieId) {
		return new ResourceQuery<>("/movie/{movie_id}/lists", apiKey, requestService, new GsonMapping<>(MoviesLists.class), movieId);
	}
	
	public ResourceQuery<MoviesLatest, LanguageQuery> getLatest() {
		return new ResourceQuery<>("/movie/latest", apiKey, requestService, new GsonMapping<>(MoviesLatest.class));
	}
	
	public ResourceQuery<MoviesNowPlaying, PaggedWithRegion> getNowPlaying() {
		return new ResourceQuery<>("/movie/now_playing", apiKey, requestService, new GsonMapping<>(MoviesNowPlaying.class));
	}
	
	public ResourceQuery<MoviesPopular, PaggedWithRegion> getPopular() {
		return new ResourceQuery<>("/movie/popular", apiKey, requestService, new GsonMapping<>(MoviesPopular.class));
	}
	
	public ResourceQuery<MoviesTopRated, PaggedWithRegion> getTopRated() {
		return new ResourceQuery<>("/movie/top_rated", apiKey, requestService, new GsonMapping<>(MoviesTopRated.class));
	}
	
	public ResourceQuery<MoviesUpcoming, PaggedWithRegion> getUpcoming() {
		return new ResourceQuery<>("/movie/upcoming", apiKey, requestService, new GsonMapping<>(MoviesUpcoming.class));
	}
	
	public ResourceDelete<AuthSessionWithGuestQuery> deleteRating(int movieId) {
		return new ResourceDelete<>("/movie/{movie_id}/rating", apiKey, requestService, movieId);
	}
	
	public ResourcePost<AuthSessionWithGuestQuery, MoviesRate> rate(int movieId, float rate) {
		MoviesRate body = new MoviesRate(rate);
		return new ResourcePost<AuthSessionWithGuestQuery, MoviesRate>("/movie/{movie_id}/rating", apiKey, requestService, body, movieId);
	}
	
}
