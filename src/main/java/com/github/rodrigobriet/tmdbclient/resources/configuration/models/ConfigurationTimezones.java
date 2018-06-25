package com.github.rodrigobriet.tmdbclient.resources.configuration.models;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class ConfigurationTimezones {

	@SerializedName("iso_3166_1")
	private String iso3166_1;
	
	@SerializedName("zones")
	private List<String> zones;

	public String getIso3166_1() {
		return iso3166_1;
	}

	public List<String> getZones() {
		return zones;
	}
	
}
