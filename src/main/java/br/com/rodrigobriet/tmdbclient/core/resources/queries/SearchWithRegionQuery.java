package br.com.rodrigobriet.tmdbclient.core.resources.queries;

public class SearchWithRegionQuery extends AbstractQueryField {

	public static final SearchWithRegionQuery LANGUAGE = new SearchWithRegionQuery("language");
	public static final SearchWithRegionQuery QUERY = new SearchWithRegionQuery("query");
	public static final SearchWithRegionQuery PAGE = new SearchWithRegionQuery("page");
	public static final SearchWithRegionQuery INCLUDE_ADULT = new SearchWithRegionQuery("include_adult");
	public static final SearchWithRegionQuery REGION = new SearchWithRegionQuery("region");
	
	public SearchWithRegionQuery(String name) {
		super(name);
	}

}
