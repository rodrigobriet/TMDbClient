package br.com.rodrigobriet.tmdbclient.resources.companies.models.submodels;

import com.google.gson.annotations.SerializedName;

public class CompaniesAlternativeNamesResultItem {

	@SerializedName("name")
	private String name;
	
	@SerializedName("type")
	private String type;

	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}
	
}
