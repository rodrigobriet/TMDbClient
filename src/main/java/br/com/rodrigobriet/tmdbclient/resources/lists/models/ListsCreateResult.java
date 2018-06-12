package br.com.rodrigobriet.tmdbclient.resources.lists.models;

import com.google.gson.annotations.SerializedName;

import br.com.rodrigobriet.tmdbclient.core.models.StatusMessage;

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
