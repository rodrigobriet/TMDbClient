package br.com.rodrigobriet.tmdbclient.resources.changes.models.submodels;

import com.google.gson.annotations.SerializedName;

public class ChangeList {

	@SerializedName("id")
	private int id;
	
	@SerializedName("adult")
	private boolean adult;

	public int getId() {
		return id;
	}

	public boolean isAdult() {
		return adult;
	}
	
}
