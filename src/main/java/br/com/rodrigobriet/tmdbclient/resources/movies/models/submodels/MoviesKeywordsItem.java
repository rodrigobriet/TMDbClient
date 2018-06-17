package br.com.rodrigobriet.tmdbclient.resources.movies.models.submodels;

import com.google.gson.annotations.SerializedName;

public class MoviesKeywordsItem {

	@SerializedName("id")
	private int id;
	
	@SerializedName("name")
	private String name;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
}
