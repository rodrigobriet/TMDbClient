package br.com.rodrigobriet.tmdbclient.resources.movies.models;

import java.util.List;

import com.google.gson.annotations.SerializedName;

import br.com.rodrigobriet.tmdbclient.resources.movies.models.submodels.MoviesCreditsCast;
import br.com.rodrigobriet.tmdbclient.resources.movies.models.submodels.MoviesCreditsCrew;

public class MoviesCredits {

	@SerializedName("id")
	private int id;
	
	@SerializedName("cast")
	private List<MoviesCreditsCast> cast;
	
	@SerializedName("crew")
	private List<MoviesCreditsCrew> crew;

	public int getId() {
		return id;
	}

	public List<MoviesCreditsCast> getCast() {
		return cast;
	}

	public List<MoviesCreditsCrew> getCrew() {
		return crew;
	}
	
}
