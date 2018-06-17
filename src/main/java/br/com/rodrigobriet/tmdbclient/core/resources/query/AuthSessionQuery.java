package br.com.rodrigobriet.tmdbclient.core.resources.query;

public class AuthSessionQuery extends QueryField {

	public static final AuthSessionQuery SESSION_ID = new AuthSessionQuery("session_id");
	
	protected AuthSessionQuery(String name) {
		super(name);
	}

}
