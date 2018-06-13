package br.com.rodrigobriet.tmdbclient.resources.networks.models;

import com.google.gson.annotations.SerializedName;

public class NetworksDetails {

	@SerializedName("headquarters")
	private String headquarters;
	
	@SerializedName("homepage")
	private String homepage;
	
	@SerializedName("id")
	private int id;
	
	@SerializedName("name")
	private String name;
	
	@SerializedName("origin_country")
	private String originCountry;

	public String getHeadquarters() {
		return headquarters;
	}

	public String getHomepage() {
		return homepage;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getOriginCountry() {
		return originCountry;
	}
		
}
