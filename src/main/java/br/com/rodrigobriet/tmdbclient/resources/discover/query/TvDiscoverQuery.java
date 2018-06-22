package br.com.rodrigobriet.tmdbclient.resources.discover.query;

import br.com.rodrigobriet.tmdbclient.core.resources.queries.AbstractQueryField;

public class TvDiscoverQuery extends AbstractQueryField {

	public static final TvDiscoverQuery LANGUAGE = new TvDiscoverQuery("language");
	public static final TvDiscoverQuery SORT_BY = new TvDiscoverQuery("sort_by");
	public static final TvDiscoverQuery AIR_DATE_GTE = new TvDiscoverQuery("air_date.gte");
	public static final TvDiscoverQuery AIR_DATE_LTE = new TvDiscoverQuery("air_date.lte");
	public static final TvDiscoverQuery FIRST_AIR_DATE_GTE = new TvDiscoverQuery("first_air_date.gte");
	public static final TvDiscoverQuery FIRST_AIR_DATE_LTE = new TvDiscoverQuery("first_air_date.lte");
	public static final TvDiscoverQuery FIRST_AIR_DATE_YEAR = new TvDiscoverQuery("first_air_date_year");
	public static final TvDiscoverQuery PAGE = new TvDiscoverQuery("page");
	public static final TvDiscoverQuery TIMEZONE = new TvDiscoverQuery("timezone");
	public static final TvDiscoverQuery VOTE_AVERAGE_GTE = new TvDiscoverQuery("vote_average.gte");
	public static final TvDiscoverQuery VOTE_COUNT_GTE = new TvDiscoverQuery("vote_count.gte");
	public static final TvDiscoverQuery WITH_GENRES = new TvDiscoverQuery("with_genres");
	public static final TvDiscoverQuery WITH_NETWORKS = new TvDiscoverQuery("with_networks");
	public static final TvDiscoverQuery WITHOUT_GENRES = new TvDiscoverQuery("without_genres");
	public static final TvDiscoverQuery WITH_RUNTIME_GTE = new TvDiscoverQuery("with_runtime.gte");
	public static final TvDiscoverQuery WITH_RUNTIME_LTE = new TvDiscoverQuery("with_runtime.lte");
	public static final TvDiscoverQuery INCLUDE_NULL_FIRST_AIR_DATES = new TvDiscoverQuery("include_null_first_air_dates");
	public static final TvDiscoverQuery WITH_ORIGINAL_LANGUAGE = new TvDiscoverQuery("with_original_language");
	public static final TvDiscoverQuery WITHOUT_KEYWORDS = new TvDiscoverQuery("without_keywords");
	public static final TvDiscoverQuery SCREENED_THEATRICALLY = new TvDiscoverQuery("screened_theatrically");
	public static final TvDiscoverQuery WITH_COMPANIES = new TvDiscoverQuery("with_companies");
	
	protected TvDiscoverQuery(String name) {
		super(name);
	}

}
