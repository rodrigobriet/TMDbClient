package br.com.rodrigobriet.tmdbclient.resources.companies.models;

import java.util.List;

import com.google.gson.annotations.SerializedName;

import br.com.rodrigobriet.tmdbclient.resources.companies.models.submodels.CompaniesAlternativeNamesList;

public class CompaniesAlternativeNames {

	@SerializedName("id")
	private int id;
	
	@SerializedName("results")
	private List<CompaniesAlternativeNamesList> results;

	public int getId() {
		return id;
	}

	public List<CompaniesAlternativeNamesList> getResults() {
		return results;
	}
	
}
