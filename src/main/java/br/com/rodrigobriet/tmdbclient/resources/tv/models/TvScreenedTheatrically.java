package br.com.rodrigobriet.tmdbclient.resources.tv.models;

import java.util.List;

import com.google.gson.annotations.SerializedName;

import br.com.rodrigobriet.tmdbclient.resources.tv.models.submodels.TvScreenedTheatricallyResultItem;

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
