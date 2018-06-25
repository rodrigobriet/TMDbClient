package com.github.rodrigobriet.tmdbclient.core.models;

import com.google.gson.annotations.SerializedName;

public class AccountStatesRate {

	@SerializedName("value")
	private int value;

	public int getValue() {
		return value;
	}
	
}
