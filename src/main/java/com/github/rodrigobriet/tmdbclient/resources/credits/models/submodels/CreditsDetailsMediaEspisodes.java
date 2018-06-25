package com.github.rodrigobriet.tmdbclient.resources.credits.models.submodels;

import com.google.gson.annotations.SerializedName;

public class CreditsDetailsMediaEspisodes {

	@SerializedName("air_date")
	private String airDate;
	
	@SerializedName("episode_number")
	private int episodeNumber;
	
	@SerializedName("name")
	private String name;
	
	@SerializedName("overview")
	private String overview;
	
	@SerializedName("season_number")
	private int seasonNumber;
	
	@SerializedName("still_path")
	private String stillPath;

	public String getAirDate() {
		return airDate;
	}

	public int getEpisodeNumber() {
		return episodeNumber;
	}

	public String getName() {
		return name;
	}

	public String getOverview() {
		return overview;
	}

	public int getSeasonNumber() {
		return seasonNumber;
	}

	public String getStillPath() {
		return stillPath;
	}
	
}
