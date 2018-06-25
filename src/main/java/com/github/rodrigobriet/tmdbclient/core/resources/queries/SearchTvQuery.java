package com.github.rodrigobriet.tmdbclient.core.resources.queries;

public class SearchTvQuery extends AbstractQueryField {

	public static final SearchTvQuery LANGUAGE = new SearchTvQuery("language");
	public static final SearchTvQuery QUERY = new SearchTvQuery("query");
	public static final SearchTvQuery PAGE = new SearchTvQuery("page");
	public static final SearchTvQuery FIRST_AIR_DATE_YEAR = new SearchTvQuery("first_air_date_year");
	
	public SearchTvQuery(String name) {
		super(name);
	}

}
