package br.com.rodrigobriet.tmdbclient.core.resources.queries;

public class AuthConfirmQuery extends AbstractQueryField {

	public static final AuthConfirmQuery SESSION_ID = new AuthConfirmQuery("session_id");
	public static final AuthConfirmQuery CONFIRM = new AuthConfirmQuery("confirm");
	
	public AuthConfirmQuery(String name) {
		super(name);
	}

}
