package br.com.rodrigobriet.tmdbclient.resources.movies.models;

import java.util.List;

import com.google.gson.annotations.SerializedName;

import br.com.rodrigobriet.tmdbclient.resources.movies.models.submodels.MoviesAlternativeTitlesItem;

public class MoviesAlternativeTitles {

	@SerializedName("id")
	private int id;
	
	@SerializedName("titles")
	private List<MoviesAlternativeTitlesItem> titles;

	public int getId() {
		return id;
	}

	public List<MoviesAlternativeTitlesItem> getTitles() {
		return titles;
	}
	
}
