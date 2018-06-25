package com.github.rodrigobriet.tmdbclient.core.models;

import com.google.gson.annotations.SerializedName;

public class CollectionsResultItem {

	@SerializedName("id")
	private int id;
	
	@SerializedName("backdrop_path")
	private String backdropPath;
	
	@SerializedName("name")
	private String name;
	
	@SerializedName("poster_path")
	private String posterPath;

	public int getId() {
		return id;
	}

	public String getBackdropPath() {
		return backdropPath;
	}

	public String getName() {
		return name;
	}

	public String getPosterPath() {
		return posterPath;
	}
	
}
