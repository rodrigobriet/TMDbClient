package br.com.rodrigobriet.tmdbclient.resources.collections.models;

import java.util.List;

import com.google.gson.annotations.SerializedName;

import br.com.rodrigobriet.tmdbclient.resources.collections.models.submodels.CollectionsPart;

public class CollectionsDetails {

	@SerializedName("id")
	private int id;
	
	@SerializedName("name")
	private String name;
	
	@SerializedName("overview")
	private String overview;
	
	@SerializedName("poster_path")
	private String posterPath;
	
	@SerializedName("backdrop_path")
	private String backdropPath;
	
	@SerializedName("parts")
	private List<CollectionsPart> parts;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getOverview() {
		return overview;
	}

	public String getPosterPath() {
		return posterPath;
	}

	public String getBackdropPath() {
		return backdropPath;
	}

	public List<CollectionsPart> getParts() {
		return parts;
	}
	
}
