package br.com.rodrigobriet.tmdbclient.core.models.global;

import com.google.gson.annotations.SerializedName;

public class DetailsGenresItem {

	@SerializedName("id")
	private int id;
	
	@SerializedName("name")
	private String name;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
}
