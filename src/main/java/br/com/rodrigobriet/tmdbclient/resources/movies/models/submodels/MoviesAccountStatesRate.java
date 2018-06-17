package br.com.rodrigobriet.tmdbclient.resources.movies.models.submodels;

import com.google.gson.annotations.SerializedName;

public class MoviesAccountStatesRate {

	@SerializedName("value")
	private int value;

	public int getValue() {
		return value;
	}
	
}
