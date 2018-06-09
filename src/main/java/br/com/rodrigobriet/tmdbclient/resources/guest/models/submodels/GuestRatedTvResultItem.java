package br.com.rodrigobriet.tmdbclient.resources.guest.models.submodels;

import com.google.gson.annotations.SerializedName;

public class GuestRatedTvResultItem {

	@SerializedName("backdrop_path")
	private String backdropPath;
	
	@SerializedName("first_air_date")
	private String firstAirDate;
	
	@SerializedName("genre_ids")
	private int[] genreIds;
	
	@SerializedName("id")
	private int id;
	
	@SerializedName("original_language")
	private String originalLanguage;
	
	@SerializedName("original_name")
	private String originalName;
	
	@SerializedName("overview")
	private String overview;
	
	@SerializedName("origin_country")
	private String[] originCountry;
	
	@SerializedName("poster_path")
	private String posterPath;
	
	@SerializedName("popularity")
	private float popularity;
	
	@SerializedName("name")
	private String name;
	
	@SerializedName("vote_average")
	private float voteAverage;
	
	@SerializedName("vote_count")
	private int voteCount;
	
	@SerializedName("rating")
	private int rating;

	public String getBackdropPath() {
		return backdropPath;
	}

	public String getFirstAirDate() {
		return firstAirDate;
	}

	public int[] getGenreIds() {
		return genreIds;
	}

	public int getId() {
		return id;
	}

	public String getOriginalLanguage() {
		return originalLanguage;
	}

	public String getOriginalName() {
		return originalName;
	}

	public String getOverview() {
		return overview;
	}

	public String[] getOriginCountry() {
		return originCountry;
	}

	public String getPosterPath() {
		return posterPath;
	}

	public float getPopularity() {
		return popularity;
	}

	public String getName() {
		return name;
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
	
	
	
	
	
	
	
	
	
	
	
	
	
	
