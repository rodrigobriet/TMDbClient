package br.com.rodrigobriet.tmdbclient.resources.credits.models.submodels;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class CreditsDetailsMedia {

	@SerializedName("id")
	private int id;
	
	@SerializedName("name")
	private String name;
	
	@SerializedName("original_name")
	private String originalName;
	
	@SerializedName("character")
	private String character;
	
	@SerializedName("episodes")
	private List<CreditsDetailsMediaEspisodes> episodes;
	
	@SerializedName("seasons")
	private List<CreditsDetailsMediaSeasons> seasons;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getOriginalName() {
		return originalName;
	}

	public String getCharacter() {
		return character;
	}

	public List<CreditsDetailsMediaEspisodes> getEpisodes() {
		return episodes;
	}

	public List<CreditsDetailsMediaSeasons> getSeasons() {
		return seasons;
	}
	
}
