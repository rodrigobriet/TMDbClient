package br.com.rodrigobriet.tmdbclient.resources.tvseasons.appends;

import br.com.rodrigobriet.tmdbclient.core.resources.query.QueryField;

public class TvSeasonsDetailsAppendQuery extends QueryField {

	public static final TvSeasonsDetailsAppendQuery INCLUDE_IMAGE_LANGUAGE = new TvSeasonsDetailsAppendQuery("include_image_language");
	
	public TvSeasonsDetailsAppendQuery(String name) {
		super(name);
	}

}
