package com.github.rodrigobriet.tmdbclient.resources.tv.models.submodels;

import com.google.gson.annotations.SerializedName;

public class TvDetailsCreatedByItem {
	
	@SerializedName("id")
	private int id;
	
	@SerializedName("name")
	private String name;
	
	@SerializedName("gender")
	private int gender;
	
	@SerializedName("profile_path")
	private String profilePath;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getGender() {
		return gender;
	}

	public String getProfilePath() {
		return profilePath;
	}
	
}
