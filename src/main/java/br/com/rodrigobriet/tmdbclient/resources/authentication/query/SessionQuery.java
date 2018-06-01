package br.com.rodrigobriet.tmdbclient.resources.authentication.query;

import br.com.rodrigobriet.tmdbclient.core.resources.QueryField;

public class SessionQuery extends QueryField {
	
	public static final SessionQuery REQUEST_TOKEN = new SessionQuery("request_token");

	protected SessionQuery(String name) {
		super(name);
	}
	
}
