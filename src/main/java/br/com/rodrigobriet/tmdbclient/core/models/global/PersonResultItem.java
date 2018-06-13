package br.com.rodrigobriet.tmdbclient.core.models.global;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class PersonResultItem {

	@SerializedName("profile_path")
	private String profilePath;
	
	@SerializedName("adult")
	private boolean adult;
	
	@SerializedName("id")
	private int id;
	
	@SerializedName("name")
	private String name;
	
	@SerializedName("popularity")
	private float popularity;
		
	private List<MovieResultItem> knownMovies;
	
	private List<TvResultItem> knownTv;
	
	public PersonResultItem(String profilePath, boolean adult, int id, String name, float popularity,
			List<MovieResultItem> knownMovies, List<TvResultItem> knownTv) {
		super();
		this.profilePath = profilePath;
		this.adult = adult;
		this.id = id;
		this.name = name;
		this.popularity = popularity;
		this.knownMovies = knownMovies;
		this.knownTv = knownTv;
	}

	public String getProfilePath() {
		return profilePath;
	}

	public boolean isAdult() {
		return adult;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public float getPopularity() {
		return popularity;
	}

	public List<MovieResultItem> getKnownMovies() {
		return knownMovies;
	}

	public List<TvResultItem> getKnownTv() {
		return knownTv;
	}
	
}
