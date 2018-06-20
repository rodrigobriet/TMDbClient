package br.com.rodrigobriet.tmdbclient.resources.tvseasons.models;

import java.util.List;

import com.google.gson.annotations.SerializedName;

import br.com.rodrigobriet.tmdbclient.core.models.global.ImagesItem;

public class TvSeasonsImages {

	@SerializedName("id")
	private int id;
	
	@SerializedName("posters")
	private List<ImagesItem> posters;

	public int getId() {
		return id;
	}

	public List<ImagesItem> getPosters() {
		return posters;
	}
	
}
