package com.github.rodrigobriet.tmdbclient.core.resources.queries;

public class SortedAuthQuery extends AbstractQueryField {

	public static final SortedAuthQuery SESSION_ID = new SortedAuthQuery("session_id");
	public static final SortedAuthQuery LANGUAGE = new SortedAuthQuery("language");
	public static final SortedAuthQuery PAGE = new SortedAuthQuery("page");
	public static final SortedAuthQuery SORT_BY = new SortedAuthQuery("sort_by");
	
	protected SortedAuthQuery(String name) {
		super(name);
	}

}
