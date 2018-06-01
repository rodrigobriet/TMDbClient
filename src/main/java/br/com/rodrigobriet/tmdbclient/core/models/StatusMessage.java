package br.com.rodrigobriet.tmdbclient.core.models;

import com.google.gson.annotations.SerializedName;

public class StatusMessage {

	@SerializedName("status_code")
	private int statusCode;
	
	@SerializedName("status_message")
	private String statusMessage;

	public int getCode() {
		return statusCode;
	}

	public String getMessage() {
		return statusMessage;
	}
	
}
