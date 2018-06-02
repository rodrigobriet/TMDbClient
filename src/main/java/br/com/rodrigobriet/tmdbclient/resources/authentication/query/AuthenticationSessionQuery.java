package br.com.rodrigobriet.tmdbclient.resources.authentication.query;

import br.com.rodrigobriet.tmdbclient.core.resources.query.QueryField;

public class AuthenticationSessionQuery extends QueryField {
	
	public static final AuthenticationSessionQuery REQUEST_TOKEN = new AuthenticationSessionQuery("request_token");

	protected AuthenticationSessionQuery(String name) {
		super(name);
	}
	
}
