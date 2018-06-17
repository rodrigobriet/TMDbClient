package br.com.rodrigobriet.tmdbclient.resources.movies.models.submodels;

import com.google.gson.annotations.SerializedName;

public class MoviesDetailsBelongsToCollection {

	@SerializedName("id")
	private int id;
	
	@SerializedName("name")
	private String name;
	
	@SerializedName("poster_path")
	private String posterPath;
	
	@SerializedName("backdrop_path")
	private String backdropPath;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getPosterPath() {
		return posterPath;
	}

	public String getBackdropPath() {
		return backdropPath;
	}
	
}
