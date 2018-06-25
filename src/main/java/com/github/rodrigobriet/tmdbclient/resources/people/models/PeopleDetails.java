package com.github.rodrigobriet.tmdbclient.resources.people.models;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class PeopleDetails {

	@SerializedName("adult")
	private boolean adult;
	
	@SerializedName("also_known_as")
	private List<String> alsoKnownAs;
	
	@SerializedName("biography")
	private String biography;
	
	@SerializedName("birthday")
	private String birthday;
	
	@SerializedName("deathday")
	private String deathday;
	
	@SerializedName("gender")
	private int gender;
	
	@SerializedName("homepage")
	private String homepage;
	
	@SerializedName("id")
	private int id;
	
	@SerializedName("imdb_id")
	private String imdbId;
	
	@SerializedName("name")
	private String name;
	
	@SerializedName("place_of_birth")
	private String placeOfBirth;
	
	@SerializedName("popularity")
	private float popularity;
	
	@SerializedName("profile_path")
	private String profilePath;
	
	@SerializedName("movie_credits")
	private PeopleMovieCredits movieCredits;
	
	@SerializedName("tv_credits")
	private PeopleTvCredits tvCredits;
	
	@SerializedName("combined_credits")
	private PeopleCombinedCredits combinedCredits;
	
	@SerializedName("external_ids")
	private PeopleExternalIds externalIds;
	
	@SerializedName("images")
	private PeopleImages images;
	
	@SerializedName("tagged_images")
	private PeopleTaggedImages taggedImages;

	public boolean isAdult() {
		return adult;
	}

	public List<String> getAlsoKnownAs() {
		return alsoKnownAs;
	}

	public String getBiography() {
		return biography;
	}

	public String getBirthday() {
		return birthday;
	}

	public String getDeathday() {
		return deathday;
	}

	public int getGender() {
		return gender;
	}

	public String getHomepage() {
		return homepage;
	}

	public int getId() {
		return id;
	}

	public String getImdbId() {
		return imdbId;
	}

	public String getName() {
		return name;
	}

	public String getPlaceOfBirth() {
		return placeOfBirth;
	}

	public float getPopularity() {
		return popularity;
	}

	public String getProfilePath() {
		return profilePath;
	}

	public PeopleMovieCredits getMovieCredits() {
		return movieCredits;
	}

	public PeopleTvCredits getTvCredits() {
		return tvCredits;
	}

	public PeopleCombinedCredits getCombinedCredits() {
		return combinedCredits;
	}

	public PeopleExternalIds getExternalIds() {
		return externalIds;
	}

	public PeopleImages getImages() {
		return images;
	}

	public PeopleTaggedImages getTaggedImages() {
		return taggedImages;
	}
	
}
