package com.github.rodrigobriet.tmdbclient.resources.people.models;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class PeopleLatest {

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
	
}
