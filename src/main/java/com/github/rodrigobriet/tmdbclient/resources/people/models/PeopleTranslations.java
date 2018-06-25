package com.github.rodrigobriet.tmdbclient.resources.people.models;

import java.util.List;

import com.github.rodrigobriet.tmdbclient.resources.people.models.submodels.PeopleTranslationsItem;
import com.google.gson.annotations.SerializedName;

public class PeopleTranslations {

	@SerializedName("id")
	private int id;
	
	@SerializedName("translations")
	private List<PeopleTranslationsItem> translations;

	public int getId() {
		return id;
	}

	public List<PeopleTranslationsItem> getTranslations() {
		return translations;
	}
	
}
