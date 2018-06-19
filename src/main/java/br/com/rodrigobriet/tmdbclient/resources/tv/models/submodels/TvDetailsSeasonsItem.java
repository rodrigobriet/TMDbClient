package br.com.rodrigobriet.tmdbclient.resources.tv.models.submodels;

import com.google.gson.annotations.SerializedName;

public class TvDetailsSeasonsItem {

	@SerializedName("air_date")
	private String air_date;
	
	@SerializedName("episode_count")
	private int episodeCount;
	
	@SerializedName("id")
	private int id;
	
	@SerializedName("poster_path")
	private String posterPath;
	
	@SerializedName("season_number")
	private int seasonNumber;

	public String getAir_date() {
		return air_date;
	}

	public int getEpisodeCount() {
		return episodeCount;
	}

	public int getId() {
		return id;
	}

	public String getPosterPath() {
		return posterPath;
	}

	public int getSeasonNumber() {
		return seasonNumber;
	}
	
}
