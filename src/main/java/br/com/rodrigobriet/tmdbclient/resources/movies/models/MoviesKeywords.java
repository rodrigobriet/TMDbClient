package br.com.rodrigobriet.tmdbclient.resources.movies.models;

import java.util.List;

import com.google.gson.annotations.SerializedName;

import br.com.rodrigobriet.tmdbclient.resources.movies.models.submodels.MoviesKeywordsItem;

public class MoviesKeywords {

	@SerializedName("id")
	private int id;
	
	@SerializedName("keywords")
	private List<MoviesKeywordsItem> keywords;

	public int getId() {
		return id;
	}

	public List<MoviesKeywordsItem> getKeywords() {
		return keywords;
	}
	
}
