package br.com.rodrigobriet.tmdbclient.resources.movies.models.submodels;

import com.google.gson.annotations.SerializedName;

public class MoviesAlternativeTitlesItem {

	@SerializedName("iso_3166_1")
	private String iso3166_1;
	
	@SerializedName("title")
	private String title;
	
	@SerializedName("type")
	private String type;

	public String getIso3166_1() {
		return iso3166_1;
	}

	public String getTitle() {
		return title;
	}

	public String getType() {
		return type;
	}
	
}
