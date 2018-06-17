package br.com.rodrigobriet.tmdbclient.core.resources.query;

public class MoviesDetailsAppendQuery extends QueryField {

	public static final MoviesDetailsAppendQuery SESSION_ID = new MoviesDetailsAppendQuery("session_id");
	public static final MoviesDetailsAppendQuery GUEST_SESSION_ID = new MoviesDetailsAppendQuery("guest_session_id");
	public static final MoviesDetailsAppendQuery COUNTRY = new MoviesDetailsAppendQuery("country");
	public static final MoviesDetailsAppendQuery START_DATE = new MoviesDetailsAppendQuery("start_date");
	public static final MoviesDetailsAppendQuery END_DATE = new MoviesDetailsAppendQuery("end_date");
	public static final MoviesDetailsAppendQuery PAGE = new MoviesDetailsAppendQuery("page");
	public static final MoviesDetailsAppendQuery INCLUDE_IMAGE_LANGUAGE = new MoviesDetailsAppendQuery("include_image_language");
	
	public MoviesDetailsAppendQuery(String name) {
		super(name);
	}

}
