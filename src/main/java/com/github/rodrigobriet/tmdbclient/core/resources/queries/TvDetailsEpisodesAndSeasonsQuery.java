package com.github.rodrigobriet.tmdbclient.core.resources.queries;

public class TvDetailsEpisodesAndSeasonsQuery extends AbstractQueryField {

	public static final TvDetailsEpisodesAndSeasonsQuery LANGUAGE = new TvDetailsEpisodesAndSeasonsQuery("language");
	public static final TvDetailsEpisodesAndSeasonsQuery INCLUDE_IMAGE_LANGUAGE = new TvDetailsEpisodesAndSeasonsQuery("include_image_language");
	
	public TvDetailsEpisodesAndSeasonsQuery(String name) {
		super(name);
	}

}
