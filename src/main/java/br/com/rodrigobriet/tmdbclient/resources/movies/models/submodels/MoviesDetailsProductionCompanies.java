package br.com.rodrigobriet.tmdbclient.resources.movies.models.submodels;

import com.google.gson.annotations.SerializedName;

public class MoviesDetailsProductionCompanies {

	@SerializedName("name")
	private String name;
	
	@SerializedName("id")
	private int id;
	
	@SerializedName("logo_path")
	private String logoPath;
	
	@SerializedName("origin_country")
	private String originCountry;

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public String getLogoPath() {
		return logoPath;
	}

	public String getOriginCountry() {
		return originCountry;
	}
	
}
