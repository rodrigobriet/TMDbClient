package br.com.rodrigobriet.tmdbclient.core.resources.queries;

public class SearchMoviesQuery extends AbstractQueryField {

	public static final SearchMoviesQuery LANGUAGE = new SearchMoviesQuery("language");
	public static final SearchMoviesQuery QUERY = new SearchMoviesQuery("query");
	public static final SearchMoviesQuery PAGE = new SearchMoviesQuery("page");
	public static final SearchMoviesQuery INCLUDE_ADULT = new SearchMoviesQuery("include_adult");
	public static final SearchMoviesQuery REGION = new SearchMoviesQuery("region");
	public static final SearchMoviesQuery YEAR = new SearchMoviesQuery("year");
	public static final SearchMoviesQuery PRIMARY_RELEASE_YEAR = new SearchMoviesQuery("primary_release_year");
	
	public SearchMoviesQuery(String name) {
		super(name);
	}

}
