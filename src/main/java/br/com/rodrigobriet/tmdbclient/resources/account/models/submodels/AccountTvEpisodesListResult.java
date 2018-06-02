package br.com.rodrigobriet.tmdbclient.resources.account.models.submodels;

import com.google.gson.annotations.SerializedName;

public class AccountTvEpisodesListResult {

	@SerializedName("_id")
	private String _id;
	
	@SerializedName("air_date")
	private String airDate;
	
	@SerializedName("episode_number")
	private int episodeNumber;
	
	@SerializedName("name")
	private String name;
	
	@SerializedName("id")
	private int id;
	
	@SerializedName("season_number")
	private int seasonNumber;
	
	@SerializedName("still_path")
	private String stillPath;
	
	@SerializedName("show_id")
	private int showId;
	
	@SerializedName("vote_average")
	private float voteAverage;
	
	@SerializedName("vote_count")
	private int voteCount;
	
	@SerializedName("rating")
	private int rating;

	public String get_id() {
		return _id;
	}

	public String getAirDate() {
		return airDate;
	}

	public int getEpisodeNumber() {
		return episodeNumber;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public int getSeasonNumber() {
		return seasonNumber;
	}

	public String getStillPath() {
		return stillPath;
	}

	public int getShowId() {
		return showId;
	}

	public float getVoteAverage() {
		return voteAverage;
	}

	public int getVoteCount() {
		return voteCount;
	}

	public int getRating() {
		return rating;
	}
	
}
