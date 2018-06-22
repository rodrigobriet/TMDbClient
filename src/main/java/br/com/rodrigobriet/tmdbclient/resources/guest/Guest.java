package br.com.rodrigobriet.tmdbclient.resources.guest;

import br.com.rodrigobriet.tmdbclient.core.mappings.interfaces.MappingService;
import br.com.rodrigobriet.tmdbclient.core.requests.interfaces.RequestService;
import br.com.rodrigobriet.tmdbclient.core.resources.ResourceQuery;
import br.com.rodrigobriet.tmdbclient.core.resources.ResourcesHolder;
import br.com.rodrigobriet.tmdbclient.core.resources.queries.SortedGuestQuery;
import br.com.rodrigobriet.tmdbclient.resources.guest.models.GuestRatedMovies;
import br.com.rodrigobriet.tmdbclient.resources.guest.models.GuestRatedTv;
import br.com.rodrigobriet.tmdbclient.resources.guest.models.GuestRatedTvEpisodes;

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
