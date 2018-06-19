package br.com.rodrigobriet.tmdbclient.resources.tv.appends;

import br.com.rodrigobriet.tmdbclient.core.resources.query.QueryField;

public class TvDetailsAppendQuery extends QueryField {

	public static final TvDetailsAppendQuery SESSION_ID = new TvDetailsAppendQuery("session_id");
	public static final TvDetailsAppendQuery GUEST_SESSION_ID = new TvDetailsAppendQuery("guest_session_id");
	public static final TvDetailsAppendQuery INCLUDE_IMAGE_LANGUAGE = new TvDetailsAppendQuery("include_image_language");
	public static final TvDetailsAppendQuery PAGE = new TvDetailsAppendQuery("page");	
	
	public TvDetailsAppendQuery(String name) {
		super(name);
	}

}
