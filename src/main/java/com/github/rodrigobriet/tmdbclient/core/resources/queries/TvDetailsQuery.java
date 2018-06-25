package com.github.rodrigobriet.tmdbclient.core.resources.queries;

public class TvDetailsQuery extends AbstractQueryField {

	public static final TvDetailsQuery LANGUAGE = new TvDetailsQuery("language");
	public static final TvDetailsQuery SESSION_ID = new TvDetailsQuery("session_id");
	public static final TvDetailsQuery GUEST_SESSION_ID = new TvDetailsQuery("guest_session_id");
	public static final TvDetailsQuery INCLUDE_IMAGE_LANGUAGE = new TvDetailsQuery("include_image_language");
	public static final TvDetailsQuery PAGE = new TvDetailsQuery("page");	
	
	public TvDetailsQuery(String name) {
		super(name);
	}

}
