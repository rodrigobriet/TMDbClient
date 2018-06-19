package br.com.rodrigobriet.tmdbclient.core.models.global;

import com.google.gson.annotations.SerializedName;

public class AccountStatesRate {

	@SerializedName("value")
	private int value;

	public int getValue() {
		return value;
	}
	
}
