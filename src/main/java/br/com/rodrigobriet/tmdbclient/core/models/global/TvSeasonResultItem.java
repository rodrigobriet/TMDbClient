package br.com.rodrigobriet.tmdbclient.core.models.global;

import com.google.gson.annotations.SerializedName;

public class TvSeasonResultItem {

	@SerializedName("air_date")
	private String airDate;
	
	@SerializedName("episode_count")
	private int episodeCount;
	
	@SerializedName("id")
	private int id;
	
	@SerializedName("name")
	private String name;
	
	@SerializedName("overview")
	private String overview;
	
	@SerializedName("poster_path")
	private String posterPath;
	
	@SerializedName("season_number")
	private int seasonNumber;
	
	@SerializedName("show_id")
	private int showId;

	public String getAirDate() {
		return airDate;
	}

	public int getEpisodeCount() {
		return episodeCount;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getOverview() {
		return overview;
	}

	public String getPosterPath() {
		return posterPath;
	}

	public int getSeasonNumber() {
		return seasonNumber;
	}

	public int getShowId() {
		return showId;
	}
	
}
