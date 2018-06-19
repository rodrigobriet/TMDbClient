package br.com.rodrigobriet.tmdbclient.resources.tv.models.submodels;

import com.google.gson.annotations.SerializedName;

public class TvContentRatingsResultItem {

	@SerializedName("iso_3166_1")
	private String iso3166_1;
	
	@SerializedName("rating")
	private String rating;

	public String getIso3166_1() {
		return iso3166_1;
	}

	public String getRating() {
		return rating;
	}
	
}
