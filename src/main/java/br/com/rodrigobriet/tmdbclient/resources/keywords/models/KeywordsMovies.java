package br.com.rodrigobriet.tmdbclient.resources.keywords.models;

import com.google.gson.annotations.SerializedName;

import br.com.rodrigobriet.tmdbclient.core.models.Pagged;
import br.com.rodrigobriet.tmdbclient.resources.keywords.models.submodels.KeywordsMoviesResultItem;

public class KeywordsMovies extends Pagged<KeywordsMoviesResultItem> {

	@SerializedName("id")
	private int id;

	public int getId() {
		return id;
	}
	
}
