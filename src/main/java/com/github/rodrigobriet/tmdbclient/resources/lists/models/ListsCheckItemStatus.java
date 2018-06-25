package com.github.rodrigobriet.tmdbclient.resources.lists.models;

import com.google.gson.annotations.SerializedName;

public class ListsCheckItemStatus {

	@SerializedName("id")
	private String id;
	
	@SerializedName("item_present")
	private boolean itemPresent;

	public String getId() {
		return id;
	}

	public boolean isItemPresent() {
		return itemPresent;
	}
	
}
