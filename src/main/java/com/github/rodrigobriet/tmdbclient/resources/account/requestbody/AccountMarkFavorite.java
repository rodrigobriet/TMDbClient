package com.github.rodrigobriet.tmdbclient.resources.account.requestbody;

import com.google.gson.annotations.SerializedName;

public class AccountMarkFavorite {

	@SerializedName("media_type")
	private String mediaType;
	
	@SerializedName("media_id")
	private int mediaId;
	
	@SerializedName("favorite")
	private boolean favorite;
	
	public AccountMarkFavorite(AccountMediaType mediaType, int mediaId, boolean favorite) {
		this.mediaType = mediaType.getValue();
		this.mediaId = mediaId;
		this.favorite = favorite;
	}

	public String getMediaType() {
		return mediaType;
	}

	public int getMediaId() {
		return mediaId;
	}

	public boolean isFavorite() {
		return favorite;
	}

}
