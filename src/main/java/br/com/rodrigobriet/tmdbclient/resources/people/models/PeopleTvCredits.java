package br.com.rodrigobriet.tmdbclient.resources.people.models;

import java.util.List;

import com.google.gson.annotations.SerializedName;

import br.com.rodrigobriet.tmdbclient.resources.people.models.submodels.PeopleTvCast;
import br.com.rodrigobriet.tmdbclient.resources.people.models.submodels.PeopleTvCrew;

public class PeopleTvCredits {

	@SerializedName("id")
	private int id;
	
	@SerializedName("cast")
	private List<PeopleTvCast> cast;
	
	@SerializedName("crew")
	private List<PeopleTvCrew> crew;

	public int getId() {
		return id;
	}

	public List<PeopleTvCast> getCast() {
		return cast;
	}

	public List<PeopleTvCrew> getCrew() {
		return crew;
	}
	
}
