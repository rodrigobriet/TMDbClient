package br.com.rodrigobriet.tmdbclient.resources.people.models;

import com.google.gson.annotations.SerializedName;

public class PeopleExternalIds {

	@SerializedName("imdb_id")
	private String imdbId;
	
	@SerializedName("facebook_id")
	private String facebookId;
	
	@SerializedName("freebase_mid")
	private String freebaseMid;
	
	@SerializedName("freebase_id")
	private String freebaseId;
	
	@SerializedName("tvrage_id")
	private int tvrageId;
	
	@SerializedName("twitter_id")
	private String twitterId;
	
	@SerializedName("id")
	private int id;
	
	@SerializedName("instagram_id")
	private String instagramId;

	public String getImdbId() {
		return imdbId;
	}

	public String getFacebookId() {
		return facebookId;
	}

	public String getFreebaseMid() {
		return freebaseMid;
	}

	public String getFreebaseId() {
		return freebaseId;
	}

	public int getTvrageId() {
		return tvrageId;
	}

	public String getTwitterId() {
		return twitterId;
	}

	public int getId() {
		return id;
	}

	public String getInstagramId() {
		return instagramId;
	}
	
}
