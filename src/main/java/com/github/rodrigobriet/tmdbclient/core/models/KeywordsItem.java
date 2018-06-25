package com.github.rodrigobriet.tmdbclient.core.models;

import com.google.gson.annotations.SerializedName;

public class KeywordsItem {

	@SerializedName("id")
	private int id;
	
	@SerializedName("name")
	private String name;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
}
