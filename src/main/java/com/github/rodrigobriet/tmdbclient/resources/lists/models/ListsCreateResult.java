package com.github.rodrigobriet.tmdbclient.resources.lists.models;

import com.github.rodrigobriet.tmdbclient.core.models.StatusMessage;
import com.google.gson.annotations.SerializedName;

public class ListsCreateResult extends StatusMessage {

	@SerializedName("success")
	private boolean success;
	
	@SerializedName("list_id")
	private int listId;

	public boolean isSuccess() {
		return success;
	}

	public int getListId() {
		return listId;
	}
	
}
