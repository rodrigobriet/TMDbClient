package com.github.rodrigobriet.tmdbclient.resources.tvseasons.models.submodels;

import com.github.rodrigobriet.tmdbclient.core.models.requestbody.Rate;
import com.google.gson.annotations.SerializedName;

public class TvEpisodesAccountStatesResultItem {

	@SerializedName("id")
	private int id;
	
	@SerializedName("episode_number")
	private int episodeNumber;
	
	private Rate rate;
	
	private boolean isRated;

	public TvEpisodesAccountStatesResultItem(int id, int episodeNumber, Rate rate, boolean isRated) {
		this.id = id;
		this.episodeNumber = episodeNumber;
		this.rate = rate;
		this.isRated = isRated;
	}

	public int getId() {
		return id;
	}

	public int getEpisodeNumber() {
		return episodeNumber;
	}

	public Rate getRate() {
		return rate;
	}

	public boolean isRated() {
		return isRated;
	}
	
}
