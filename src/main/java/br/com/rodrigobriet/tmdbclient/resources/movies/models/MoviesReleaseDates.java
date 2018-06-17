package br.com.rodrigobriet.tmdbclient.resources.movies.models;

import java.util.List;

import com.google.gson.annotations.SerializedName;

import br.com.rodrigobriet.tmdbclient.resources.movies.models.submodels.MoviesReleaseDatesInfo;

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
