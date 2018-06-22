package br.com.rodrigobriet.tmdbclient.resources.movies;

import java.lang.reflect.Type;

import com.google.gson.reflect.TypeToken;

import br.com.rodrigobriet.tmdbclient.core.mappings.interfaces.MappingService;
import br.com.rodrigobriet.tmdbclient.core.models.AccountStates;
import br.com.rodrigobriet.tmdbclient.core.models.AlternativeTitles;
import br.com.rodrigobriet.tmdbclient.core.models.Credits;
import br.com.rodrigobriet.tmdbclient.core.models.Images;
import br.com.rodrigobriet.tmdbclient.core.models.Keywords;
import br.com.rodrigobriet.tmdbclient.core.models.Reviews;
import br.com.rodrigobriet.tmdbclient.core.models.StatusMessage;
import br.com.rodrigobriet.tmdbclient.core.models.Translations;
import br.com.rodrigobriet.tmdbclient.core.models.Videos;
import br.com.rodrigobriet.tmdbclient.core.models.requestbody.Rate;
import br.com.rodrigobriet.tmdbclient.core.requests.interfaces.RequestService;
import br.com.rodrigobriet.tmdbclient.core.resources.Resource;
import br.com.rodrigobriet.tmdbclient.core.resources.ResourceAppend;
import br.com.rodrigobriet.tmdbclient.core.resources.ResourceMethod;
import br.com.rodrigobriet.tmdbclient.core.resources.ResourceQuery;
import br.com.rodrigobriet.tmdbclient.core.resources.ResourcesHolder;
import br.com.rodrigobriet.tmdbclient.core.resources.queries.AuthSessionWithGuestQuery;
import br.com.rodrigobriet.tmdbclient.core.resources.queries.CountryQuery;
import br.com.rodrigobriet.tmdbclient.core.resources.queries.ImageQuery;
import br.com.rodrigobriet.tmdbclient.core.resources.queries.LanguageQuery;
import br.com.rodrigobriet.tmdbclient.core.resources.queries.MoviesDetailsQuery;
import br.com.rodrigobriet.tmdbclient.core.resources.queries.PaggedQuery;
import br.com.rodrigobriet.tmdbclient.core.resources.queries.PaggedWithRegionQuery;
import br.com.rodrigobriet.tmdbclient.resources.movies.appends.MoviesAppend;
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
import br.com.rodrigobriet.tmdbclient.resources.movies.models.MoviesUpcoming;
import br.com.rodrigobriet.tmdbclient.resources.movies.models.submodels.MoviesTranslationsItemData;

public class Movies extends ResourcesHolder {
	
	public Movies(String apiKey, RequestService requestService, MappingService mappingService) {
		super(apiKey, requestService, mappingService);
	}

	public ResourceAppend<MoviesDetails, MoviesDetailsQuery, MoviesAppend> getDetails(int movieId, MoviesAppend ... appends) {
		ResourceAppend<MoviesDetails, MoviesDetailsQuery, MoviesAppend> r = new ResourceAppend.Builder<MoviesDetails, MoviesDetailsQuery, MoviesAppend>(requestService, mappingService, apiKey)
				.setPath("/movie/{movie_id}")
				.setPathValues(""+movieId)
				.setModelClass(MoviesDetails.class)
				.build();
		
		for(MoviesAppend m: appends) {
			r.addAppend(m);
		}
		
		return r;
	}
	
	public ResourceQuery<AccountStates, AuthSessionWithGuestQuery> getAccountStates(int movieId) {
		return new ResourceQuery.Builder<AccountStates, AuthSessionWithGuestQuery>(requestService, mappingService, apiKey)
				.setPath("/movie/{movie_id}/account_states")
				.setPathValues(""+movieId)
				.setModelClass(AccountStates.class)
				.build();
	}
	
	public ResourceQuery<AlternativeTitles, CountryQuery> getAlternativeTitles(int movieId) {
		return new ResourceQuery.Builder<AlternativeTitles, CountryQuery>(requestService, mappingService, apiKey)
				.setPath("/movie/{movie_id}/alternative_titles")
				.setPathValues(""+movieId)
				.setModelClass(AlternativeTitles.class)
				.build();
	}
	
	public Resource<Credits> getCredits(int movieId) {
		return new Resource.Builder<Credits>(requestService, mappingService, apiKey)
				.setPath("/movie/{movie_id}/credits")
				.setPathValues(""+movieId)
				.setModelClass(Credits.class)
				.build();
	}
	
	public Resource<MoviesExternalIds> getExternalIds(int movieId) {
		return new Resource.Builder<MoviesExternalIds>(requestService, mappingService, apiKey)
				.setPath("/movie/{movie_id}/external_ids")
				.setPathValues(""+movieId)
				.setModelClass(MoviesExternalIds.class)
				.build();
	}
	
	public ResourceQuery<Images, ImageQuery> getImages(int movieId) {
		return new ResourceQuery.Builder<Images, ImageQuery>(requestService, mappingService, apiKey)
				.setPath("/movie/{movie_id}/images")
				.setPathValues(""+movieId)
				.setModelClass(Images.class)
				.build();
	}
	
	public Resource<Keywords> getKeywords(int movieId) {
		return new Resource.Builder<Keywords>(requestService, mappingService, apiKey)
				.setPath("/movie/{movie_id}/keywords")
				.setPathValues(""+movieId)
				.setModelClass(Keywords.class)
				.build();
	}
	
	public Resource<MoviesReleaseDates> getReleaseDates(int movieId) {
		return new Resource.Builder<MoviesReleaseDates>(requestService, mappingService, apiKey)
				.setPath("/movie/{movie_id}/release_dates")
				.setPathValues(""+movieId)
				.setModelClass(MoviesReleaseDates.class)
				.build();
	}
	
	public ResourceQuery<Videos, LanguageQuery> getVideos(int movieId) {
		return new ResourceQuery.Builder<Videos, LanguageQuery>(requestService, mappingService, apiKey)
				.setPath("/movie/{movie_id}/videos")
				.setPathValues(""+movieId)
				.setModelClass(Videos.class)
				.build();
	}
	
	public Resource<Translations<MoviesTranslationsItemData>> getTranslations(int movieId) {
		Type type = TypeToken.getParameterized(Translations.class, MoviesTranslationsItemData.class).getType();
		return new Resource.Builder<Translations<MoviesTranslationsItemData>>(requestService, mappingService, apiKey)
				.setPath("/movie/{movie_id}/translations")
				.setPathValues(""+movieId)
				.setModelClass(type)
				.build();
	}
	
	public ResourceQuery<MoviesRecommendations, PaggedQuery> getRecommendations(int movieId) {
		return new ResourceQuery.Builder<MoviesRecommendations, PaggedQuery>(requestService, mappingService, apiKey)
				.setPath("/movie/{movie_id}/recommendations")
				.setPathValues(""+movieId)
				.setModelClass(Videos.class)
				.build();
	}
	
	public ResourceQuery<MoviesSimilar, PaggedQuery> getSimilar(int movieId) {
		return new ResourceQuery.Builder<MoviesSimilar, PaggedQuery>(requestService, mappingService, apiKey)
				.setPath("/movie/{movie_id}/similar")
				.setPathValues(""+movieId)
				.setModelClass(MoviesSimilar.class)
				.build();
	}
	
	public ResourceQuery<Reviews, PaggedQuery> getReviews(int movieId) {
		return new ResourceQuery.Builder<Reviews, PaggedQuery>(requestService, mappingService, apiKey)
				.setPath("/movie/{movie_id}/reviews")
				.setPathValues(""+movieId)
				.setModelClass(Reviews.class)
				.build();
	}
	
	public ResourceQuery<MoviesLists, PaggedQuery> getLists(int movieId) {
		return new ResourceQuery.Builder<MoviesLists, PaggedQuery>(requestService, mappingService, apiKey)
				.setPath("/movie/{movie_id}/lists")
				.setPathValues(""+movieId)
				.setModelClass(MoviesLists.class)
				.build();
	}
	
	public ResourceQuery<MoviesLatest, LanguageQuery> getLatest() {
		return new ResourceQuery.Builder<MoviesLatest, LanguageQuery>(requestService, mappingService, apiKey)
				.setPath("/movie/latest")
				.setModelClass(MoviesLatest.class)
				.build();
	}
	
	public ResourceQuery<MoviesNowPlaying, PaggedWithRegionQuery> getNowPlaying() {
		return new ResourceQuery.Builder<MoviesNowPlaying, PaggedWithRegionQuery>(requestService, mappingService, apiKey)
				.setPath("/movie/now_playing")
				.setModelClass(MoviesNowPlaying.class)
				.build();
	}
	
	public ResourceQuery<MoviesPopular, PaggedWithRegionQuery> getPopular() {
		return new ResourceQuery.Builder<MoviesPopular, PaggedWithRegionQuery>(requestService, mappingService, apiKey)
				.setPath("/movie/popular")
				.setModelClass(MoviesPopular.class)
				.build();
	}
	
	public ResourceQuery<MoviesTopRated, PaggedWithRegionQuery> getTopRated() {
		return new ResourceQuery.Builder<MoviesTopRated, PaggedWithRegionQuery>(requestService, mappingService, apiKey)
				.setPath("/movie/top_rated")
				.setModelClass(MoviesTopRated.class)
				.build();
	}
	
	public ResourceQuery<MoviesUpcoming, PaggedWithRegionQuery> getUpcoming() {
		return new ResourceQuery.Builder<MoviesUpcoming, PaggedWithRegionQuery>(requestService, mappingService, apiKey)
				.setPath("/movie/upcoming")
				.setModelClass(MoviesUpcoming.class)
				.build();
	}
	
	public ResourceQuery<StatusMessage, AuthSessionWithGuestQuery> rate(int movieId, float rate) {
		Rate body = new Rate(rate);
		return new ResourceQuery.Builder<StatusMessage, AuthSessionWithGuestQuery>(requestService, mappingService, apiKey)
				.setPath("/movie/{movie_id}/rating")
				.setPathValues(""+movieId)
				.setModelClass(StatusMessage.class)
				.setBodyContent(body)
				.setResourceMethod(ResourceMethod.POST)
				.build();
	}
	
	public ResourceQuery<StatusMessage, AuthSessionWithGuestQuery> deleteRating(int movieId) {
		return new ResourceQuery.Builder<StatusMessage, AuthSessionWithGuestQuery>(requestService, mappingService, apiKey)
				.setPath("/movie/{movie_id}/rating")
				.setPathValues(""+movieId)
				.setModelClass(StatusMessage.class)
				.setResourceMethod(ResourceMethod.DELETE)
				.build();
	}
	
}
