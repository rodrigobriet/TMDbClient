package com.github.rodrigobriet.tmdbclient.resources.keywords.models;

import com.github.rodrigobriet.tmdbclient.core.models.Pagged;
import com.github.rodrigobriet.tmdbclient.resources.keywords.models.submodels.KeywordsMoviesResultItem;
import com.google.gson.annotations.SerializedName;

public class KeywordsMovies extends Pagged<KeywordsMoviesResultItem> {

	@SerializedName("id")
	private int id;

	public int getId() {
		return id;
	}
	
}
