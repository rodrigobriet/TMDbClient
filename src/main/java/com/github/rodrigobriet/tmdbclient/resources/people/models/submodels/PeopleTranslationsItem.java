package com.github.rodrigobriet.tmdbclient.resources.people.models.submodels;

import com.google.gson.annotations.SerializedName;

public class PeopleTranslationsItem {

	@SerializedName("iso_639_1")
	private String iso639_1;
	
	@SerializedName("iso_3166_1")
	private String iso3166_1;
	
	@SerializedName("name")
	private String name;
	
	@SerializedName("data")
	private PeopleTranslationsItemData data;
	
	@SerializedName("english_name")
	private String englishName;

	public String getIso639_1() {
		return iso639_1;
	}

	public String getIso3166_1() {
		return iso3166_1;
	}

	public String getName() {
		return name;
	}

	public PeopleTranslationsItemData getData() {
		return data;
	}

	public String getEnglishName() {
		return englishName;
	}
	
}
