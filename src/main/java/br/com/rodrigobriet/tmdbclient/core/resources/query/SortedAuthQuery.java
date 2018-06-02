package br.com.rodrigobriet.tmdbclient.core.resources.query;

public class SortedAuthQuery extends QueryField {

	public static final SortedAuthQuery SESSION_ID = new SortedAuthQuery("session_id");
	public static final SortedAuthQuery LANGUAGE = new SortedAuthQuery("language");
	public static final SortedAuthQuery PAGE = new SortedAuthQuery("page");
	public static final SortedAuthQuery SORT_BY = new SortedAuthQuery("sort_by");
	
	protected SortedAuthQuery(String name) {
		super(name);
	}

}
