package br.com.rodrigobriet.tmdbclient.resources.movies.models.submodels;

import com.google.gson.annotations.SerializedName;

public class MoviesReviewsResultItem {

	@SerializedName("id")
	private String id;
	
	@SerializedName("author")
	private String author;
	
	@SerializedName("content")
	private String content;
	
	@SerializedName("url")
	private String url;

	public String getId() {
		return id;
	}

	public String getAuthor() {
		return author;
	}

	public String getContent() {
		return content;
	}

	public String getUrl() {
		return url;
	}
	
}
