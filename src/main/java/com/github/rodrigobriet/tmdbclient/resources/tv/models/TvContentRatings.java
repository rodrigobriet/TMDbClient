package com.github.rodrigobriet.tmdbclient.resources.tv.models;

import java.util.List;

import com.github.rodrigobriet.tmdbclient.resources.tv.models.submodels.TvContentRatingsResultItem;
import com.google.gson.annotations.SerializedName;

public class TvContentRatings {

	@SerializedName("id")
	private int id;
	
	@SerializedName("results")
	private List<TvContentRatingsResultItem> results;

	public int getId() {
		return id;
	}

	public List<TvContentRatingsResultItem> getResults() {
		return results;
	}
	
}
