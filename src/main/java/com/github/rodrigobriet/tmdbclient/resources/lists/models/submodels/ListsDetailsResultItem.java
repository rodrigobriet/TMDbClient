package com.github.rodrigobriet.tmdbclient.resources.lists.models.submodels;

import com.google.gson.annotations.SerializedName;

public class ListsDetailsResultItem {

	@SerializedName("poster_path")
	private String posterPath;
	
	@SerializedName("adult")
	private boolean adult;
	
	@SerializedName("overview")
	private String overview;
	
	@SerializedName("release_date")
	private String releaseDate;
	
	@SerializedName("genre_ids")
	private int[] genreIds;
	
	@SerializedName("id")
	private int id;
	
	@SerializedName("original_title")
	private String originalTitle;
	
	@SerializedName("original_language")
	private String originalLanguage;
	
	@SerializedName("title")
	private String title;
	
	@SerializedName("backdrop_path")
	private String backdropPath;
	
	@SerializedName("popularity")
	private float popularity;
	
	@SerializedName("vote_count")
	private int voteCount;
	
	@SerializedName("video")
	private boolean video;
	
	@SerializedName("vote_average")
	private float voteAverage;

	public String getPosterPath() {
		return posterPath;
	}

	public boolean isAdult() {
		return adult;
	}

	public String getOverview() {
		return overview;
	}

	public String getReleaseDate() {
		return releaseDate;
	}

	public int[] getGenreIds() {
		return genreIds;
	}

	public int getId() {
		return id;
	}

	public String getOriginalTitle() {
		return originalTitle;
	}

	public String getOriginalLanguage() {
		return originalLanguage;
	}

	public String getTitle() {
		return title;
	}

	public String getBackdropPath() {
		return backdropPath;
	}

	public float getPopularity() {
		return popularity;
	}

	public int getVoteCount() {
		return voteCount;
	}

	public boolean isVideo() {
		return video;
	}

	public float getVoteAverage() {
		return voteAverage;
	}
	
}
