package br.com.rodrigobriet.tmdbclient.resources.find.models.submodels;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class FindPersonResultItem {

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
		
	private List<FindPersonResultItemKnowForMovie> knownMovies;
	
	private List<FindPersonResultItemKnowForTv> knownTv;

	public FindPersonResultItem(String profilePath, boolean adult, int id, String name, float popularity,
			List<FindPersonResultItemKnowForMovie> knownMovies, List<FindPersonResultItemKnowForTv> knownTv) {
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

	public List<FindPersonResultItemKnowForMovie> getKnownMovies() {
		return knownMovies;
	}

	public List<FindPersonResultItemKnowForTv> getKnownTv() {
		return knownTv;
	}
	
}
