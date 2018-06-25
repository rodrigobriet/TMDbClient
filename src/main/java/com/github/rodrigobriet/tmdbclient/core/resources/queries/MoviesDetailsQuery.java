package com.github.rodrigobriet.tmdbclient.core.resources.queries;

public class MoviesDetailsQuery extends AbstractQueryField {

	public static final MoviesDetailsQuery LANGUAGE = new MoviesDetailsQuery("language");
	public static final MoviesDetailsQuery SESSION_ID = new MoviesDetailsQuery("session_id");
	public static final MoviesDetailsQuery GUEST_SESSION_ID = new MoviesDetailsQuery("guest_session_id");
	public static final MoviesDetailsQuery COUNTRY = new MoviesDetailsQuery("country");
	public static final MoviesDetailsQuery PAGE = new MoviesDetailsQuery("page");
	public static final MoviesDetailsQuery INCLUDE_IMAGE_LANGUAGE = new MoviesDetailsQuery("include_image_language");
	
	public MoviesDetailsQuery(String name) {
		super(name);
	}

}
