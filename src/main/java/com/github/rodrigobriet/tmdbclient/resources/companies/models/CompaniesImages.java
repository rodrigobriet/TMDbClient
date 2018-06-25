package com.github.rodrigobriet.tmdbclient.resources.companies.models;

import java.util.List;

import com.github.rodrigobriet.tmdbclient.resources.companies.models.submodels.CompaniesImagesLogosItem;
import com.google.gson.annotations.SerializedName;

public class CompaniesImages {

	@SerializedName("id")
	private int id;
	
	@SerializedName("logos")
	private List<CompaniesImagesLogosItem> logos;

	public int getId() {
		return id;
	}

	public List<CompaniesImagesLogosItem> getLogos() {
		return logos;
	}
	
}
