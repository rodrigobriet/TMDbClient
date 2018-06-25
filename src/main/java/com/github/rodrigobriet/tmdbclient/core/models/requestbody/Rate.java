package com.github.rodrigobriet.tmdbclient.core.models.requestbody;

import com.google.gson.annotations.SerializedName;

public class Rate {

	@SerializedName("value")
	private float value;

	public Rate(float rate) {
		this.value = rate;
	}

	public float getValue() {
		return value;
	}

	public void setValue(float value) {
		this.value = value;
	}
	
}
