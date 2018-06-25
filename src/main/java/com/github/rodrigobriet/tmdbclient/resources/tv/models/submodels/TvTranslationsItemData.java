package com.github.rodrigobriet.tmdbclient.resources.tv.models.submodels;

import com.google.gson.annotations.SerializedName;

public class TvTranslationsItemData {

	@SerializedName("name")
	private String name;
	
	@SerializedName("overview")
	private String overview;
	
	@SerializedName("homepage")
	private String homepage;

	public String getName() {
		return name;
	}

	public String getOverview() {
		return overview;
	}

	public String getHomepage() {
		return homepage;
	}
	
}
