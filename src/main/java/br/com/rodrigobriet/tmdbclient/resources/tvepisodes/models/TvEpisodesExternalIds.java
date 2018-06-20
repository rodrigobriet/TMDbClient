package br.com.rodrigobriet.tmdbclient.resources.tvepisodes.models;

import com.google.gson.annotations.SerializedName;

public class TvEpisodesExternalIds {

	@SerializedName("imdb_id")
	private String imdbId;
	
	@SerializedName("freebase_mid")
	private String freebaseMid;
	
	@SerializedName("freebase_id")
	private String freebaseId;
	
	@SerializedName("tvdb_id")
	private int tvdbId;
	
	@SerializedName("tvrage_id")
	private int tvrage_id;
	
	@SerializedName("id")
	private int id;

	public String getImdbId() {
		return imdbId;
	}

	public String getFreebaseMid() {
		return freebaseMid;
	}

	public String getFreebaseId() {
		return freebaseId;
	}

	public int getTvdbId() {
		return tvdbId;
	}

	public int getTvrage_id() {
		return tvrage_id;
	}

	public int getId() {
		return id;
	}
	
}
