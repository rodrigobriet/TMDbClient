package br.com.rodrigobriet.tmdbclient.core.models;

import com.google.gson.annotations.SerializedName;

public class CompaniesResultItem {

	@SerializedName("id")
	private int id;
	
	@SerializedName("logo_path")
	private String logoPath;
	
	@SerializedName("name")
	private String name;

	public int getId() {
		return id;
	}

	public String getLogoPath() {
		return logoPath;
	}

	public String getName() {
		return name;
	}
	
}
