package br.com.rodrigobriet.tmdbclient.resources.account.models.submodels;

import com.google.gson.annotations.SerializedName;

public class AccountTvListResultWithRating {

	@SerializedName("rating")
	private int rating;

	public int getRating() {
		return rating;
	}
	
}
