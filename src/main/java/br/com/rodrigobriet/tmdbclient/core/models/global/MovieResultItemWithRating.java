package br.com.rodrigobriet.tmdbclient.core.models.global;

import com.google.gson.annotations.SerializedName;

public class MovieResultItemWithRating extends MovieResultItem {

	@SerializedName("rating")
	private int rating;

	public int getRating() {
		return rating;
	}
	
}
