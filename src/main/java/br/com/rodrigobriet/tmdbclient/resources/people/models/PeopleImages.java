package br.com.rodrigobriet.tmdbclient.resources.people.models;

import java.util.List;

import com.google.gson.annotations.SerializedName;

import br.com.rodrigobriet.tmdbclient.resources.people.models.submodels.PeopleImagesProfilesItem;

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
