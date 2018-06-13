package br.com.rodrigobriet.tmdbclient.resources.reviews.models;

import com.google.gson.annotations.SerializedName;

public class ReviewsDetails {

	@SerializedName("id")
	private String id;
	
	@SerializedName("author")
	private String author;
	
	@SerializedName("content")
	private String content;
	
	@SerializedName("iso_639_1")
	private String iso639_1;
	
	@SerializedName("media_id")
	private int mediaId;
	
	@SerializedName("media_title")
	private String mediaTitle;
	
	@SerializedName("media_type")
	private String mediaType;
	
	@SerializedName("url")
	private String url;

	public String getId() {
		return id;
	}

	public String getAuthor() {
		return author;
	}

	public String getContent() {
		return content;
	}

	public String getIso639_1() {
		return iso639_1;
	}

	public int getMediaId() {
		return mediaId;
	}

	public String getMediaTitle() {
		return mediaTitle;
	}

	public String getMediaType() {
		return mediaType;
	}

	public String getUrl() {
		return url;
	}
	
}
