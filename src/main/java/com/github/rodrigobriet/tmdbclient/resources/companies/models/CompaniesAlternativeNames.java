package com.github.rodrigobriet.tmdbclient.resources.companies.models;

import java.util.List;

import com.github.rodrigobriet.tmdbclient.resources.companies.models.submodels.CompaniesAlternativeNamesResultItem;
import com.google.gson.annotations.SerializedName;

public class CompaniesAlternativeNames {

	@SerializedName("id")
	private int id;
	
	@SerializedName("results")
	private List<CompaniesAlternativeNamesResultItem> results;

	public int getId() {
		return id;
	}

	public List<CompaniesAlternativeNamesResultItem> getResults() {
		return results;
	}
	
}
