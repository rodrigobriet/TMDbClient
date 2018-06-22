package br.com.rodrigobriet.tmdbclient.core.resources.queries;

public class SearchWithLanguageQuery extends AbstractQueryField {

	public static final SearchWithLanguageQuery LANGUAGE = new SearchWithLanguageQuery("language");
	public static final SearchWithLanguageQuery QUERY = new SearchWithLanguageQuery("query");
	public static final SearchWithLanguageQuery PAGE = new SearchWithLanguageQuery("page");
	
	public SearchWithLanguageQuery(String name) {
		super(name);
	}
}
