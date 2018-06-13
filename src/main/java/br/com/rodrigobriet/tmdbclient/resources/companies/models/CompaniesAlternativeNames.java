package br.com.rodrigobriet.tmdbclient.resources.companies.models;

import java.util.List;

import com.google.gson.annotations.SerializedName;

import br.com.rodrigobriet.tmdbclient.resources.companies.models.submodels.CompaniesAlternativeNamesResultItem;

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
