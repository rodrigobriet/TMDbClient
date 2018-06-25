package com.github.rodrigobriet.tmdbclient.resources.tvepisodes.models.submodels;

import com.google.gson.annotations.SerializedName;

public class TvEpisodesTranslationsItemData {

	@SerializedName("name")
	private String name;
	
	@SerializedName("overview")
	private String overview;

	public String getName() {
		return name;
	}

	public String getOverview() {
		return overview;
	}
	
}
