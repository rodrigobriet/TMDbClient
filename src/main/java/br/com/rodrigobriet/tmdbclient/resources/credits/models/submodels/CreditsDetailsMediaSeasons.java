package br.com.rodrigobriet.tmdbclient.resources.credits.models.submodels;

import com.google.gson.annotations.SerializedName;

public class CreditsDetailsMediaSeasons {

	@SerializedName("air_date")
	private String airDate;
	
	@SerializedName("poster_path")
	private String posterPath;
	
	@SerializedName("season_number")
	private int seasonNumber;

	public String getAirDate() {
		return airDate;
	}

	public String getPosterPath() {
		return posterPath;
	}

	public int getSeasonNumber() {
		return seasonNumber;
	}
	
}
