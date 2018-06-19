package br.com.rodrigobriet.tmdbclient.resources.tv;

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
import br.com.rodrigobriet.tmdbclient.core.resources.query.ImageQuery;
import br.com.rodrigobriet.tmdbclient.core.resources.query.LanguageQuery;
import br.com.rodrigobriet.tmdbclient.core.resources.query.PaggedQuery;
import br.com.rodrigobriet.tmdbclient.resources.tv.appends.TvAppend;
import br.com.rodrigobriet.tmdbclient.resources.tv.appends.TvDetailsAppendQuery;
import br.com.rodrigobriet.tmdbclient.resources.tv.models.TvAiringToday;
import br.com.rodrigobriet.tmdbclient.resources.tv.models.TvContentRatings;
import br.com.rodrigobriet.tmdbclient.resources.tv.models.TvDetails;
import br.com.rodrigobriet.tmdbclient.resources.tv.models.TvExternalIds;
import br.com.rodrigobriet.tmdbclient.resources.tv.models.TvLatest;
import br.com.rodrigobriet.tmdbclient.resources.tv.models.TvOnTheAir;
import br.com.rodrigobriet.tmdbclient.resources.tv.models.TvPopular;
import br.com.rodrigobriet.tmdbclient.resources.tv.models.TvRecommendations;
import br.com.rodrigobriet.tmdbclient.resources.tv.models.TvScreenedTheatrically;
import br.com.rodrigobriet.tmdbclient.resources.tv.models.TvSimilar;
import br.com.rodrigobriet.tmdbclient.resources.tv.models.TvTopRated;
import br.com.rodrigobriet.tmdbclient.resources.tv.models.submodels.TvTranslationsItemData;

public class Tv extends ResourcesConf {

	public Tv(String apiKey, RequestService requestService) {
		super(apiKey, requestService);
	}

	public ResourceQueryAppend<TvDetails, LanguageQuery, TvAppend, TvDetailsAppendQuery> getDetails(int tvId, TvAppend ... appends) {
		ResourceQueryAppend<TvDetails, LanguageQuery, TvAppend, TvDetailsAppendQuery> r =
				new ResourceQueryAppend<>("/tv/{tv_id}", apiKey, requestService, new GsonMapping<>(TvDetails.class), tvId);
		
		for(TvAppend t:appends) {
			r.addAppend(t);
		}
		
		return r;
	}
	
	public ResourceQuery<AccountStates, AuthSessionWithGuestQuery> getAccountStates(int tvId) {
		return new ResourceQuery<>("/tv/{tv_id}/account_states", apiKey, requestService, new GsonMapping<>(AccountStates.class), tvId);
	}
	
	public ResourceQuery<AlternativeTitles, LanguageQuery> getAlternativeTitles(int tvId) {
		return new ResourceQuery<>("/tv/{tv_id}/alternative_titles", apiKey, requestService, new GsonMapping<>(AlternativeTitles.class), tvId);
	}
	
	public ResourceQuery<TvContentRatings, LanguageQuery> getContentRatings(int tvId) {
		return new ResourceQuery<>("/tv/{tv_id}/content_ratings", apiKey, requestService, new GsonMapping<>(TvContentRatings.class), tvId);
	}
	
	public ResourceQuery<Credits, LanguageQuery> getCredits(int tvId) {
		return new ResourceQuery<>("/tv/{tv_id}/credits", apiKey, requestService, new GsonMapping<>(Credits.class), tvId);
	}
	
	public ResourceQuery<TvExternalIds, LanguageQuery> getExternalIds(int tvId) {
		return new ResourceQuery<>("/tv/{tv_id}/external_ids", apiKey, requestService, new GsonMapping<>(TvExternalIds.class), tvId);
	}
	
	public ResourceQuery<Images, ImageQuery> getImages(int tvId) {
		return new ResourceQuery<>("/tv/{tv_id}/images", apiKey, requestService, new GsonMapping<>(Images.class), tvId);
	}
	
	public Resource<Keywords> getKeywords(int tvId) {
		return new Resource<>("/tv/{tv_id}/keywords", apiKey, requestService, new GsonMapping<>(Keywords.class), tvId);
	}
	
	public ResourceQuery<TvRecommendations, PaggedQuery> getRecommendations(int tvId) {
		return new ResourceQuery<>("/tv/{tv_id}/recommendations", apiKey, requestService, new GsonMapping<>(TvRecommendations.class), tvId);
	}
	
	public ResourceQuery<Reviews, PaggedQuery> getReviews(int tvId) {
		return new ResourceQuery<>("/tv/{tv_id}/reviews", apiKey, requestService, new GsonMapping<>(Reviews.class), tvId);
	}
	
	public Resource<TvScreenedTheatrically> getScreenedTheatrically(int tvId) {
		return new Resource<>("/tv/{tv_id}/screened_theatrically", apiKey, requestService, new GsonMapping<>(TvScreenedTheatrically.class), tvId);
	}
	
	public ResourceQuery<TvSimilar, PaggedQuery> getSimilar(int tvId) {
		return new ResourceQuery<>("/tv/{tv_id}/similar", apiKey, requestService, new GsonMapping<>(TvSimilar.class), tvId);
	}
	
	public ResourceQuery<Translations<TvTranslationsItemData>, LanguageQuery> getTranslations(int tvId) {
		Type type = TypeToken.getParameterized(Translations.class, TvTranslationsItemData.class).getType();
		return new ResourceQuery<>("/tv/{tv_id}/translations", apiKey, requestService, new GsonMapping<>(type), tvId);
	}
	
	public ResourceQuery<Videos, LanguageQuery> getVideos(int tvId) {
		return new ResourceQuery<>("/tv/{tv_id}/videos", apiKey, requestService, new GsonMapping<>(Videos.class), tvId);
	}
	
	public ResourceQuery<TvLatest, LanguageQuery> getLatest() {
		return new ResourceQuery<>("/tv/latest", apiKey, requestService, new GsonMapping<>(TvLatest.class));
	}
	
	public ResourceQuery<TvAiringToday, PaggedQuery> getAiringToday() {
		return new ResourceQuery<>("/tv/airing_today", apiKey, requestService, new GsonMapping<>(TvAiringToday.class));
	}
	
	public ResourceQuery<TvOnTheAir, PaggedQuery> getOnTheAir() {
		return new ResourceQuery<>("/tv/on_the_air", apiKey, requestService, new GsonMapping<>(TvOnTheAir.class));
	}
	
	public ResourceQuery<TvPopular, PaggedQuery> getPopular() {
		return new ResourceQuery<>("/tv/popular", apiKey, requestService, new GsonMapping<>(TvPopular.class));
	}
	
	public ResourceQuery<TvTopRated, PaggedQuery> getTopRated() {
		return new ResourceQuery<>("/tv/top_rated", apiKey, requestService, new GsonMapping<>(TvTopRated.class));
	}
	
	public ResourcePost<AuthSessionWithGuestQuery, Rate> rate(int tvId, float rate) {
		Rate body = new Rate(rate);
		return new ResourcePost<>("/tv/{tv_id}/rating", apiKey, requestService, body, tvId);
	}
	
	public ResourceDelete<AuthSessionWithGuestQuery> deleteRate(int tvId) {
		return new ResourceDelete<>("/tv/{tv_id}/rating", apiKey, requestService, tvId);
	}
	
}
