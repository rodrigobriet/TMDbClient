package br.com.rodrigobriet.tmdbclient.core.resources.query;

public class AuthConfirmQuery extends QueryField {

	public static final AuthConfirmQuery SESSION_ID = new AuthConfirmQuery("session_id");
	public static final AuthConfirmQuery CONFIRM = new AuthConfirmQuery("confirm");
	
	public AuthConfirmQuery(String name) {
		super(name);
	}

}
