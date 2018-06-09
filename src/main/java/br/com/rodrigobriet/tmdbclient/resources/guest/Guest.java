package br.com.rodrigobriet.tmdbclient.resources.guest;

import br.com.rodrigobriet.tmdbclient.core.mapping.GsonMapping;
import br.com.rodrigobriet.tmdbclient.core.requests.interfaces.RequestService;
import br.com.rodrigobriet.tmdbclient.core.resources.ResourceQuery;
import br.com.rodrigobriet.tmdbclient.core.resources.ResourcesConf;
import br.com.rodrigobriet.tmdbclient.core.resources.query.SortedGuestQuery;
import br.com.rodrigobriet.tmdbclient.resources.guest.models.GuestRatedMovies;
import br.com.rodrigobriet.tmdbclient.resources.guest.models.GuestRatedTv;
import br.com.rodrigobriet.tmdbclient.resources.guest.models.GuestRatedTvEpisodes;

public class Guest extends ResourcesConf {

	public Guest(String apiKey, RequestService requestService) {
		super(apiKey, requestService);
	}

	public ResourceQuery<GuestRatedMovies, SortedGuestQuery> getRatedMovies(String guestSessionId) {
		return new ResourceQuery<>("/guest_session/{guest_session_id}/rated/movies", apiKey, requestService, new GsonMapping<>(GuestRatedMovies.class), guestSessionId);
	}
	
	public ResourceQuery<GuestRatedTv, SortedGuestQuery> getRatedTv (String guestSessionId) {
		return new ResourceQuery<>("/guest_session/{guest_session_id}/rated/tv", apiKey, requestService, new GsonMapping<>(GuestRatedTv.class), guestSessionId);
	}
	
	public ResourceQuery<GuestRatedTvEpisodes, SortedGuestQuery> getRatedTvEpisodes(String guestSessionId) {
		return new ResourceQuery<>("/guest_session/{guest_session_id}/rated/tv/episodes", apiKey, requestService, new GsonMapping<>(GuestRatedTvEpisodes.class), guestSessionId);
	}
}
