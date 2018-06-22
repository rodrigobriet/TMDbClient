package br.com.rodrigobriet.tmdbclient.core.models;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class AlternativeTitles {

	@SerializedName("id")
	private int id;
	
	@SerializedName("titles")
	private List<AlternativeTitlesItem> titles;

	public int getId() {
		return id;
	}

	public List<AlternativeTitlesItem> getTitles() {
		return titles;
	}
	
}
