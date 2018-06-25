package com.github.rodrigobriet.tmdbclient.resources.movies.models.submodels;

import com.google.gson.annotations.SerializedName;

public class MoviesReleaseDatesItem {

	@SerializedName("certification")
	private String certification;
	
	@SerializedName("iso_639_1")
	private String iso639_1;
	
	@SerializedName("release_date")
	private String releaseDate;
	
	@SerializedName("type")
	private int type;
	
	@SerializedName("note")
	private String note;

	public String getCertification() {
		return certification;
	}

	public String getIso639_1() {
		return iso639_1;
	}

	public String getReleaseDate() {
		return releaseDate;
	}

	public int getType() {
		return type;
	}

	public String getNote() {
		return note;
	}
	
}
