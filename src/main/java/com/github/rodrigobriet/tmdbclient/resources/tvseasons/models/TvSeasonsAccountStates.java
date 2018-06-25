package com.github.rodrigobriet.tmdbclient.resources.tvseasons.models;

import java.util.List;

import com.github.rodrigobriet.tmdbclient.resources.tvseasons.models.submodels.TvEpisodesAccountStatesResultItem;
import com.google.gson.annotations.SerializedName;

public class TvSeasonsAccountStates {

	@SerializedName("id")
	private int id;
	
	@SerializedName("results")
	private List<TvEpisodesAccountStatesResultItem> results;

	public int getId() {
		return id;
	}

	public List<TvEpisodesAccountStatesResultItem> getResults() {
		return results;
	}
	
}
