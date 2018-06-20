package br.com.rodrigobriet.tmdbclient.resources.tvepisodes.models;

import com.google.gson.annotations.SerializedName;

import br.com.rodrigobriet.tmdbclient.core.models.global.requestbody.Rate;

public class TvEpisodesAccountStates {

	@SerializedName("id")
	private int id;
	
	private Rate rate;
	
	private boolean isRated;

	public TvEpisodesAccountStates(int id, Rate rate, boolean isRated) {
		this.id = id;
		this.rate = rate;
		this.isRated = isRated;
	}

	public int getId() {
		return id;
	}

	public Rate getRate() {
		return rate;
	}

	public boolean isRated() {
		return isRated;
	}
	
}
