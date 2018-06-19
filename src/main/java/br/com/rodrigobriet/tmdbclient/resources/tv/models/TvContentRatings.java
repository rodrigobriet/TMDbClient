package br.com.rodrigobriet.tmdbclient.resources.tv.models;

import java.util.List;

import com.google.gson.annotations.SerializedName;

import br.com.rodrigobriet.tmdbclient.resources.tv.models.submodels.TvContentRatingsResultItem;

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
