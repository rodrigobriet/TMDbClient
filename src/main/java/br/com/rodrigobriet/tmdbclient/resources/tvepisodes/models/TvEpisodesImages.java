package br.com.rodrigobriet.tmdbclient.resources.tvepisodes.models;

import java.util.List;

import com.google.gson.annotations.SerializedName;

import br.com.rodrigobriet.tmdbclient.core.models.ImagesItem;

public class TvEpisodesImages {

	@SerializedName("id")
	private int id;
	
	@SerializedName("stills")
	private List<ImagesItem> stills;

	public int getId() {
		return id;
	}

	public List<ImagesItem> getStills() {
		return stills;
	}
	
}
