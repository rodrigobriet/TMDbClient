package br.com.rodrigobriet.tmdbclient.resources.people.models.submodels;

import com.google.gson.annotations.SerializedName;

public class PeopleTranslationsItemData {

	@SerializedName("biography")
	private String biography;

	public String getBiography() {
		return biography;
	}
	
}
