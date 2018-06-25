package com.github.rodrigobriet.tmdbclient.resources.movies.models.submodels;

import com.google.gson.annotations.SerializedName;

public class MoviesDetailsProductionCountries {

	@SerializedName("iso_3166_1")
	private String iso3166_1;
	
	@SerializedName("name")
	private String name;

	public String getIso3166_1() {
		return iso3166_1;
	}

	public String getName() {
		return name;
	}
	
}
