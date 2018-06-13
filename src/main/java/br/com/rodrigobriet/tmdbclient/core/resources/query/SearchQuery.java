package br.com.rodrigobriet.tmdbclient.core.resources.query;

public class SearchQuery extends QueryField {

	public static final SearchQuery QUERY = new SearchQuery("query");
	public static final SearchQuery PAGE = new SearchQuery("page");
	
	public SearchQuery(String name) {
		super(name);
	}

}
