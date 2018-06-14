package br.com.rodrigobriet.tmdbclient.resources.people.models.submodels;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class PeopleTvCast {

	@SerializedName("credit_id")
	private String creditId;
	
	@SerializedName("original_name")
	private String originalName;
	
	@SerializedName("id")
	private int id;
	
	@SerializedName("genre_ids")
	private int[] genreIds;
	
	@SerializedName("character")
	private String character;
	
	@SerializedName("name")
	private String name;
	
	@SerializedName("poster_path")
	private String posterPath;
	
	@SerializedName("vote_count")
	private int voteCount;
	
	@SerializedName("vote_average")
	private float voteAverage;
	
	@SerializedName("popularity")
	private float popularity;
	
	@SerializedName("episode_count")
	private int episodeCount;
	
	@SerializedName("original_language")
	private String originalLanguage;
	
	@SerializedName("first_air_date")
	private String firstAirDate;
	
	@SerializedName("backdrop_path")
	private String backdropPath;
	
	@SerializedName("overview")
	private String overview;
	
	@SerializedName("origin_country")
	private List<String> originCountry;
	
	@SerializedName("media_type")
	private String mediaType = "tv";

	public String getCreditId() {
		return creditId;
	}

	public String getOriginalName() {
		return originalName;
	}

	public int getId() {
		return id;
	}

	public int[] getGenreIds() {
		return genreIds;
	}

	public String getCharacter() {
		return character;
	}

	public String getName() {
		return name;
	}

	public String getPosterPath() {
		return posterPath;
	}

	public int getVoteCount() {
		return voteCount;
	}

	public float getVoteAverage() {
		return voteAverage;
	}

	public float getPopularity() {
		return popularity;
	}

	public int getEpisodeCount() {
		return episodeCount;
	}

	public String getOriginalLanguage() {
		return originalLanguage;
	}

	public String getFirstAirDate() {
		return firstAirDate;
	}

	public String getBackdropPath() {
		return backdropPath;
	}

	public String getOverview() {
		return overview;
	}

	public List<String> getOriginCountry() {
		return originCountry;
	}

	public String getMediaType() {
		return mediaType;
	}
	
}
