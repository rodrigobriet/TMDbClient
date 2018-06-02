package br.com.rodrigobriet.tmdbclient.resources.authentication;

import br.com.rodrigobriet.tmdbclient.core.mapping.GsonMapping;
import br.com.rodrigobriet.tmdbclient.core.requests.interfaces.RequestService;
import br.com.rodrigobriet.tmdbclient.core.resources.Resource;
import br.com.rodrigobriet.tmdbclient.core.resources.ResourceQuery;
import br.com.rodrigobriet.tmdbclient.core.resources.ResourcesConf;
import br.com.rodrigobriet.tmdbclient.resources.authentication.models.AuthenticationGuestSession;
import br.com.rodrigobriet.tmdbclient.resources.authentication.models.AuthenticationRequestToken;
import br.com.rodrigobriet.tmdbclient.resources.authentication.models.AuthenticationSession;
import br.com.rodrigobriet.tmdbclient.resources.authentication.query.AuthenticationSessionQuery;

public class Authentication extends ResourcesConf {
	
	public Authentication(String apiKey, RequestService requestService) {
		super(apiKey, requestService);
	}

	public Resource<AuthenticationRequestToken> createRequestToken() {
		return new Resource<>("/authentication/token/new", apiKey, requestService, new GsonMapping<>(AuthenticationRequestToken.class));
	}
	
	public ResourceQuery<AuthenticationSession, AuthenticationSessionQuery> createSession() {
		return new ResourceQuery<>("/authentication/session/new", apiKey, requestService, new GsonMapping<>(AuthenticationSession.class));
	}
	
	public Resource<AuthenticationGuestSession> createGuestSession() {
		return new Resource<>("/authentication/guest_session/new", apiKey, requestService, new GsonMapping<>(AuthenticationGuestSession.class));
	}

}
