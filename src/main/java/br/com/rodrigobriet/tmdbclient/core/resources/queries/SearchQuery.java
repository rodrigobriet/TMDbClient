package br.com.rodrigobriet.tmdbclient.core.resources.queries;

public class SearchQuery extends AbstractQueryField {

	public static final SearchQuery QUERY = new SearchQuery("query");
	public static final SearchQuery PAGE = new SearchQuery("page");
	
	public SearchQuery(String name) {
		super(name);
	}

}
