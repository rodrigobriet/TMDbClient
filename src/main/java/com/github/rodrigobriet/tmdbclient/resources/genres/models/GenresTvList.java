package com.github.rodrigobriet.tmdbclient.resources.genres.models;

import java.util.List;

import com.github.rodrigobriet.tmdbclient.resources.genres.models.submodels.GenresItem;
import com.google.gson.annotations.SerializedName;

public class GenresTvList {

	@SerializedName("genres")
	private List<GenresItem> genres;

	public List<GenresItem> getGenres() {
		return genres;
	}
	
}
