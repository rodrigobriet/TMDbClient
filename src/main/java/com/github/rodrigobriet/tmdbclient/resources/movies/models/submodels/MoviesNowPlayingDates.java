package com.github.rodrigobriet.tmdbclient.resources.movies.models.submodels;

import com.google.gson.annotations.SerializedName;

public class MoviesNowPlayingDates {

	@SerializedName("maximum")
	private String maximum;
	
	@SerializedName("minimum")
	private String minimum;

	public String getMaximum() {
		return maximum;
	}

	public String getMinimum() {
		return minimum;
	}
	
}
