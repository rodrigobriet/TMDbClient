package br.com.rodrigobriet.tmdbclient.resources.tv;

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
import br.com.rodrigobriet.tmdbclient.core.resources.queries.ImageQuery;
import br.com.rodrigobriet.tmdbclient.core.resources.queries.LanguageQuery;
import br.com.rodrigobriet.tmdbclient.core.resources.queries.PaggedQuery;
import br.com.rodrigobriet.tmdbclient.core.resources.queries.TvDetailsQuery;
import br.com.rodrigobriet.tmdbclient.resources.tv.appends.TvAppend;
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

public class Tv extends ResourcesHolder {

	public Tv(String apiKey, RequestService requestService, MappingService mappingService) {
		super(apiKey, requestService, mappingService);
	}

	public ResourceAppend<TvDetails, TvDetailsQuery, TvAppend> getDetails(int tvId, TvAppend ... appends) {
		ResourceAppend<TvDetails, TvDetailsQuery, TvAppend> r = new ResourceAppend.Builder<TvDetails, TvDetailsQuery, TvAppend>(requestService, mappingService, apiKey)
				.setPath("/tv/{tv_id}")
				.setPathValues(""+tvId)
				.setModelClass(TvDetails.class)
				.build();
		
		for(TvAppend t:appends) {
			r.addAppend(t);
		}
		
		return r;
	}
	
	public ResourceQuery<AccountStates, AuthSessionWithGuestQuery> getAccountStates(int tvId) {
		return new ResourceQuery.Builder<AccountStates, AuthSessionWithGuestQuery>(requestService, mappingService, apiKey)
				.setPath("/tv/{tv_id}/account_states")
				.setPathValues(""+tvId)
				.setModelClass(AccountStates.class)
				.build();
	}
	
	public ResourceQuery<AlternativeTitles, LanguageQuery> getAlternativeTitles(int tvId) {
		return new ResourceQuery.Builder<AlternativeTitles, LanguageQuery>(requestService, mappingService, apiKey)
				.setPath("/tv/{tv_id}/alternative_titles")
				.setPathValues(""+tvId)
				.setModelClass(AlternativeTitles.class)
				.build();
	}
	
	public ResourceQuery<TvContentRatings, LanguageQuery> getContentRatings(int tvId) {
		return new ResourceQuery.Builder<TvContentRatings, LanguageQuery>(requestService, mappingService, apiKey)
				.setPath("/tv/{tv_id}/content_ratings")
				.setPathValues(""+tvId)
				.setModelClass(TvContentRatings.class)
				.build();
	}
	
	public ResourceQuery<Credits, LanguageQuery> getCredits(int tvId) {
		return new ResourceQuery.Builder<Credits, LanguageQuery>(requestService, mappingService, apiKey)
				.setPath("/tv/{tv_id}/credits")
				.setPathValues(""+tvId)
				.setModelClass(Credits.class)
				.build();
	}
	
	public ResourceQuery<TvExternalIds, LanguageQuery> getExternalIds(int tvId) {
		return new ResourceQuery.Builder<TvExternalIds, LanguageQuery>(requestService, mappingService, apiKey)
				.setPath("/tv/{tv_id}/external_ids")
				.setPathValues(""+tvId)
				.setModelClass(TvExternalIds.class)
				.build();
	}
	
	public ResourceQuery<Images, ImageQuery> getImages(int tvId) {
		return new ResourceQuery.Builder<Images, ImageQuery>(requestService, mappingService, apiKey)
				.setPath("/tv/{tv_id}/images")
				.setPathValues(""+tvId)
				.setModelClass(Images.class)
				.build();
	}
	
	public Resource<Keywords> getKeywords(int tvId) {
		return new Resource.Builder<Keywords>(requestService, mappingService, apiKey)
				.setPath("/tv/{tv_id}/keywords")
				.setPathValues(""+tvId)
				.setModelClass(Keywords.class)
				.build();
	}
	
	public ResourceQuery<TvRecommendations, PaggedQuery> getRecommendations(int tvId) {
		return new ResourceQuery.Builder<TvRecommendations, PaggedQuery>(requestService, mappingService, apiKey)
				.setPath("/tv/{tv_id}/recommendations")
				.setPathValues(""+tvId)
				.setModelClass(TvRecommendations.class)
				.build();
	}
	
	public ResourceQuery<Reviews, PaggedQuery> getReviews(int tvId) {
		return new ResourceQuery.Builder<Reviews, PaggedQuery>(requestService, mappingService, apiKey)
				.setPath("/tv/{tv_id}/reviews")
				.setPathValues(""+tvId)
				.setModelClass(Reviews.class)
				.build();
	}
	
	public Resource<TvScreenedTheatrically> getScreenedTheatrically(int tvId) {
		return new Resource.Builder<TvScreenedTheatrically>(requestService, mappingService, apiKey)
				.setPath("/tv/{tv_id}/screened_theatrically")
				.setPathValues(""+tvId)
				.setModelClass(TvScreenedTheatrically.class)
				.build();
	}
	
	public ResourceQuery<TvSimilar, PaggedQuery> getSimilar(int tvId) {
		return new ResourceQuery.Builder<TvSimilar, PaggedQuery>(requestService, mappingService, apiKey)
				.setPath("/tv/{tv_id}/similar")
				.setPathValues(""+tvId)
				.setModelClass(TvSimilar.class)
				.build();
	}
	
	public ResourceQuery<Translations<TvTranslationsItemData>, LanguageQuery> getTranslations(int tvId) {
		Type type = TypeToken.getParameterized(Translations.class, TvTranslationsItemData.class).getType();
		return new ResourceQuery.Builder<Translations<TvTranslationsItemData>, LanguageQuery>(requestService, mappingService, apiKey)
				.setPath("/tv/{tv_id}/translations")
				.setPathValues(""+tvId)
				.setModelClass(type)
				.build();
	}
	
	public ResourceQuery<Videos, LanguageQuery> getVideos(int tvId) {
		return new ResourceQuery.Builder<Videos, LanguageQuery>(requestService, mappingService, apiKey)
				.setPath("/tv/{tv_id}/videos")
				.setPathValues(""+tvId)
				.setModelClass(Videos.class)
				.build();
	}
	
	public ResourceQuery<TvLatest, LanguageQuery> getLatest() {
		return new ResourceQuery.Builder<TvLatest, LanguageQuery>(requestService, mappingService, apiKey)
				.setPath("/tv/latest")
				.setModelClass(TvLatest.class)
				.build();
	}
	
	public ResourceQuery<TvAiringToday, PaggedQuery> getAiringToday() {
		return new ResourceQuery.Builder<TvAiringToday, PaggedQuery>(requestService, mappingService, apiKey)
				.setPath("/tv/airing_today")
				.setModelClass(TvAiringToday.class)
				.build();
	}
	
	public ResourceQuery<TvOnTheAir, PaggedQuery> getOnTheAir() {
		return new ResourceQuery.Builder<TvOnTheAir, PaggedQuery>(requestService, mappingService, apiKey)
				.setPath("/tv/on_the_air")
				.setModelClass(TvOnTheAir.class)
				.build();
	}
	
	public ResourceQuery<TvPopular, PaggedQuery> getPopular() {
		return new ResourceQuery.Builder<TvPopular, PaggedQuery>(requestService, mappingService, apiKey)
				.setPath("/tv/popular")
				.setModelClass(TvPopular.class)
				.build();
	}
	
	public ResourceQuery<TvTopRated, PaggedQuery> getTopRated() {
		return new ResourceQuery.Builder<TvTopRated, PaggedQuery>(requestService, mappingService, apiKey)
				.setPath("/tv/top_rated")
				.setModelClass(TvTopRated.class)
				.build();
	}
	
	public ResourceQuery<StatusMessage, AuthSessionWithGuestQuery> rate(int tvId, float rate) {
		Rate body = new Rate(rate);
		return new ResourceQuery.Builder<StatusMessage, AuthSessionWithGuestQuery>(requestService, mappingService, apiKey)
				.setPath("/tv/{tv_id}/rating")
				.setPathValues(""+tvId)
				.setModelClass(StatusMessage.class)
				.setBodyContent(body)
				.setResourceMethod(ResourceMethod.POST)
				.build();
	}
	
	public ResourceQuery<StatusMessage, AuthSessionWithGuestQuery> deleteRate(int tvId) {
		return new ResourceQuery.Builder<StatusMessage, AuthSessionWithGuestQuery>(requestService, mappingService, apiKey)
				.setPath("/tv/{tv_id}/rating")
				.setPathValues(""+tvId)
				.setModelClass(StatusMessage.class)
				.setResourceMethod(ResourceMethod.DELETE)
				.build();
	}
	
}
