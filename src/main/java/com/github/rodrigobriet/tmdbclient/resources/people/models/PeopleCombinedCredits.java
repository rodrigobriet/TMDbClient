package com.github.rodrigobriet.tmdbclient.resources.people.models;

import java.util.List;

import com.github.rodrigobriet.tmdbclient.resources.people.models.submodels.PeopleMovieCast;
import com.github.rodrigobriet.tmdbclient.resources.people.models.submodels.PeopleMovieCrew;
import com.github.rodrigobriet.tmdbclient.resources.people.models.submodels.PeopleTvCast;
import com.github.rodrigobriet.tmdbclient.resources.people.models.submodels.PeopleTvCrew;
import com.google.gson.annotations.SerializedName;

public class PeopleCombinedCredits {

	@SerializedName("id")
	private int id;
	
	private List<PeopleMovieCast> movieCast;
	
	private List<PeopleMovieCrew> movieCrew;
	
	private List<PeopleTvCast> tvCast;
	
	private List<PeopleTvCrew> tvCrew;

	public PeopleCombinedCredits(int id, List<PeopleMovieCast> movieCast, List<PeopleMovieCrew> movieCrew,
			List<PeopleTvCast> tvCast, List<PeopleTvCrew> tvCrew) {
		this.id = id;
		this.movieCast = movieCast;
		this.movieCrew = movieCrew;
		this.tvCast = tvCast;
		this.tvCrew = tvCrew;
	}

	public int getId() {
		return id;
	}

	public List<PeopleMovieCast> getMovieCast() {
		return movieCast;
	}

	public List<PeopleMovieCrew> getMovieCrew() {
		return movieCrew;
	}

	public List<PeopleTvCast> getTvCast() {
		return tvCast;
	}

	public List<PeopleTvCrew> getTvCrew() {
		return tvCrew;
	}
	
}
