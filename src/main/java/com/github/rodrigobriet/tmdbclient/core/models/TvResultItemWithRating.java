package com.github.rodrigobriet.tmdbclient.core.models;

import com.google.gson.annotations.SerializedName;

public class TvResultItemWithRating extends TvResultItem {

	@SerializedName("rating")
	private int rating;

	public int getRating() {
		return rating;
	}
	
}
