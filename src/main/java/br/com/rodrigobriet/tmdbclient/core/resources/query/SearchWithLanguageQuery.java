package br.com.rodrigobriet.tmdbclient.core.resources.query;

public class SearchWithLanguageQuery extends QueryField {

	public static final SearchWithLanguageQuery LANGUAGE = new SearchWithLanguageQuery("language");
	public static final SearchWithLanguageQuery QUERY = new SearchWithLanguageQuery("query");
	public static final SearchWithLanguageQuery PAGE = new SearchWithLanguageQuery("page");
	
	public SearchWithLanguageQuery(String name) {
		super(name);
	}
}
