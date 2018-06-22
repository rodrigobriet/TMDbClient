package br.com.rodrigobriet.tmdbclient.resources.discover.query;

import br.com.rodrigobriet.tmdbclient.core.resources.queries.AbstractQueryField;

public class MovieDiscoverQuery extends AbstractQueryField {

	public static final MovieDiscoverQuery LANGUAGE = new MovieDiscoverQuery("language");
	public static final MovieDiscoverQuery REGION = new MovieDiscoverQuery("region");
	public static final MovieDiscoverQuery SORT_BY = new MovieDiscoverQuery("sort_by");
	public static final MovieDiscoverQuery CERTIFICATION_COUNTRY = new MovieDiscoverQuery("certification_country");
	public static final MovieDiscoverQuery CERTIFICATION = new MovieDiscoverQuery("certification");
	public static final MovieDiscoverQuery CERTIFICATION_LTE = new MovieDiscoverQuery("certification.lte");
	public static final MovieDiscoverQuery INCLUDE_ADULT = new MovieDiscoverQuery("include_adult");
	public static final MovieDiscoverQuery INCLUDE_VIDEO = new MovieDiscoverQuery("include_video");
	public static final MovieDiscoverQuery PAGE = new MovieDiscoverQuery("page");
	public static final MovieDiscoverQuery PRIMARY_RELEASE_YEAR = new MovieDiscoverQuery("primary_release_year");
	public static final MovieDiscoverQuery PRIMARY_RELEASE_DATE_GTE = new MovieDiscoverQuery("primary_release_date.gte");
	public static final MovieDiscoverQuery PRIMARY_RELEASE_DATE_LTE = new MovieDiscoverQuery("primary_relase_date.lte");
	public static final MovieDiscoverQuery RELEASE_DATE_GTE = new MovieDiscoverQuery("release_date.gte");
	public static final MovieDiscoverQuery RELEASE_DATE_LTE = new MovieDiscoverQuery("release_date.lte");
	public static final MovieDiscoverQuery VOTE_COUNT_GTE = new MovieDiscoverQuery("vote_count.gte");
	public static final MovieDiscoverQuery VOTE_COUNT_LTE = new MovieDiscoverQuery("vote_count.lte");
	public static final MovieDiscoverQuery VOTE_AVERAGE_GTE = new MovieDiscoverQuery("cote_average.gte");
	public static final MovieDiscoverQuery VOTE_AVERAGE_LTE = new MovieDiscoverQuery("vote_average.lte");
	public static final MovieDiscoverQuery WITH_CAST = new MovieDiscoverQuery("with_cast");
	public static final MovieDiscoverQuery WITH_CREW = new MovieDiscoverQuery("with_crew");
	public static final MovieDiscoverQuery WITH_COMPANIES = new MovieDiscoverQuery("with_companies");
	public static final MovieDiscoverQuery WITH_GENRES = new MovieDiscoverQuery("with_genres");
	public static final MovieDiscoverQuery WITH_KEYWORDS = new MovieDiscoverQuery("with_keywords");
	public static final MovieDiscoverQuery WITH_PEOPLE = new MovieDiscoverQuery("with_people");
	public static final MovieDiscoverQuery YEAR = new MovieDiscoverQuery("year");
	public static final MovieDiscoverQuery WITHOUT_GENRES = new MovieDiscoverQuery("without_genres");
	public static final MovieDiscoverQuery WITH_RUNTIME_GTE = new MovieDiscoverQuery("with_runtime.gte");
	public static final MovieDiscoverQuery WITH_RUNTIME_LTE = new MovieDiscoverQuery("with_runtime.lte");
	public static final MovieDiscoverQuery WITH_RELEASE_TYPE = new MovieDiscoverQuery("with_release_type");
	public static final MovieDiscoverQuery WITH_ORIGINAL_LANGUAGE = new MovieDiscoverQuery("with_original_language");
	public static final MovieDiscoverQuery WITHOUT_KEYWORDS = new MovieDiscoverQuery("without_keywords");
	
	protected MovieDiscoverQuery(String name) {
		super(name);
	}

}
