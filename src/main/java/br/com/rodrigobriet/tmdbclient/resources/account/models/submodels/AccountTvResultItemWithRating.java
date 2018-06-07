package br.com.rodrigobriet.tmdbclient.resources.account.models.submodels;

import com.google.gson.annotations.SerializedName;

public class AccountTvResultItemWithRating {

	@SerializedName("rating")
	private int rating;

	public int getRating() {
		return rating;
	}
	
}
