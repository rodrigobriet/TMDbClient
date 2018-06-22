package br.com.rodrigobriet.tmdbclient.core.models;

import com.google.gson.annotations.SerializedName;

public class AlternativeTitlesItem {

	@SerializedName("iso_3166_1")
	private String iso3166_1;
	
	@SerializedName("title")
	private String title;
	
	@SerializedName("type")
	private String type;

	public String getIso3166_1() {
		return iso3166_1;
	}

	public String getTitle() {
		return title;
	}

	public String getType() {
		return type;
	}
	
}
