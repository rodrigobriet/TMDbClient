package com.github.rodrigobriet.tmdbclient.resources.authentication;

import com.github.rodrigobriet.tmdbclient.core.mappings.interfaces.MappingService;
import com.github.rodrigobriet.tmdbclient.core.requests.interfaces.RequestService;
import com.github.rodrigobriet.tmdbclient.core.resources.Resource;
import com.github.rodrigobriet.tmdbclient.core.resources.ResourceQuery;
import com.github.rodrigobriet.tmdbclient.core.resources.ResourcesHolder;
import com.github.rodrigobriet.tmdbclient.resources.authentication.models.AuthenticationGuestSession;
import com.github.rodrigobriet.tmdbclient.resources.authentication.models.AuthenticationRequestToken;
import com.github.rodrigobriet.tmdbclient.resources.authentication.models.AuthenticationSession;
import com.github.rodrigobriet.tmdbclient.resources.authentication.query.AuthenticationSessionQuery;

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
