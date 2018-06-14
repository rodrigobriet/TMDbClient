package br.com.rodrigobriet.tmdbclient.core.resources.query;

public class PaggedQuery extends QueryField {

	public static final PaggedQuery LANGUAGE = new PaggedQuery("language");
	public static final PaggedQuery PAGE = new PaggedQuery("page");
	
	public PaggedQuery(String name) {
		super(name);
	}

}
