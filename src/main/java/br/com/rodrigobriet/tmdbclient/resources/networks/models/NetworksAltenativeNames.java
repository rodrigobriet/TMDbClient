package br.com.rodrigobriet.tmdbclient.resources.networks.models;

import java.util.List;

import com.google.gson.annotations.SerializedName;

import br.com.rodrigobriet.tmdbclient.resources.networks.models.submodels.NetworksAlternativeNamesResultItem;

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
