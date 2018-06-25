package com.github.rodrigobriet.tmdbclient.core.models;

import com.google.gson.annotations.SerializedName;

public class Reviews extends Pagged<ReviewsResultItem> {

	@SerializedName("id")
	private int id;

	public int getId() {
		return id;
	}
	
}
