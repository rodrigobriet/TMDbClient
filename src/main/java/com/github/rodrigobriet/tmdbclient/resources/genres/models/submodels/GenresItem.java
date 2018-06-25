package com.github.rodrigobriet.tmdbclient.resources.genres.models.submodels;

import com.google.gson.annotations.SerializedName;

public class GenresItem {

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
