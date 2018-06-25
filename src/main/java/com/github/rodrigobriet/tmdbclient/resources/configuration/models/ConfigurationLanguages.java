package com.github.rodrigobriet.tmdbclient.resources.configuration.models;

import com.google.gson.annotations.SerializedName;

public class ConfigurationLanguages {

	@SerializedName("iso_639_1")
	private String iso639_1;
	
	@SerializedName("english_name")
	private String englishName;
	
	@SerializedName("name")
	private String name;

	public String getIso639_1() {
		return iso639_1;
	}

	public String getEnglishName() {
		return englishName;
	}

	public String getName() {
		return name;
	}
	
}
