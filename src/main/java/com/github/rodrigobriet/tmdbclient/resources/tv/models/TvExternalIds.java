package com.github.rodrigobriet.tmdbclient.resources.tv.models;

import com.google.gson.annotations.SerializedName;

public class TvExternalIds {

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
	
	@SerializedName("facebook_id")
	private String facebookId;
	
	@SerializedName("instagram_id")
	private String instagramId;
	
	@SerializedName("twitter_id")
	private String twitterId;
	
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

	public String getFacebookId() {
		return facebookId;
	}

	public String getInstagramId() {
		return instagramId;
	}

	public String getTwitterId() {
		return twitterId;
	}

	public int getId() {
		return id;
	}
	
}
