package br.com.rodrigobriet.tmdbclient.resources.movies.models;

import java.util.List;

import com.google.gson.annotations.SerializedName;

import br.com.rodrigobriet.tmdbclient.resources.movies.models.submodels.MoviesImagesItem;

public class MoviesImages {

	@SerializedName("id")
	private int id;
	
	@SerializedName("backdrops")
	private List<MoviesImagesItem> backdrops;
	
	@SerializedName("posters")
	private List<MoviesImagesItem> posters;

	public int getId() {
		return id;
	}

	public List<MoviesImagesItem> getBackdrops() {
		return backdrops;
	}

	public List<MoviesImagesItem> getPosters() {
		return posters;
	}
	
}
