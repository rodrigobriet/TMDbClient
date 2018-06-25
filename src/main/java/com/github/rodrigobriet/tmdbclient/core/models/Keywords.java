package com.github.rodrigobriet.tmdbclient.core.models;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class Keywords {

	@SerializedName("id")
	private int id;
	
	@SerializedName("keywords")
	private List<KeywordsItem> keywords;

	public int getId() {
		return id;
	}

	public List<KeywordsItem> getKeywords() {
		return keywords;
	}
	
}
