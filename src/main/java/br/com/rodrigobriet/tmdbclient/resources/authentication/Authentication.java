package br.com.rodrigobriet.tmdbclient.resources.authentication;

import br.com.rodrigobriet.tmdbclient.core.mappings.interfaces.MappingService;
import br.com.rodrigobriet.tmdbclient.core.requests.interfaces.RequestService;
import br.com.rodrigobriet.tmdbclient.core.resources.Resource;
import br.com.rodrigobriet.tmdbclient.core.resources.ResourceQuery;
import br.com.rodrigobriet.tmdbclient.core.resources.ResourcesHolder;
import br.com.rodrigobriet.tmdbclient.resources.authentication.models.AuthenticationGuestSession;
import br.com.rodrigobriet.tmdbclient.resources.authentication.models.AuthenticationRequestToken;
import br.com.rodrigobriet.tmdbclient.resources.authentication.models.AuthenticationSession;
import br.com.rodrigobriet.tmdbclient.resources.authentication.query.AuthenticationSessionQuery;

public class Authentication extends ResourcesHolder {
	
	public Authentication(String apiKey, RequestService requestService, MappingService mappingService) {
		super(apiKey, requestService, mappingService);
	}

	public Resource<AuthenticationRequestToken> createRequestToken() {
		return new Resource.Builder<AuthenticationRequestToken>(requestService, mappingService, apiKey)
				.setPath("/authentication/token/new")
				.setModelClass(AuthenticationRequestToken.class)
				.build();
	}
	
	public ResourceQuery<AuthenticationSession, AuthenticationSessionQuery> createSession() {
		return new ResourceQuery.Builder<AuthenticationSession, AuthenticationSessionQuery>(requestService, mappingService, apiKey)
				.setPath("/authentication/session/new")
				.setModelClass(AuthenticationSession.class)
				.build();
	}
	
	public Resource<AuthenticationGuestSession> createGuestSession() {
		return new Resource.Builder<AuthenticationGuestSession>(requestService, mappingService, apiKey)
				.setPath("/authentication/guest_session/new")
				.setModelClass(AuthenticationGuestSession.class)
				.build();
	}

}
