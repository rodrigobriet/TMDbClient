package br.com.rodrigobriet.tmdbclient.resources.collections.models;

import java.util.List;

import com.google.gson.annotations.SerializedName;

import br.com.rodrigobriet.tmdbclient.resources.collections.models.submodels.CollectionsImage;

public class CollectionsImages {

	@SerializedName("id")
	private int id;
	
	@SerializedName("backdrops")
	private List<CollectionsImage> backdrops;
	
	@SerializedName("posters")
	private List<CollectionsImage> posters;

	public int getId() {
		return id;
	}

	public List<CollectionsImage> getBackdrops() {
		return backdrops;
	}

	public List<CollectionsImage> getPosters() {
		return posters;
	}
	
}
