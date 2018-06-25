package com.github.rodrigobriet.tmdbclient.resources.people.models;

import java.util.List;

import com.github.rodrigobriet.tmdbclient.resources.people.models.submodels.PeopleMovieCast;
import com.github.rodrigobriet.tmdbclient.resources.people.models.submodels.PeopleMovieCrew;
import com.google.gson.annotations.SerializedName;

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
