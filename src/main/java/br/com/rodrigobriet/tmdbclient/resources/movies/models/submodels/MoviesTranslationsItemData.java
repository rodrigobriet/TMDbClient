package br.com.rodrigobriet.tmdbclient.resources.movies.models.submodels;

import com.google.gson.annotations.SerializedName;

public class MoviesTranslationsItemData {

	@SerializedName("title")
	private String title;
	
	@SerializedName("overview")
	private String overview;
	
	@SerializedName("homepage")
	private String homepage;

	public String getTitle() {
		return title;
	}

	public String getOverview() {
		return overview;
	}

	public String getHomepage() {
		return homepage;
	}
	
}
