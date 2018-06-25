package com.github.rodrigobriet.tmdbclient.resources.networks.models.submodels;

import com.google.gson.annotations.SerializedName;

public class NetworksAlternativeNamesResultItem {

	@SerializedName("name")
	private String name;
	
	@SerializedName("type")
	private String type;

	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}
	
}
