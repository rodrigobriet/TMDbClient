package com.github.rodrigobriet.tmdbclient.resources.tvepisodes.models;

import java.util.List;

import com.github.rodrigobriet.tmdbclient.core.models.ImagesItem;
import com.google.gson.annotations.SerializedName;

public class TvEpisodesImages {

	@SerializedName("id")
	private int id;
	
	@SerializedName("stills")
	private List<ImagesItem> stills;

	public int getId() {
		return id;
	}

	public List<ImagesItem> getStills() {
		return stills;
	}
	
}
