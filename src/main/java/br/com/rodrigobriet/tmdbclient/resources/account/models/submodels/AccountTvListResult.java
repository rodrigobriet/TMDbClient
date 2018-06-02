package br.com.rodrigobriet.tmdbclient.resources.account.models.submodels;

import com.google.gson.annotations.SerializedName;

public class AccountTvListResult {

	@SerializedName("poster_path")
	private String posterPath;
	
	@SerializedName("popularity")
	private float popularity;
	
	@SerializedName("id")
	private int id;
	
	@SerializedName("backdrop_path")
	private String backdropPath;
	
	@SerializedName("vote_average")
	private float voteAverage;
	
	@SerializedName("overview")
	private String overview;
	
	@SerializedName("first_air_date")
	private String firstAirDate;
	
	@SerializedName("origin_country")
	private String[] originCountry;
	
	@SerializedName("genre_ids")
	private int[] genreIds;
	
	@SerializedName("original_language")
	private String originalLanguage;
	
	@SerializedName("vote_count")
	private int voteCount;
	
	@SerializedName("name")
	private String name;
	
	@SerializedName("original_name")
	private String originalName;

	public String getPosterPath() {
		return posterPath;
	}

	public float getPopularity() {
		return popularity;
	}

	public int getId() {
		return id;
	}

	public String getBackdropPath() {
		return backdropPath;
	}

	public float getVoteAverage() {
		return voteAverage;
	}

	public String getOverview() {
		return overview;
	}

	public String getFirstAirDate() {
		return firstAirDate;
	}

	public String[] getOriginCountry() {
		return originCountry;
	}

	public int[] getGenreIds() {
		return genreIds;
	}

	public String getOriginalLanguage() {
		return originalLanguage;
	}

	public int getVoteCount() {
		return voteCount;
	}

	public String getName() {
		return name;
	}

	public String getOriginalName() {
		return originalName;
	}
	
}
