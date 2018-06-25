package com.github.rodrigobriet.tmdbclient.resources.account.models.submodels;

import com.google.gson.annotations.SerializedName;

public class AccountCreatedListResultItem {
	
	@SerializedName("description")
	private String description;
	
	@SerializedName("favorite_count")
	private int favoriteCount;
	
	@SerializedName("id")
	private int id;
	
	@SerializedName("item_count")
	private int itemCount;
	
	@SerializedName("iso_639_1")
	private String iso639_1;
	
	@SerializedName("list_type")
	private String listType;
	
	@SerializedName("name")
	private String name;
	
	@SerializedName("poster_path")
	private String posterPath;

	public String getDescription() {
		return description;
	}

	public int getFavoriteCount() {
		return favoriteCount;
	}

	public int getId() {
		return id;
	}

	public int getItemCount() {
		return itemCount;
	}

	public String getIso639_1() {
		return iso639_1;
	}

	public String getListType() {
		return listType;
	}

	public String getName() {
		return name;
	}

	public String getPosterPath() {
		return posterPath;
	}
	
}
