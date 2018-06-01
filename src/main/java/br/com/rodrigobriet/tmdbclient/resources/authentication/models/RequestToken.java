package br.com.rodrigobriet.tmdbclient.resources.authentication.models;

import com.google.gson.annotations.SerializedName;

public class RequestToken {

	@SerializedName("success")
	private boolean success;
	
	@SerializedName("expires_at")
	private String expireAt;
	
	@SerializedName("request_token")
	private String requestToken;

	public boolean isSuccess() {
		return success;
	}

	public String getExpireAt() {
		return expireAt;
	}

	public String getRequestToken() {
		return requestToken;
	}
	
}
