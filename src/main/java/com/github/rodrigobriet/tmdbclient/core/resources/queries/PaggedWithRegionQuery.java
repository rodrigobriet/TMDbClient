package com.github.rodrigobriet.tmdbclient.core.resources.queries;

public class PaggedWithRegionQuery extends AbstractQueryField {

	public static final PaggedWithRegionQuery LANGUAGE = new PaggedWithRegionQuery("language");
	public static final PaggedWithRegionQuery PAGE = new PaggedWithRegionQuery("page");
	public static final PaggedWithRegionQuery REGION = new PaggedWithRegionQuery("region");
	
	public PaggedWithRegionQuery(String name) {
		super(name);
	}
}
