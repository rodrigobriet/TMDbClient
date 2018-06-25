package com.github.rodrigobriet.tmdbclient.resources.companies.models;

import com.google.gson.annotations.SerializedName;

public class CompaniesDetails {

	@SerializedName("description")
	private String description;
	
	@SerializedName("headquarters")
	private String headquarters;
	
	@SerializedName("homepage")
	private String homepage;
	
	@SerializedName("id")
	private int id;
	
	@SerializedName("logo_path")
	private String logoPath;
	
	@SerializedName("name")
	private String name;
	
	@SerializedName("origin_country")
	private String originCountry;
	
	@SerializedName("parent_company")
	private CompaniesDetails parenteCompany;

	public String getDescription() {
		return description;
	}

	public String getHeadquarters() {
		return headquarters;
	}

	public String getHomepage() {
		return homepage;
	}

	public int getId() {
		return id;
	}

	public String getLogoPath() {
		return logoPath;
	}

	public String getName() {
		return name;
	}

	public String getOriginCountry() {
		return originCountry;
	}

	public CompaniesDetails getParenteCompany() {
		return parenteCompany;
	}
	
}
