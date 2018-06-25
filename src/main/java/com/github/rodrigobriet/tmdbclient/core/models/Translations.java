package com.github.rodrigobriet.tmdbclient.core.models;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class Translations<TranlationData> {

	@SerializedName("id")
	private int id;
	
	@SerializedName("translations")
	private List<TranslationsItem<TranlationData>> translations;

	public int getId() {
		return id;
	}

	public List<TranslationsItem<TranlationData>> getTranslations() {
		return translations;
	}
	
}
