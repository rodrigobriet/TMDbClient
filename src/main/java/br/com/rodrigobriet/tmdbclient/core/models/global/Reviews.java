package br.com.rodrigobriet.tmdbclient.core.models.global;

import com.google.gson.annotations.SerializedName;

import br.com.rodrigobriet.tmdbclient.core.models.Pagged;

public class Reviews extends Pagged<ReviewsResultItem> {

	@SerializedName("id")
	private int id;

	public int getId() {
		return id;
	}
	
}
