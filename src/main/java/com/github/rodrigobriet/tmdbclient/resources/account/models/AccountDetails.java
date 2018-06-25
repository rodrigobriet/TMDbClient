package com.github.rodrigobriet.tmdbclient.resources.account.models;

import com.github.rodrigobriet.tmdbclient.resources.account.models.submodels.AccountAvatar;
import com.google.gson.annotations.SerializedName;

public class AccountDetails {

	@SerializedName("avatar")
	private AccountAvatar avatar;
	
	@SerializedName("id")
	private int id;
	
	@SerializedName("iso_639_1")
	private String iso639_1;
	
	@SerializedName("iso_3166_1")
	private String iso3166_1;
	
	@SerializedName("name")
	private String name;
	
	@SerializedName("include_adult")
	private boolean includeAdult;
	
	@SerializedName("username")
	private String username;

	public AccountAvatar getAvatar() {
		return avatar;
	}

	public int getId() {
		return id;
	}

	public String getIso639_1() {
		return iso639_1;
	}

	public String getIso3166_1() {
		return iso3166_1;
	}

	public String getName() {
		return name;
	}

	public boolean isIncludeAdult() {
		return includeAdult;
	}

	public String getUsername() {
		return username;
	}
	
}
