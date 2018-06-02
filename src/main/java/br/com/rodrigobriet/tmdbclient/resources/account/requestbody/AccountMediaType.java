package br.com.rodrigobriet.tmdbclient.resources.account.requestbody;

public enum AccountMediaType {

	MOVIE("movie"), TV("tv");
	
	private String value;
	
	private AccountMediaType(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
}
