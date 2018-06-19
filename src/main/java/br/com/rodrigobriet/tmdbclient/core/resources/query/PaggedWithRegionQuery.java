package br.com.rodrigobriet.tmdbclient.core.resources.query;

public class PaggedWithRegionQuery extends QueryField {

	public static final PaggedWithRegionQuery LANGUAGE = new PaggedWithRegionQuery("language");
	public static final PaggedWithRegionQuery PAGE = new PaggedWithRegionQuery("page");
	public static final PaggedWithRegionQuery REGION = new PaggedWithRegionQuery("region");
	
	public PaggedWithRegionQuery(String name) {
		super(name);
	}
}
