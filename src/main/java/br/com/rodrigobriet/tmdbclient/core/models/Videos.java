package br.com.rodrigobriet.tmdbclient.core.models;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class Videos {

	@SerializedName("id")
	private int id;
	
	@SerializedName("results")
	private List<VideosItem> results;

	public int getId() {
		return id;
	}

	public List<VideosItem> getResults() {
		return results;
	}
	
}
