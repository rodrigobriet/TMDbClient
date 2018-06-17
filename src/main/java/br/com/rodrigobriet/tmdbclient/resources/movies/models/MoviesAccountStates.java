package br.com.rodrigobriet.tmdbclient.resources.movies.models;

import com.google.gson.annotations.SerializedName;

import br.com.rodrigobriet.tmdbclient.resources.movies.models.submodels.MoviesAccountStatesRate;

// TODO deserialization
public class MoviesAccountStates {

	@SerializedName("id")
	private int id;
	
	@SerializedName("favorite")
	private boolean favorite;

	@SerializedName("watchlist")
	private boolean watchlist;
	
	private MoviesAccountStatesRate rate;
	
	private boolean rated;

	public int getId() {
		return id;
	}

	public boolean isFavorite() {
		return favorite;
	}

	public boolean isWatchlist() {
		return watchlist;
	}

	public MoviesAccountStatesRate getRate() {
		return rate;
	}

	public boolean isRated() {
		return rated;
	}
	
}
