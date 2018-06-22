package br.com.rodrigobriet.tmdbclient.core.models;

import com.google.gson.annotations.SerializedName;

public class GuestStars {

	@SerializedName("id")
	private int id;
	
	@SerializedName("name")
	private String name;
	
	@SerializedName("credit_id")
	private String creditId;
	
	@SerializedName("character")
	private String character;
	
	@SerializedName("order")
	private int order;	
	
	@SerializedName("profile_path")
	private String profilePath;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getCreditId() {
		return creditId;
	}

	public String getCharacter() {
		return character;
	}

	public int getOrder() {
		return order;
	}

	public String getProfilePath() {
		return profilePath;
	}
	
}
