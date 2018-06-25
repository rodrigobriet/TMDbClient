package com.github.rodrigobriet.tmdbclient.resources.people.models.submodels;

import com.google.gson.annotations.SerializedName;

public class PeopleMovieCast {

	@SerializedName("character")
	private String character;
	
	@SerializedName("credit_id")
	private String creditId;
	
	@SerializedName("release_date")
	private String releaseDate;
	
	@SerializedName("vote_count")
	private int voteCount;
	
	@SerializedName("video")
	private boolean video;
	
	@SerializedName("adult")
	private boolean adult;
	
	@SerializedName("vote_average")
	private float voteAverage;
	
	@SerializedName("title")
	private String title;
	
	@SerializedName("genre_ids")
	private int[] genreIds;
	
	@SerializedName("original_language")
	private String originalLanguage;
	
	@SerializedName("original_title")
	private String originalTitle;
	
	@SerializedName("popularity")
	private float popularity;
	
	@SerializedName("id")
	private int id;
	
	@SerializedName("backdrop_path")
	private String backdropPath;
	
	@SerializedName("overview")
	private String overview;
	
	@SerializedName("poster_path")
	private String posterPath;
	
	@SerializedName("media_type")
	private String mediaType = "movie";

	public String getCharacter() {
		return character;
	}

	public String getCreditId() {
		return creditId;
	}

	public String getReleaseDate() {
		return releaseDate;
	}

	public int getVoteCount() {
		return voteCount;
	}

	public boolean isVideo() {
		return video;
	}

	public boolean isAdult() {
		return adult;
	}

	public float getVoteAverage() {
		return voteAverage;
	}

	public String getTitle() {
		return title;
	}

	public int[] getGenreIds() {
		return genreIds;
	}

	public String getOriginalLanguage() {
		return originalLanguage;
	}

	public String getOriginalTitle() {
		return originalTitle;
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

	public String getOverview() {
		return overview;
	}

	public String getPosterPath() {
		return posterPath;
	}

	public String getMediaType() {
		return mediaType;
	}
	
}
