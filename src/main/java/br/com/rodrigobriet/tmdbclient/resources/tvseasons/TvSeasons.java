package br.com.rodrigobriet.tmdbclient.resources.tvseasons;

import br.com.rodrigobriet.tmdbclient.core.mappings.interfaces.MappingService;
import br.com.rodrigobriet.tmdbclient.core.models.Credits;
import br.com.rodrigobriet.tmdbclient.core.models.Videos;
import br.com.rodrigobriet.tmdbclient.core.requests.interfaces.RequestService;
import br.com.rodrigobriet.tmdbclient.core.resources.ResourceAppend;
import br.com.rodrigobriet.tmdbclient.core.resources.ResourceQuery;
import br.com.rodrigobriet.tmdbclient.core.resources.ResourcesHolder;
import br.com.rodrigobriet.tmdbclient.core.resources.queries.AuthSessionWithGuestQuery;
import br.com.rodrigobriet.tmdbclient.core.resources.queries.LanguageQuery;
import br.com.rodrigobriet.tmdbclient.core.resources.queries.TvDetailsEpisodesAndSeasonsQuery;
import br.com.rodrigobriet.tmdbclient.resources.tvseasons.appends.TvSeasonsAppend;
import br.com.rodrigobriet.tmdbclient.resources.tvseasons.models.TvSeasonsAccountStates;
import br.com.rodrigobriet.tmdbclient.resources.tvseasons.models.TvSeasonsDetails;
import br.com.rodrigobriet.tmdbclient.resources.tvseasons.models.TvSeasonsExternalIds;
import br.com.rodrigobriet.tmdbclient.resources.tvseasons.models.TvSeasonsImages;

public class TvSeasons extends ResourcesHolder {

	public TvSeasons(String apiKey, RequestService requestService, MappingService mappingService) {
		super(apiKey, requestService, mappingService);
	}
	
	public ResourceAppend<TvSeasonsDetails, TvDetailsEpisodesAndSeasonsQuery, TvSeasonsAppend> getDetails(int tvId, int seasonNumber, TvSeasonsAppend ... appends) {
		ResourceAppend<TvSeasonsDetails, TvDetailsEpisodesAndSeasonsQuery, TvSeasonsAppend> r = new ResourceAppend.Builder<TvSeasonsDetails, TvDetailsEpisodesAndSeasonsQuery, TvSeasonsAppend>(requestService, mappingService, apiKey)
				.setPath("/tv/{tv_id}/season/{season_number}")
				.setPathValues(""+tvId, ""+seasonNumber)
				.setModelClass(TvSeasonsDetails.class)
				.build();
		
		for(TvSeasonsAppend t:appends) {
			r.addAppend(t);
		}
		
		return r;
	}
	
	public ResourceQuery<TvSeasonsAccountStates, AuthSessionWithGuestQuery> getAccountStates(int tvId, int seasonNumber) {
		return new ResourceQuery.Builder<TvSeasonsAccountStates, AuthSessionWithGuestQuery>(requestService, mappingService, apiKey)
				.setPath("/tv/{tv_id}/season/{season_number}/account_states")
				.setPathValues(""+tvId, ""+seasonNumber)
				.setModelClass(TvSeasonsAccountStates.class)
				.build();
	}
	
	public ResourceQuery<Credits, LanguageQuery> getCredits(int tvId, int seasonNumber) {
		return new ResourceQuery.Builder<Credits, LanguageQuery>(requestService, mappingService, apiKey)
				.setPath("/tv/{tv_id}/season/{season_number}/credits")
				.setPathValues(""+tvId, ""+seasonNumber)
				.setModelClass(Credits.class)
				.build();
	}
	
	public ResourceQuery<TvSeasonsExternalIds, LanguageQuery> getExternalIds(int tvId, int seasonNumber) {
		return new ResourceQuery.Builder<TvSeasonsExternalIds, LanguageQuery>(requestService, mappingService, apiKey)
				.setPath("/tv/{tv_id}/season/{season_number}/external_ids")
				.setPathValues(""+tvId, ""+seasonNumber)
				.setModelClass(TvSeasonsExternalIds.class)
				.build();
	}
	
	public ResourceQuery<TvSeasonsImages, LanguageQuery> getImages(int tvId, int seasonNumber) {
		return new ResourceQuery.Builder<TvSeasonsImages, LanguageQuery>(requestService, mappingService, apiKey)
				.setPath("/tv/{tv_id}/season/{season_number}/images")
				.setPathValues(""+tvId, ""+seasonNumber)
				.setModelClass(TvSeasonsImages.class)
				.build();
	}
	
	public ResourceQuery<Videos, LanguageQuery> getVideos(int tvId, int seasonNumber) {
		return new ResourceQuery.Builder<Videos, LanguageQuery>(requestService, mappingService, apiKey)
				.setPath("/tv/{tv_id}/season/{season_number}/videos")
				.setPathValues(""+tvId, ""+seasonNumber)
				.setModelClass(Videos.class)
				.build();
	}
	
}
