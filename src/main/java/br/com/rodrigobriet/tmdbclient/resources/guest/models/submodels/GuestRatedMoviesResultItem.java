package br.com.rodrigobriet.tmdbclient.resources.guest.models.submodels;

import com.google.gson.annotations.SerializedName;

public class GuestRatedMoviesResultItem {

	@SerializedName("adult")
	private boolean adult;
	
	@SerializedName("backdrop_path")
	private String backdropPath;
	
	@SerializedName("genre_ids")
	private int[] genreIds;
	
	@SerializedName("id")
	private int id;
	
	@SerializedName("original_language")
	private String originalLanguage;
	
	@SerializedName("original_title")
	private String originalTitle;
	
	@SerializedName("overview")
	private String overview;
	
	@SerializedName("release_date")
	private String releaseDate;
	
	@SerializedName("poster_path")
	private String posterPath;
	
	@SerializedName("popularity")
	private float popularity;
	
	@SerializedName("title")
	private String title;
	
	@SerializedName("video")
	private boolean video;
	
	@SerializedName("vote_average")
	private float voteAverage;

	@SerializedName("vote_count")
	private int voteCount;

	@SerializedName("rating")
	private int rating;

	public boolean isAdult() {
		return adult;
	}

	public String getBackdropPath() {
		return backdropPath;
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

	public String getOriginalTitle() {
		return originalTitle;
	}

	public String getOverview() {
		return overview;
	}

	public String getReleaseDate() {
		return releaseDate;
	}

	public String getPosterPath() {
		return posterPath;
	}

	public float getPopularity() {
		return popularity;
	}

	public String getTitle() {
		return title;
	}

	public boolean isVideo() {
		return video;
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
