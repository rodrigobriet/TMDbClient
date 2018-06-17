package br.com.rodrigobriet.tmdbclient.resources.movies.models;

import java.util.List;

import com.google.gson.annotations.SerializedName;

import br.com.rodrigobriet.tmdbclient.resources.movies.models.submodels.MoviesTranslationsItem;

public class MoviesTranslations {

	@SerializedName("id")
	private int id;
	
	@SerializedName("translations")
	private List<MoviesTranslationsItem> translations;

	public int getId() {
		return id;
	}

	public List<MoviesTranslationsItem> getTranslations() {
		return translations;
	}
	
}
