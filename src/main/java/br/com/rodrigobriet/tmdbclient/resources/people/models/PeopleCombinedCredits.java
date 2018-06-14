package br.com.rodrigobriet.tmdbclient.resources.people.models;

import java.util.List;

import com.google.gson.annotations.SerializedName;

import br.com.rodrigobriet.tmdbclient.resources.people.models.submodels.PeopleMovieCast;
import br.com.rodrigobriet.tmdbclient.resources.people.models.submodels.PeopleMovieCrew;
import br.com.rodrigobriet.tmdbclient.resources.people.models.submodels.PeopleTvCast;
import br.com.rodrigobriet.tmdbclient.resources.people.models.submodels.PeopleTvCrew;

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
