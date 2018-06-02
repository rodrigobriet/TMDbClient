package br.com.rodrigobriet.tmdbclient.resources.authentication.models;

import com.google.gson.annotations.SerializedName;

public class AuthenticationSession {

	@SerializedName("success")
	private boolean success;
	
	@SerializedName("session_id")
	private String sessionId;

	public boolean isSuccess() {
		return success;
	}

	public String getSessionId() {
		return sessionId;
	}
	
}
