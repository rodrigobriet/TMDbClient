package br.com.rodrigobriet.tmdbclient.resources.tvepisodes.appends;

import br.com.rodrigobriet.tmdbclient.core.resources.query.QueryField;

public class TvEpisodesDetailsAppendQuery extends QueryField {

	public static final TvEpisodesDetailsAppendQuery INCLUDE_IMAGE_LANGUAGE = new TvEpisodesDetailsAppendQuery("include_image_language");
	
	public TvEpisodesDetailsAppendQuery(String name) {
		super(name);
	}

}
