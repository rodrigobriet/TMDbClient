package com.github.rodrigobriet.tmdbclient.core.models;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class Pagged<T> {

	@SerializedName("page")
	private int page;
	
	@SerializedName("results")
	private List<T> results;

	@SerializedName("total_pages")
	private int totalPages;
	
	@SerializedName("total_results")
	private int totalResults;

	public int getPage() {
		return page;
	}

	public List<T> getResults() {
		return results;
	}

	public int getTotalPages() {
		return totalPages;
	}

	public int getTotalResults() {
		return totalResults;
	}
}
