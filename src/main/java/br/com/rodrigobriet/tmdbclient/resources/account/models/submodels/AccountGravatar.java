package br.com.rodrigobriet.tmdbclient.resources.account.models.submodels;

import com.google.gson.annotations.SerializedName;

public class AccountGravatar {

	@SerializedName("hash")
	private String hash;

	public String getHash() {
		return hash;
	}
	
}
