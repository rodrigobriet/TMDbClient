package br.com.rodrigobriet.tmdbclient.resources.tvepisodes;

import java.lang.reflect.Type;

import com.google.gson.reflect.TypeToken;

import br.com.rodrigobriet.tmdbclient.core.mapping.GsonMapping;
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
import br.com.rodrigobriet.tmdbclient.resources.tv.appends.TvDetailsAppendQuery;
import br.com.rodrigobriet.tmdbclient.resources.tvepisodes.appends.TvEpisodesAppend;
import br.com.rodrigobriet.tmdbclient.resources.tvepisodes.models.TvEpisodesAccountStates;
import br.com.rodrigobriet.tmdbclient.resources.tvepisodes.models.TvEpisodesCredits;
import br.com.rodrigobriet.tmdbclient.resources.tvepisodes.models.TvEpisodesDetails;
import br.com.rodrigobriet.tmdbclient.resources.tvepisodes.models.TvEpisodesExternalIds;
import br.com.rodrigobriet.tmdbclient.resources.tvepisodes.models.TvEpisodesImages;
import br.com.rodrigobriet.tmdbclient.resources.tvepisodes.models.submodels.TvEpisodesTranslationsItemData;

public class TvEpisodes extends ResourcesConf {

	public TvEpisodes(String apiKey, RequestService requestService) {
		super(apiKey, requestService);
	}

	public ResourceQueryAppend<TvEpisodesDetails, LanguageQuery, TvEpisodesAppend, TvDetailsAppendQuery> getDetails(int tvId, int seasonNumber, int episodeNumber, TvEpisodesAppend ... appends) {
		ResourceQueryAppend<TvEpisodesDetails, LanguageQuery, TvEpisodesAppend, TvDetailsAppendQuery> r =
				new ResourceQueryAppend<>("/tv/{tv_id}/season/{season_number}/episode/{episode_number}", apiKey, requestService, new GsonMapping<>(TvEpisodesDetails.class), tvId, seasonNumber, episodeNumber);
		
		for(TvEpisodesAppend t: appends) {
			r.addAppend(t);
		}
		
		return r;
	}
	
	public ResourceQuery<TvEpisodesAccountStates, AuthSessionWithGuestQuery> getAccountStates(int tvId, int seasonNumber, int episodeNumber) {
		return new ResourceQuery<>("/tv/{tv_id}/season/{season_number}/episode/{episode_number}/account_states", apiKey, requestService, new GsonMapping<>(TvEpisodesAccountStates.class), tvId, seasonNumber, episodeNumber);
	}
	
	public Resource<TvEpisodesCredits> getCredits(int tvId, int seasonNumber, int episodeNumber) {
		return new Resource<>("/tv/{tv_id}/season/{season_number}/episode/{episode_number}/credits", apiKey, requestService, new GsonMapping<>(TvEpisodesCredits.class), tvId, seasonNumber, episodeNumber);
	}
	
	public ResourceQuery<TvEpisodesExternalIds, LanguageQuery> getExternalIds(int tvId, int seasonNumber, int episodeNumber) {
		return new ResourceQuery<>("/tv/{tv_id}/season/{season_number}/episode/{episode_number}/external_ids", apiKey, requestService, new GsonMapping<>(TvEpisodesExternalIds.class), tvId, seasonNumber, episodeNumber);
	}
	
	public ResourceQuery<TvEpisodesImages, ImageQuery> getImages(int tvId, int seasonNumber, int episodeNumber) {
		return new ResourceQuery<>("/tv/{tv_id}/season/{season_number}/episode/{episode_number}/images", apiKey, requestService, new GsonMapping<>(TvEpisodesImages.class), tvId, seasonNumber, episodeNumber);
	}
	
	public Resource<Translations<TvEpisodesTranslationsItemData>> getTranslations(int tvId, int seasonNumber, int episodeNumber) {
		Type type = TypeToken.getParameterized(Translations.class, TvEpisodesTranslationsItemData.class).getType();
		return new Resource<>("/tv/{tv_id}/season/{season_number}/episode/{episode_number}/translations", apiKey, requestService, new GsonMapping<>(type), tvId, seasonNumber, episodeNumber);
	}
	
	public ResourceQuery<Videos, LanguageQuery> getVideos(int tvId, int seasonNumber, int episodeNumber) {
		return new ResourceQuery<>("/tv/{tv_id}/season/{season_number}/episode/{episode_number}/videos", apiKey, requestService, new GsonMapping<>(Videos.class), tvId, seasonNumber, episodeNumber);
	}
	
	public ResourcePost<AuthSessionWithGuestQuery, Rate> rate(int tvId, int seasonNumber, int episodeNumber, float rate) {
		Rate body = new Rate(rate);
		return new ResourcePost<AuthSessionWithGuestQuery, Rate>("/tv/{tv_id}/season/{season_number}/episode/{episode_number}/rating", apiKey, requestService, body, tvId, seasonNumber, episodeNumber);
	}
	
	public ResourceDelete<AuthSessionWithGuestQuery> deleteRate(int tvId, int seasonNumber, int episodeNumber) {
		return new ResourceDelete<>("/tv/{tv_id}/season/{season_number}/episode/{episode_number}/rating", apiKey, requestService, tvId, seasonNumber, episodeNumber);
	}
	
}
