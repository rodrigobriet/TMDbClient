package br.com.rodrigobriet.tmdbclient.core.resources.query;

public class PaggedWithRegion extends QueryField {

	public static final PaggedWithRegion LANGUAGE = new PaggedWithRegion("language");
	public static final PaggedWithRegion PAGE = new PaggedWithRegion("page");
	public static final PaggedWithRegion REGION = new PaggedWithRegion("region");
	
	public PaggedWithRegion(String name) {
		super(name);
	}
}
