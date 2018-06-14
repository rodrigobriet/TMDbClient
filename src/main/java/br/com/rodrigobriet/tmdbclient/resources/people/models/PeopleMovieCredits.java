package br.com.rodrigobriet.tmdbclient.resources.people.models;

import java.util.List;

import com.google.gson.annotations.SerializedName;

import br.com.rodrigobriet.tmdbclient.resources.people.models.submodels.PeopleMovieCast;
import br.com.rodrigobriet.tmdbclient.resources.people.models.submodels.PeopleMovieCrew;

public class PeopleMovieCredits {

	@SerializedName("id")
	private int id;
	
	@SerializedName("cast")
	private List<PeopleMovieCast> cast;
	
	@SerializedName("crew")
	private List<PeopleMovieCrew> crew;

	public int getId() {
		return id;
	}

	public List<PeopleMovieCast> getCast() {
		return cast;
	}

	public List<PeopleMovieCrew> getCrew() {
		return crew;
	}
	
}
