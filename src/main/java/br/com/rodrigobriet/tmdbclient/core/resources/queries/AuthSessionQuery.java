package br.com.rodrigobriet.tmdbclient.core.resources.queries;

public class AuthSessionQuery extends AbstractQueryField {

	public static final AuthSessionQuery SESSION_ID = new AuthSessionQuery("session_id");
	
	protected AuthSessionQuery(String name) {
		super(name);
	}

}
