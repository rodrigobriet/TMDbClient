package br.com.rodrigobriet.tmdbclient.resources.companies.models;

import java.util.List;

import com.google.gson.annotations.SerializedName;

import br.com.rodrigobriet.tmdbclient.resources.companies.models.submodels.CompaniesImagesLogo;

public class CompaniesImages {

	@SerializedName("id")
	private int id;
	
	@SerializedName("logos")
	private List<CompaniesImagesLogo> logos;

	public int getId() {
		return id;
	}

	public List<CompaniesImagesLogo> getLogos() {
		return logos;
	}
	
}
