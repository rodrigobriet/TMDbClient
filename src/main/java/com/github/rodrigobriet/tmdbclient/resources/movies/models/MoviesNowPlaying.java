package com.github.rodrigobriet.tmdbclient.resources.movies.models;

import com.github.rodrigobriet.tmdbclient.core.models.MovieResultItem;
import com.github.rodrigobriet.tmdbclient.core.models.Pagged;
import com.github.rodrigobriet.tmdbclient.resources.movies.models.submodels.MoviesNowPlayingDates;
import com.google.gson.annotations.SerializedName;

public class MoviesNowPlaying extends Pagged<MovieResultItem> {

	@SerializedName("dates")
	private MoviesNowPlayingDates dates;

	public MoviesNowPlayingDates getDates() {
		return dates;
	}
	
}
