package com.github.rodrigobriet.tmdbclient.resources.tvseasons.models;

import java.util.List;

import com.github.rodrigobriet.tmdbclient.core.models.ImagesItem;
import com.google.gson.annotations.SerializedName;

public class TvSeasonsImages {

	@SerializedName("id")
	private int id;
	
	@SerializedName("posters")
	private List<ImagesItem> posters;

	public int getId() {
		return id;
	}

	public List<ImagesItem> getPosters() {
		return posters;
	}
	
}
