package br.com.rodrigobriet.tmdbclient.resources.movies.models;

import com.google.gson.annotations.SerializedName;

import br.com.rodrigobriet.tmdbclient.core.models.MovieResultItem;
import br.com.rodrigobriet.tmdbclient.core.models.Pagged;
import br.com.rodrigobriet.tmdbclient.resources.movies.models.submodels.MoviesNowPlayingDates;

public class MoviesNowPlaying extends Pagged<MovieResultItem> {

	@SerializedName("dates")
	private MoviesNowPlayingDates dates;

	public MoviesNowPlayingDates getDates() {
		return dates;
	}
	
}
