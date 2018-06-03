package br.com.rodrigobriet.tmdbclient.resources.collections.models;

import java.util.List;

import com.google.gson.annotations.SerializedName;

import br.com.rodrigobriet.tmdbclient.resources.collections.models.submodels.CollectionsTranslation;

public class CollectionsTranslations {

	@SerializedName("id")
	private int id;
	
	@SerializedName("translations")
	private List<CollectionsTranslation> translations;

	public int getId() {
		return id;
	}

	public List<CollectionsTranslation> getTranslations() {
		return translations;
	}
	
}
