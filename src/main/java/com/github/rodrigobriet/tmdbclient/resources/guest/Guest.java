package com.github.rodrigobriet.tmdbclient.resources.guest;

import com.github.rodrigobriet.tmdbclient.core.mappings.interfaces.MappingService;
import com.github.rodrigobriet.tmdbclient.core.requests.interfaces.RequestService;
import com.github.rodrigobriet.tmdbclient.core.resources.ResourceQuery;
import com.github.rodrigobriet.tmdbclient.core.resources.ResourcesHolder;
import com.github.rodrigobriet.tmdbclient.core.resources.queries.SortedGuestQuery;
import com.github.rodrigobriet.tmdbclient.resources.guest.models.GuestRatedMovies;
import com.github.rodrigobriet.tmdbclient.resources.guest.models.GuestRatedTv;
import com.github.rodrigobriet.tmdbclient.resources.guest.models.GuestRatedTvEpisodes;

public class Guest extends ResourcesHolder {

	public Guest(String apiKey, RequestService requestService, MappingService mappingService) {
		super(apiKey, requestService, mappingService);
	}

	public ResourceQuery<GuestRatedMovies, SortedGuestQuery> getRatedMovies(String guestSessionId) {
		return new ResourceQuery.Builder<GuestRatedMovies, SortedGuestQuery>(requestService, mappingService, apiKey)
				.setPath("/guest_session/{guest_session_id}/rated/movies")
				.setPathValues(guestSessionId)
				.setModelClass(GuestRatedMovies.class)
				.build();
	}
	
	public ResourceQuery<GuestRatedTv, SortedGuestQuery> getRatedTv (String guestSessionId) {
		return new ResourceQuery.Builder<GuestRatedTv, SortedGuestQuery>(requestService, mappingService, apiKey)
				.setPath("/guest_session/{guest_session_id}/rated/tv")
				.setPathValues(guestSessionId)
				.setModelClass(GuestRatedTv.class)
				.build();
	}
	
	public ResourceQuery<GuestRatedTvEpisodes, SortedGuestQuery> getRatedTvEpisodes(String guestSessionId) {
		return new ResourceQuery.Builder<GuestRatedTvEpisodes, SortedGuestQuery>(requestService, mappingService, apiKey)
				.setPath("/guest_session/{guest_session_id}/rated/tv/episodes")
				.setPathValues(guestSessionId)
				.setModelClass(GuestRatedTvEpisodes.class)
				.build();
	}
}
