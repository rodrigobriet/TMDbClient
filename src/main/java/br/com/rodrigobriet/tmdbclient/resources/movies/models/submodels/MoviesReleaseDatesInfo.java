package br.com.rodrigobriet.tmdbclient.resources.movies.models.submodels;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class MoviesReleaseDatesInfo {

	@SerializedName("iso_3166_1")
	private String iso3166_1;
	
	@SerializedName("release_dates")
	private List<MoviesReleaseDatesItem> releaseDates;

	public String getIso3166_1() {
		return iso3166_1;
	}

	public List<MoviesReleaseDatesItem> getReleaseDates() {
		return releaseDates;
	}
	
}
