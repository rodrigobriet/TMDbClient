package br.com.rodrigobriet.tmdbclient.resources.configuration.models;

import com.google.gson.annotations.SerializedName;

public class ConfigurationCountries {

	@SerializedName("iso_3166_1")
	private String iso3166_1;
	
	@SerializedName("english_name")
	private String englishName;

	public String getIso3166_1() {
		return iso3166_1;
	}

	public String getEnglishName() {
		return englishName;
	}
	
}
