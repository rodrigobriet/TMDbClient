package com.github.rodrigobriet.tmdbclient.resources.keywords.models;

import com.google.gson.annotations.SerializedName;

public class KeywordsDetails {

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
