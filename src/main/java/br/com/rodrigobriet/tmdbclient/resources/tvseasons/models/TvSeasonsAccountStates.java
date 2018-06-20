package br.com.rodrigobriet.tmdbclient.resources.tvseasons.models;

import java.util.List;

import com.google.gson.annotations.SerializedName;

import br.com.rodrigobriet.tmdbclient.resources.tvseasons.models.submodels.TvEpisodesAccountStatesResultItem;

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
