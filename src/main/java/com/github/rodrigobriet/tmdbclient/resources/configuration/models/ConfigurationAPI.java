package com.github.rodrigobriet.tmdbclient.resources.configuration.models;

import java.util.List;

import com.github.rodrigobriet.tmdbclient.resources.configuration.models.submodels.ConfigurationAPIImage;
import com.google.gson.annotations.SerializedName;

public class ConfigurationAPI {

	@SerializedName("images")
	private ConfigurationAPIImage images;
	
	@SerializedName("change_keys")
	private List<String> changeKeys;

	public ConfigurationAPIImage getImages() {
		return images;
	}

	public List<String> getChangeKeys() {
		return changeKeys;
	}
	
}
