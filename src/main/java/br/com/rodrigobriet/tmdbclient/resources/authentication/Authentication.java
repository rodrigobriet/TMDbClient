package br.com.rodrigobriet.tmdbclient.resources.authentication;

import br.com.rodrigobriet.tmdbclient.core.mapping.GsonMapping;
import br.com.rodrigobriet.tmdbclient.core.requests.RequestService;
import br.com.rodrigobriet.tmdbclient.core.resources.Resource;
import br.com.rodrigobriet.tmdbclient.core.resources.ResourceQuery;
import br.com.rodrigobriet.tmdbclient.resources.authentication.models.GuestSession;
import br.com.rodrigobriet.tmdbclient.resources.authentication.models.RequestToken;
import br.com.rodrigobriet.tmdbclient.resources.authentication.models.Session;
import br.com.rodrigobriet.tmdbclient.resources.authentication.query.SessionQuery;

public class Authentication {
	
	private String apiKey;
	private RequestService requestService;
	
	public Authentication(String apiKey, RequestService requestService) {
		this.apiKey = apiKey;
		this.requestService = requestService;
	}

	public Resource<RequestToken> createRequestToken() {
		return new Resource<>("/authentication/token/new", apiKey, requestService, new GsonMapping<>(RequestToken.class));
	}
	
	public ResourceQuery<Session, SessionQuery> createSession() {
		return new ResourceQuery<>("/authentication/session/new", apiKey, requestService, new GsonMapping<>(Session.class));
	}
	
	public Resource<GuestSession> createGuestSession() {
		return new Resource<>("/authentication/guest_session/new", apiKey, requestService, new GsonMapping<>(GuestSession.class));
	}

}
