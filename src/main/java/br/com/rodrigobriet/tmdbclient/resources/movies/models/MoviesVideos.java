package br.com.rodrigobriet.tmdbclient.resources.movies.models;

import java.util.List;

import com.google.gson.annotations.SerializedName;

import br.com.rodrigobriet.tmdbclient.resources.movies.models.submodels.MoviesVideosItem;

public class MoviesVideos {

	@SerializedName("id")
	private int id;
	
	@SerializedName("results")
	private List<MoviesVideosItem> results;

	public int getId() {
		return id;
	}

	public List<MoviesVideosItem> getResults() {
		return results;
	}
	
}
