package com.github.rodrigobriet.tmdbclient.resources.people.models;

import java.util.List;

import com.github.rodrigobriet.tmdbclient.resources.people.models.submodels.PeopleImagesProfilesItem;
import com.google.gson.annotations.SerializedName;

public class PeopleImages {

	@SerializedName("id")
	private int id;
	
	@SerializedName("profiles")
	private List<PeopleImagesProfilesItem> profiles;

	public int getId() {
		return id;
	}

	public List<PeopleImagesProfilesItem> getProfiles() {
		return profiles;
	}
	
}
