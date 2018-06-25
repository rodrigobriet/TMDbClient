package com.github.rodrigobriet.tmdbclient.core.models;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class Credits {

	@SerializedName("id")
	private int id;
	
	@SerializedName("cast")
	private List<CreditsCast> cast;
	
	@SerializedName("crew")
	private List<CreditsCrew> crew;

	public int getId() {
		return id;
	}

	public List<CreditsCast> getCast() {
		return cast;
	}

	public List<CreditsCrew> getCrew() {
		return crew;
	}
	
}
