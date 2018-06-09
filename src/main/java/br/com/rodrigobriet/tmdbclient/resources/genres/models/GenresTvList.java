package br.com.rodrigobriet.tmdbclient.resources.genres.models;

import java.util.List;

import com.google.gson.annotations.SerializedName;

import br.com.rodrigobriet.tmdbclient.resources.genres.models.submodels.GenresItem;

public class GenresTvList {

	@SerializedName("genres")
	private List<GenresItem> genres;

	public List<GenresItem> getGenres() {
		return genres;
	}
	
}
