package br.com.rodrigobriet.tmdbclient.resources.people.models.submodels;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class PeopleTvCrew {

	@SerializedName("id")
	private int id;
	
	@SerializedName("department")
	private String department;
	
	@SerializedName("original_language")
	private String originalLanguage;
	
	@SerializedName("episode_count")
	private String episodeCount;
	
	@SerializedName("job")
	private String job;
	
	@SerializedName("overview")
	private String overview;
	
	@SerializedName("origin_country")
	private List<String> originCountry;
	
	@SerializedName("original_name")
	private String originalName;
	
	@SerializedName("genre_ids")
	private int[] genreIds;
	
	@SerializedName("name")
	private String name;
	
	@SerializedName("first_air_date")
	private String firstAirDate;
	
	@SerializedName("backdrop_path")
	private String backdropPath;
	
	@SerializedName("popularity")
	private float popularity;
	
	@SerializedName("vote_count")
	private int voteCount;
	
	@SerializedName("vote_average")
	private float voteAverage;
	
	@SerializedName("poster_path")
	private String posterPath;
	
	@SerializedName("credit_id")
	private String creditId;
	
	@SerializedName("media_type")
	private String mediaType = "tv";

	public int getId() {
		return id;
	}

	public String getDepartment() {
		return department;
	}

	public String getOriginalLanguage() {
		return originalLanguage;
	}

	public String getEpisodeCount() {
		return episodeCount;
	}

	public String getJob() {
		return job;
	}

	public String getOverview() {
		return overview;
	}

	public List<String> getOriginCountry() {
		return originCountry;
	}

	public String getOriginalName() {
		return originalName;
	}

	public int[] getGenreIds() {
		return genreIds;
	}

	public String getName() {
		return name;
	}

	public String getFirstAirDate() {
		return firstAirDate;
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

	public float getVoteAverage() {
		return voteAverage;
	}

	public String getPosterPath() {
		return posterPath;
	}

	public String getCreditId() {
		return creditId;
	}
	
	public String getMediaType() {
		return mediaType;
	}
	
}
