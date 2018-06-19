package br.com.rodrigobriet.tmdbclient.resources.tv.models.submodels;

import com.google.gson.annotations.SerializedName;

public class TvScreenedTheatricallyResultItem {

	@SerializedName("id")
	private int id;
	
	@SerializedName("episode_number")
	private int episodeNumber;
	
	@SerializedName("season_number")
	private int seasonNumber;

	public int getId() {
		return id;
	}

	public int getEpisodeNumber() {
		return episodeNumber;
	}

	public int getSeasonNumber() {
		return seasonNumber;
	}
	
}
