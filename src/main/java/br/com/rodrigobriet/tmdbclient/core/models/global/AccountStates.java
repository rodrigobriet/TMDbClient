package br.com.rodrigobriet.tmdbclient.core.models.global;

import com.google.gson.annotations.SerializedName;

public class AccountStates {

	@SerializedName("id")
	private int id;
	
	@SerializedName("favorite")
	private boolean favorite;

	@SerializedName("watchlist")
	private boolean watchlist;
	
	private AccountStatesRate rate;
	
	private boolean isRated;

	public AccountStates(int id, boolean favorite, boolean watchlist, AccountStatesRate rate, boolean rated) {
		this.id = id;
		this.favorite = favorite;
		this.watchlist = watchlist;
		this.rate = rate;
		this.isRated = rated;
	}

	public int getId() {
		return id;
	}

	public boolean isFavorite() {
		return favorite;
	}

	public boolean isWatchlist() {
		return watchlist;
	}

	public AccountStatesRate getRate() {
		return rate;
	}

	public boolean isRated() {
		return isRated;
	}
	
}
