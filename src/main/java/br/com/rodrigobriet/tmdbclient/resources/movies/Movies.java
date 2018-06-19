package br.com.rodrigobriet.tmdbclient.resources.movies;

import java.lang.reflect.Type;

import com.google.gson.reflect.TypeToken;

import br.com.rodrigobriet.tmdbclient.core.mapping.GsonMapping;
import br.com.rodrigobriet.tmdbclient.core.models.global.AccountStates;
import br.com.rodrigobriet.tmdbclient.core.models.global.AlternativeTitles;
import br.com.rodrigobriet.tmdbclient.core.models.global.Credits;
import br.com.rodrigobriet.tmdbclient.core.models.global.Images;
import br.com.rodrigobriet.tmdbclient.core.models.global.Keywords;
import br.com.rodrigobriet.tmdbclient.core.models.global.Reviews;
import br.com.rodrigobriet.tmdbclient.core.models.global.Translations;
import br.com.rodrigobriet.tmdbclient.core.models.global.Videos;
import br.com.rodrigobriet.tmdbclient.core.models.global.requestbody.Rate;
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
import br.com.rodrigobriet.tmdbclient.core.resources.query.PaggedQuery;
import br.com.rodrigobriet.tmdbclient.core.resources.query.PaggedWithRegionQuery;
import br.com.rodrigobriet.tmdbclient.resources.movies.appends.MoviesAppend;
import br.com.rodrigobriet.tmdbclient.resources.movies.appends.MoviesDetailsAppendQuery;
import br.com.rodrigobriet.tmdbclient.resources.movies.models.MoviesDetails;
import br.com.rodrigobriet.tmdbclient.resources.movies.models.MoviesExternalIds;
import br.com.rodrigobriet.tmdbclient.resources.movies.models.MoviesLatest;
import br.com.rodrigobriet.tmdbclient.resources.movies.models.MoviesLists;
import br.com.rodrigobriet.tmdbclient.resources.movies.models.MoviesNowPlaying;
import br.com.rodrigobriet.tmdbclient.resources.movies.models.MoviesPopular;
import br.com.rodrigobriet.tmdbclient.resources.movies.models.MoviesRecommendations;
import br.com.rodrigobriet.tmdbclient.resources.movies.models.MoviesReleaseDates;
import br.com.rodrigobriet.tmdbclient.resources.movies.models.MoviesSimilar;
import br.com.rodrigobriet.tmdbclient.resources.movies.models.MoviesTopRated;
import br.com.rodrigobriet.tmdbclient.resources.movies.models.submodels.MoviesTranslationsItemData;
import br.com.rodrigobriet.tmdbclient.resources.movies.models.MoviesUpcoming;

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
	
	public ResourceQuery<AccountStates, AuthSessionWithGuestQuery> getAccountStates(int movieId) {
		return new ResourceQuery<>("/movie/{movie_id}/account_states", apiKey, requestService, new GsonMapping<>(AccountStates.class), movieId);
	}
	
	public ResourceQuery<AlternativeTitles, CountryQuery> getAlternativeTitles(int movieId) {
		return new ResourceQuery<>("/movie/{movie_id}/alternative_titles", apiKey, requestService, new GsonMapping<>(AlternativeTitles.class), movieId);
	}
	
	public Resource<Credits> getCredits(int movieId) {
		return new Resource<>("/movie/{movie_id}/credits", apiKey, requestService, new GsonMapping<>(Credits.class), movieId);
	}
	
	public Resource<MoviesExternalIds> getExternalIds(int movieId) {
		return new Resource<>("/movie/{movie_id}/external_ids", apiKey, requestService, new GsonMapping<>(MoviesExternalIds.class), movieId);
	}
	
	public ResourceQuery<Images, ImageQuery> getImages(int movieId) {
		return new ResourceQuery<>("/movie/{movie_id}/images", apiKey, requestService, new GsonMapping<>(Images.class), movieId);
	}
	
	public Resource<Keywords> getKeywords(int movieId) {
		return new Resource<>("/movie/{movie_id}/keywords", apiKey, requestService, new GsonMapping<>(Keywords.class), movieId);
	}
	
	public Resource<MoviesReleaseDates> getReleaseDates(int movieId) {
		return new Resource<>("/movie/{movie_id}/release_dates", apiKey, requestService, new GsonMapping<>(MoviesReleaseDates.class), movieId);
	}
	
	public ResourceQuery<Videos, ImageQuery> getVideos(int movieId) {
		return new ResourceQuery<>("/movie/{movie_id}/videos", apiKey, requestService, new GsonMapping<>(Videos.class), movieId);
	}
	
	public Resource<Translations<MoviesTranslationsItemData>> getTranslations(int movieId) {
		Type type = TypeToken.getParameterized(Translations.class, MoviesTranslationsItemData.class).getType();
		return new Resource<>("/movie/{movie_id}/translations", apiKey, requestService, new GsonMapping<>(type), movieId);
	}
	
	public ResourceQuery<MoviesRecommendations, PaggedQuery> getRecommendations(int movieId) {
		return new ResourceQuery<>("/movie/{movie_id}/recommendations", apiKey, requestService, new GsonMapping<>(MoviesRecommendations.class), movieId);
	}
	
	public ResourceQuery<MoviesSimilar, PaggedQuery> getSimilar(int movieId) {
		return new ResourceQuery<>("/movie/{movie_id}/similar", apiKey, requestService, new GsonMapping<>(MoviesSimilar.class), movieId);
	}
	
	public ResourceQuery<Reviews, PaggedQuery> getReviews(int movieId) {
		return new ResourceQuery<>("/movie/{movie_id}/reviews", apiKey, requestService, new GsonMapping<>(Reviews.class), movieId);
	}
	
	public ResourceQuery<MoviesLists, PaggedQuery> getLists(int movieId) {
		return new ResourceQuery<>("/movie/{movie_id}/lists", apiKey, requestService, new GsonMapping<>(MoviesLists.class), movieId);
	}
	
	public ResourceQuery<MoviesLatest, LanguageQuery> getLatest() {
		return new ResourceQuery<>("/movie/latest", apiKey, requestService, new GsonMapping<>(MoviesLatest.class));
	}
	
	public ResourceQuery<MoviesNowPlaying, PaggedWithRegionQuery> getNowPlaying() {
		return new ResourceQuery<>("/movie/now_playing", apiKey, requestService, new GsonMapping<>(MoviesNowPlaying.class));
	}
	
	public ResourceQuery<MoviesPopular, PaggedWithRegionQuery> getPopular() {
		return new ResourceQuery<>("/movie/popular", apiKey, requestService, new GsonMapping<>(MoviesPopular.class));
	}
	
	public ResourceQuery<MoviesTopRated, PaggedWithRegionQuery> getTopRated() {
		return new ResourceQuery<>("/movie/top_rated", apiKey, requestService, new GsonMapping<>(MoviesTopRated.class));
	}
	
	public ResourceQuery<MoviesUpcoming, PaggedWithRegionQuery> getUpcoming() {
		return new ResourceQuery<>("/movie/upcoming", apiKey, requestService, new GsonMapping<>(MoviesUpcoming.class));
	}
	
	public ResourceDelete<AuthSessionWithGuestQuery> deleteRating(int movieId) {
		return new ResourceDelete<>("/movie/{movie_id}/rating", apiKey, requestService, movieId);
	}
	
	public ResourcePost<AuthSessionWithGuestQuery, Rate> rate(int movieId, float rate) {
		Rate body = new Rate(rate);
		return new ResourcePost<AuthSessionWithGuestQuery, Rate>("/movie/{movie_id}/rating", apiKey, requestService, body, movieId);
	}
	
}
