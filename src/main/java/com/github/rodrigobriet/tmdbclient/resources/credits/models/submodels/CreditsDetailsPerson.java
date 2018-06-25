package com.github.rodrigobriet.tmdbclient.resources.credits.models.submodels;

import com.google.gson.annotations.SerializedName;

public class CreditsDetailsPerson {

	@SerializedName("name")
	private String name;
	
	@SerializedName("id")
	private int id;

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}
	
}
