package br.com.rodrigobriet.tmdbclient.core.resources.query;

public class AuthSessionWithGuestQuery extends QueryField {

	public static final AuthSessionWithGuestQuery SESSION_ID = new AuthSessionWithGuestQuery("session_id");
	public static final AuthSessionWithGuestQuery GUEST_SESSION_ID = new AuthSessionWithGuestQuery("guest_session_id");
	
	protected AuthSessionWithGuestQuery(String name) {
		super(name);
	}
	
}
