package br.com.rodrigobriet.tmdbclient.resources.collections.models.submodels;

import com.google.gson.annotations.SerializedName;

public class CollectionsTranslation {
	
	@SerializedName("iso_3166_1")
	private String iso3166_1;
	
	@SerializedName("iso_639_1")
	private String iso639_1;
	
	@SerializedName("name")
	private String name;
	
	@SerializedName("english_name")
	private String englishName;
	
	@SerializedName("data")
	private CollestionsTranslationData data;

	public String getIso3166_1() {
		return iso3166_1;
	}

	public String getIso639_1() {
		return iso639_1;
	}

	public String getName() {
		return name;
	}

	public String getEnglishName() {
		return englishName;
	}

	public CollestionsTranslationData getData() {
		return data;
	}
	
}
