package com.github.rodrigobriet.tmdbclient.resources.authentication.query;

import com.github.rodrigobriet.tmdbclient.core.resources.queries.AbstractQueryField;

public class AuthenticationSessionQuery extends AbstractQueryField {
	
	public static final AuthenticationSessionQuery REQUEST_TOKEN = new AuthenticationSessionQuery("request_token");

	protected AuthenticationSessionQuery(String name) {
		super(name);
	}
	
}
