package br.com.rodrigobriet.tmdbclient.resources.tvseasons;

import br.com.rodrigobriet.tmdbclient.core.mapping.GsonMapping;
import br.com.rodrigobriet.tmdbclient.core.models.global.Credits;
import br.com.rodrigobriet.tmdbclient.core.models.global.Videos;
import br.com.rodrigobriet.tmdbclient.core.requests.interfaces.RequestService;
import br.com.rodrigobriet.tmdbclient.core.resources.ResourceQuery;
import br.com.rodrigobriet.tmdbclient.core.resources.ResourceQueryAppend;
import br.com.rodrigobriet.tmdbclient.core.resources.ResourcesConf;
import br.com.rodrigobriet.tmdbclient.core.resources.query.AuthSessionWithGuestQuery;
import br.com.rodrigobriet.tmdbclient.core.resources.query.LanguageQuery;
import br.com.rodrigobriet.tmdbclient.resources.tvseasons.appends.TvSeasonsAppend;
import br.com.rodrigobriet.tmdbclient.resources.tvseasons.appends.TvSeasonsDetailsAppendQuery;
import br.com.rodrigobriet.tmdbclient.resources.tvseasons.models.TvSeasonsAccountStates;
import br.com.rodrigobriet.tmdbclient.resources.tvseasons.models.TvSeasonsDetails;
import br.com.rodrigobriet.tmdbclient.resources.tvseasons.models.TvSeasonsExternalIds;
import br.com.rodrigobriet.tmdbclient.resources.tvseasons.models.TvSeasonsImages;

public class TvSeasons extends ResourcesConf {

	public TvSeasons(String apiKey, RequestService requestService) {
		super(apiKey, requestService);
	}
	
	public ResourceQueryAppend<TvSeasonsDetails, LanguageQuery, TvSeasonsAppend, TvSeasonsDetailsAppendQuery> getDetails(int tvId, int seasonNumber, TvSeasonsAppend ... appends) {
		ResourceQueryAppend<TvSeasonsDetails, LanguageQuery, TvSeasonsAppend, TvSeasonsDetailsAppendQuery> r =
				new ResourceQueryAppend<>("/tv/{tv_id}/season/{season_number}", apiKey, requestService, new GsonMapping<>(TvSeasonsDetails.class), tvId, seasonNumber);
		
		for(TvSeasonsAppend t:appends) {
			r.addAppend(t);
		}
		
		return r;
	}
	
	public ResourceQuery<TvSeasonsAccountStates, AuthSessionWithGuestQuery> getAccountStates(int tvId, int seasonNumber) {
		return new ResourceQuery<>("/tv/{tv_id}/season/{season_number}/account_states", apiKey, requestService, new GsonMapping<>(TvSeasonsAccountStates.class), tvId, seasonNumber);
	}
	
	public ResourceQuery<Credits, LanguageQuery> getCredits(int tvId, int seasonNumber) {
		return new ResourceQuery<>("/tv/{tv_id}/season/{season_number}/credits", apiKey, requestService, new GsonMapping<>(Credits.class), tvId, seasonNumber);
	}
	
	public ResourceQuery<TvSeasonsExternalIds, LanguageQuery> getExternalIds(int tvId, int seasonNumber) {
		return new ResourceQuery<>("/tv/{tv_id}/season/{season_number}/external_ids", apiKey, requestService, new GsonMapping<>(TvSeasonsExternalIds.class), tvId, seasonNumber);
	}
	
	public ResourceQuery<TvSeasonsImages, LanguageQuery> getImages(int tvId, int seasonNumber) {
		return new ResourceQuery<>("/tv/{tv_id}/season/{season_number}/images", apiKey, requestService, new GsonMapping<>(TvSeasonsImages.class), tvId, seasonNumber);
	}
	
	public ResourceQuery<Videos, LanguageQuery> getVideos(int tvId, int seasonNumber) {
		return new ResourceQuery<>("/tv/{tv_id}/season/{season_number}/videos", apiKey, requestService, new GsonMapping<>(Videos.class), tvId, seasonNumber);
	}
	
}
