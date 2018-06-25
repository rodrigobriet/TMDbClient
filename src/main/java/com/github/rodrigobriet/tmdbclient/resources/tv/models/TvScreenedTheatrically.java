package com.github.rodrigobriet.tmdbclient.resources.tv.models;

import java.util.List;

import com.github.rodrigobriet.tmdbclient.resources.tv.models.submodels.TvScreenedTheatricallyResultItem;
import com.google.gson.annotations.SerializedName;

public class TvScreenedTheatrically {

	@SerializedName("id")
	private int id;
	
	@SerializedName("results")
	private List<TvScreenedTheatricallyResultItem> results;

	public int getId() {
		return id;
	}

	public List<TvScreenedTheatricallyResultItem> getResults() {
		return results;
	}
	
}
