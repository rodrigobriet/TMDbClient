package br.com.rodrigobriet.tmdbclient.resources.authentication.models;

import com.google.gson.annotations.SerializedName;

public class AuthenticationGuestSession {

	@SerializedName("success")
	private boolean success;
	
	@SerializedName("expires_at")
	private String expireAt;
	
	@SerializedName("guest_session_id")
	private String guestSessionId;

	public boolean isSuccess() {
		return success;
	}

	public String getExpireAt() {
		return expireAt;
	}

	public String getGuestSessionId() {
		return guestSessionId;
	}
	
}
