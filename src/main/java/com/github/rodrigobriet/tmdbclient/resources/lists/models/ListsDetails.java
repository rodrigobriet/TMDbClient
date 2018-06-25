package com.github.rodrigobriet.tmdbclient.resources.lists.models;

import java.util.List;

import com.github.rodrigobriet.tmdbclient.resources.lists.models.submodels.ListsDetailsResultItem;
import com.google.gson.annotations.SerializedName;

public class ListsDetails {

	@SerializedName("created_by")
	private String createdBy;
	
	@SerializedName("description")
	private String description;
	
	@SerializedName("favorite_count")
	private int favoriteCount;
	
	@SerializedName("id")
	private int id;
	
	@SerializedName("items")
	private List<ListsDetailsResultItem> items;
	
	@SerializedName("item_count")
	private int itemCount;
	
	@SerializedName("iso_639_1")
	private String iso639_1;
	
	@SerializedName("name")
	private String name;
	
	@SerializedName("poster_path")
	private String posterPath;

	public String getCreatedBy() {
		return createdBy;
	}

	public String getDescription() {
		return description;
	}

	public int getFavoriteCount() {
		return favoriteCount;
	}

	public int getId() {
		return id;
	}

	public List<ListsDetailsResultItem> getItems() {
		return items;
	}

	public int getItemCount() {
		return itemCount;
	}

	public String getIso639_1() {
		return iso639_1;
	}

	public String getName() {
		return name;
	}

	public String getPosterPath() {
		return posterPath;
	}
	
}
