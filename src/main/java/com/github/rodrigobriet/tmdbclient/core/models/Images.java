package com.github.rodrigobriet.tmdbclient.core.models;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class Images {

	@SerializedName("id")
	private int id;
	
	@SerializedName("backdrops")
	private List<ImagesItem> backdrops;
	
	@SerializedName("posters")
	private List<ImagesItem> posters;

	public int getId() {
		return id;
	}

	public List<ImagesItem> getBackdrops() {
		return backdrops;
	}

	public List<ImagesItem> getPosters() {
		return posters;
	}
	
}
