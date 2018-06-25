package com.github.rodrigobriet.tmdbclient.resources.account.requestbody;

import com.google.gson.annotations.SerializedName;

public class AccountAddWatchList {

	@SerializedName("media_type")
	private String mediaType;
	
	@SerializedName("media_id")
	private int mediaId;
	
	@SerializedName("watchlist")
	private boolean watchlist;
	
	public AccountAddWatchList(AccountMediaType mediaType, int mediaId, boolean watchlist) {
		this.mediaType = mediaType.getValue();
		this.mediaId = mediaId;
		this.watchlist = watchlist;
	}

	public String getMediaType() {
		return mediaType;
	}

	public int getMediaId() {
		return mediaId;
	}

	public boolean isWatchlist() {
		return watchlist;
	}
	
}
