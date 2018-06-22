package br.com.rodrigobriet.tmdbclient.resources.tvepisodes;

import java.lang.reflect.Type;

import com.google.gson.reflect.TypeToken;

import br.com.rodrigobriet.tmdbclient.core.mappings.interfaces.MappingService;
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
import br.com.rodrigobriet.tmdbclient.core.resources.queries.TvDetailsEpisodesAndSeasonsQuery;
import br.com.rodrigobriet.tmdbclient.resources.tvepisodes.appends.TvEpisodesAppend;
import br.com.rodrigobriet.tmdbclient.resources.tvepisodes.models.TvEpisodesAccountStates;
import br.com.rodrigobriet.tmdbclient.resources.tvepisodes.models.TvEpisodesCredits;
import br.com.rodrigobriet.tmdbclient.resources.tvepisodes.models.TvEpisodesDetails;
import br.com.rodrigobriet.tmdbclient.resources.tvepisodes.models.TvEpisodesExternalIds;
import br.com.rodrigobriet.tmdbclient.resources.tvepisodes.models.TvEpisodesImages;
import br.com.rodrigobriet.tmdbclient.resources.tvepisodes.models.submodels.TvEpisodesTranslationsItemData;

public class TvEpisodes extends ResourcesHolder {

	public TvEpisodes(String apiKey, RequestService requestService, MappingService mappingService) {
		super(apiKey, requestService, mappingService);
	}

	public ResourceAppend<TvEpisodesDetails, TvDetailsEpisodesAndSeasonsQuery, TvEpisodesAppend> getDetails(int tvId, int seasonNumber, int episodeNumber, TvEpisodesAppend ... appends) {
		ResourceAppend<TvEpisodesDetails, TvDetailsEpisodesAndSeasonsQuery, TvEpisodesAppend> r = new ResourceAppend.Builder<TvEpisodesDetails, TvDetailsEpisodesAndSeasonsQuery, TvEpisodesAppend>(requestService, mappingService, apiKey)
				.setPath("/tv/{tv_id}/season/{season_number}/episode/{episode_number}")
				.setPathValues(""+tvId, ""+seasonNumber, ""+episodeNumber)
				.setModelClass(TvEpisodesDetails.class)
				.build();
		
		for(TvEpisodesAppend t: appends) {
			r.addAppend(t);
		}
		
		return r;
	}
	
	public ResourceQuery<TvEpisodesAccountStates, AuthSessionWithGuestQuery> getAccountStates(int tvId, int seasonNumber, int episodeNumber) {
		return new ResourceQuery.Builder<TvEpisodesAccountStates, AuthSessionWithGuestQuery>(requestService, mappingService, apiKey)
				.setPath("/tv/{tv_id}/season/{season_number}/episode/{episode_number}/account_states")
				.setPathValues(""+tvId, ""+seasonNumber, ""+episodeNumber)
				.setModelClass(TvEpisodesAccountStates.class)
				.build();
	}
	
	public Resource<TvEpisodesCredits> getCredits(int tvId, int seasonNumber, int episodeNumber) {
		return new Resource.Builder<TvEpisodesCredits>(requestService, mappingService, apiKey)
				.setPath("/tv/{tv_id}/season/{season_number}/episode/{episode_number}/credits")
				.setPathValues(""+tvId, ""+seasonNumber, ""+episodeNumber)
				.setModelClass(TvEpisodesCredits.class)
				.build();
	}
	
	public ResourceQuery<TvEpisodesExternalIds, LanguageQuery> getExternalIds(int tvId, int seasonNumber, int episodeNumber) {
		return new ResourceQuery.Builder<TvEpisodesExternalIds, LanguageQuery>(requestService, mappingService, apiKey)
				.setPath("/tv/{tv_id}/season/{season_number}/episode/{episode_number}/external_ids")
				.setPathValues(""+tvId, ""+seasonNumber, ""+episodeNumber)
				.setModelClass(TvEpisodesExternalIds.class)
				.build();
	}
	
	public ResourceQuery<TvEpisodesImages, ImageQuery> getImages(int tvId, int seasonNumber, int episodeNumber) {
		return new ResourceQuery.Builder<TvEpisodesImages, ImageQuery>(requestService, mappingService, apiKey)
				.setPath("/tv/{tv_id}/season/{season_number}/episode/{episode_number}/images")
				.setPathValues(""+tvId, ""+seasonNumber, ""+episodeNumber)
				.setModelClass(TvEpisodesImages.class)
				.build();
	}
	
	public Resource<Translations<TvEpisodesTranslationsItemData>> getTranslations(int tvId, int seasonNumber, int episodeNumber) {
		Type type = TypeToken.getParameterized(Translations.class, TvEpisodesTranslationsItemData.class).getType();
		return new Resource.Builder<Translations<TvEpisodesTranslationsItemData>>(requestService, mappingService, apiKey)
				.setPath("/tv/{tv_id}/season/{season_number}/episode/{episode_number}/translations")
				.setPathValues(""+tvId, ""+seasonNumber, ""+episodeNumber)
				.setModelClass(type)
				.build();
	}
	
	public ResourceQuery<Videos, LanguageQuery> getVideos(int tvId, int seasonNumber, int episodeNumber) {
		return new ResourceQuery.Builder<Videos, LanguageQuery>(requestService, mappingService, apiKey)
				.setPath("/tv/{tv_id}/season/{season_number}/episode/{episode_number}/videos")
				.setPathValues(""+tvId, ""+seasonNumber, ""+episodeNumber)
				.setModelClass(Videos.class)
				.build();
	}
	
	public ResourceQuery<StatusMessage, AuthSessionWithGuestQuery> rate(int tvId, int seasonNumber, int episodeNumber, float rate) {
		Rate body = new Rate(rate);
		return new ResourceQuery.Builder<StatusMessage, AuthSessionWithGuestQuery>(requestService, mappingService, apiKey)
				.setPath("/tv/{tv_id}/season/{season_number}/episode/{episode_number}/rating")
				.setPathValues(""+tvId, ""+seasonNumber, ""+episodeNumber)
				.setModelClass(StatusMessage.class)
				.setBodyContent(body)
				.setResourceMethod(ResourceMethod.POST)
				.build();
	}
	
	public ResourceQuery<StatusMessage, AuthSessionWithGuestQuery> deleteRate(int tvId, int seasonNumber, int episodeNumber) {
		return new ResourceQuery.Builder<StatusMessage, AuthSessionWithGuestQuery>(requestService, mappingService, apiKey)
				.setPath("/tv/{tv_id}/season/{season_number}/episode/{episode_number}/rating")
				.setPathValues(""+tvId, ""+seasonNumber, ""+episodeNumber)
				.setModelClass(StatusMessage.class)
				.setResourceMethod(ResourceMethod.DELETE)
				.build();
	}
	
}
