package com.github.rodrigobriet.tmdbclient.resources.networks.models;

import java.util.List;

import com.github.rodrigobriet.tmdbclient.resources.networks.models.submodels.NetworksAlternativeNamesResultItem;
import com.google.gson.annotations.SerializedName;

public class NetworksAltenativeNames {
	@SerializedName("id")
	private int id;
	
	@SerializedName("results")
	private List<NetworksAlternativeNamesResultItem> results;

	public int getId() {
		return id;
	}

	public List<NetworksAlternativeNamesResultItem> getResults() {
		return results;
	}
	
}
