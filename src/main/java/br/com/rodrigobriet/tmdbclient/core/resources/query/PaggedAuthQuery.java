package br.com.rodrigobriet.tmdbclient.core.resources.query;

public class PaggedAuthQuery extends QueryField {

	public static final PaggedAuthQuery SESSION_ID = new PaggedAuthQuery("session_id");
	public static final PaggedAuthQuery LANGUAGE = new PaggedAuthQuery("language");
	public static final PaggedAuthQuery PAGE = new PaggedAuthQuery("page");
	
	protected PaggedAuthQuery(String name) {
		super(name);
	}

}
