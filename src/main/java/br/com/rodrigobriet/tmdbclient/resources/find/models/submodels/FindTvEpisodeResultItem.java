package br.com.rodrigobriet.tmdbclient.resources.find.models.submodels;

import com.google.gson.annotations.SerializedName;

public class FindTvEpisodeResultItem {

	@SerializedName("air_date")
	private String airDate;
	
	@SerializedName("episode_number")
	private int episodeNumber;
	
	@SerializedName("id")
	private int id;
	
	@SerializedName("name")
	private String name;
	
	@SerializedName("overview")
	private String overview;
	
	@SerializedName("production_code")
	private int productionCode;
	
	@SerializedName("season_number")
	private int seasonNumber;
	
	@SerializedName("show_id")
	private int showId;
	
	@SerializedName("still_path")
	private String stillPath;

	@SerializedName("vote_average")
	private float voteAverage;
	
	@SerializedName("vote_count")
	private int voteCount;

	public String getAirDate() {
		return airDate;
	}

	public int getEpisodeNumber() {
		return episodeNumber;
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

	public int getProductionCode() {
		return productionCode;
	}

	public int getSeasonNumber() {
		return seasonNumber;
	}

	public int getShowId() {
		return showId;
	}

	public String getStillPath() {
		return stillPath;
	}

	public float getVoteAverage() {
		return voteAverage;
	}

	public int getVoteCount() {
		return voteCount;
	}
	
}
