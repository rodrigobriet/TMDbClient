package br.com.rodrigobriet.tmdbclient.resources.movies.requestbody;

import com.google.gson.annotations.SerializedName;

public class MoviesRate {

	@SerializedName("value")
	private float value;

	public MoviesRate(float rate) {
		this.value = rate;
	}

	public float getValue() {
		return value;
	}

	public void setValue(float value) {
		this.value = value;
	}
	
}
