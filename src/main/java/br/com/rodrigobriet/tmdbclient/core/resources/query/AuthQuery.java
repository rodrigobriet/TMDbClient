package br.com.rodrigobriet.tmdbclient.core.resources.query;

public class AuthQuery extends QueryField {

	public static final AuthQuery SESSION_ID = new AuthQuery("session_id");
	
	protected AuthQuery(String name) {
		super(name);
	}

}
