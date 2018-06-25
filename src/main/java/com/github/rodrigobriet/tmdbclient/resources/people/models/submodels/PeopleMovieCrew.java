package com.github.rodrigobriet.tmdbclient.resources.people.models.submodels;

import com.google.gson.annotations.SerializedName;

public class PeopleMovieCrew {

	@SerializedName("id")
	private int id;
	
	@SerializedName("department")
	private String department;
	
	@SerializedName("original_language")
	private String originalLanguage;
	
	@SerializedName("original_title")
	private String originalTitle;
	
	@SerializedName("job")
	private String job;
	
	@SerializedName("overview")
	private String overview;
	
	@SerializedName("vote_count")
	private int voteCount;
	
	@SerializedName("video")
	private boolean video;
	
	@SerializedName("poster_path")
	private String posterPath;
	
	@SerializedName("backdrop_path")
	private String backdropPath;
	
	@SerializedName("title")
	private String title;
	
	@SerializedName("popularity")
	private float popularity;
	
	@SerializedName("genre_ids")
	private int[] genreIds;
	
	@SerializedName("vote_average")
	private float voteAverage;
	
	@SerializedName("adult")
	private boolean adult;
	
	@SerializedName("release_date")
	private String releaseDate;
	
	@SerializedName("credit_id")
	private String creditId;
	
	@SerializedName("media_type")
	private String mediaType = "movie";

	public int getId() {
		return id;
	}

	public String getDepartment() {
		return department;
	}

	public String getOriginalLanguage() {
		return originalLanguage;
	}

	public String getOriginalTitle() {
		return originalTitle;
	}

	public String getJob() {
		return job;
	}

	public String getOverview() {
		return overview;
	}

	public int getVoteCount() {
		return voteCount;
	}

	public boolean isVideo() {
		return video;
	}

	public String getPosterPath() {
		return posterPath;
	}

	public String getBackdropPath() {
		return backdropPath;
	}

	public String getTitle() {
		return title;
	}

	public float getPopularity() {
		return popularity;
	}

	public int[] getGenreIds() {
		return genreIds;
	}

	public float getVoteAverage() {
		return voteAverage;
	}

	public boolean isAdult() {
		return adult;
	}

	public String getReleaseDate() {
		return releaseDate;
	}

	public String getCreditId() {
		return creditId;
	}

	public String getMediaType() {
		return mediaType;
	}
	
}
