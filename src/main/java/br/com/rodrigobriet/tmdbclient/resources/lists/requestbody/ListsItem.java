package br.com.rodrigobriet.tmdbclient.resources.lists.requestbody;

import com.google.gson.annotations.SerializedName;

public class ListsItem {

	@SerializedName("media_id")
	private int mediaId;

	public ListsItem(int mediaId) {
		this.mediaId = mediaId;
	}

	public int getMediaId() {
		return mediaId;
	}

	public void setMediaId(int mediaId) {
		this.mediaId = mediaId;
	}
	
}
