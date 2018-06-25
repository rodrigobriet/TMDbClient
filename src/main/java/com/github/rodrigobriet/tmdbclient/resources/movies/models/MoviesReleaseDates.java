package com.github.rodrigobriet.tmdbclient.resources.movies.models;

import java.util.List;

import com.github.rodrigobriet.tmdbclient.resources.movies.models.submodels.MoviesReleaseDatesInfo;
import com.google.gson.annotations.SerializedName;

public class MoviesReleaseDates {

	@SerializedName("id")
	private int id;
	
	@SerializedName("results")
	private List<MoviesReleaseDatesInfo> results;

	public int getId() {
		return id;
	}

	public List<MoviesReleaseDatesInfo> getResults() {
		return results;
	}
	
}
