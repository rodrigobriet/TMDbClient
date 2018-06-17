package br.com.rodrigobriet.tmdbclient.resources.movies.models.submodels;

import com.google.gson.annotations.SerializedName;

public class MoviesDetailsSpokenLanguages {

	@SerializedName("iso_639_1")
	private String iso639_1;
	
	@SerializedName("name")
	private String name;

	public String getIso639_1() {
		return iso639_1;
	}

	public String getName() {
		return name;
	}
	
}
