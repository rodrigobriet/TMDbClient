package br.com.rodrigobriet.tmdbclient.resources.account.models.submodels;

import com.google.gson.annotations.SerializedName;

public class AccountAvatar {

	@SerializedName("gravatar")
	private AccountGravatar gravatar;

	public AccountGravatar getGravatar() {
		return gravatar;
	}

}
