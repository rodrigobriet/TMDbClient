package br.com.rodrigobriet.tmdbclient;

import br.com.rodrigobriet.tmdbclient.core.exceptions.InvalidParameterValue;
import br.com.rodrigobriet.tmdbclient.core.requests.AsyncRequest;
import br.com.rodrigobriet.tmdbclient.core.requests.interfaces.RequestService;
import br.com.rodrigobriet.tmdbclient.resources.account.Account;
import br.com.rodrigobriet.tmdbclient.resources.authentication.Authentication;
import br.com.rodrigobriet.tmdbclient.resources.certifications.Certifications;
import br.com.rodrigobriet.tmdbclient.resources.changes.Changes;
import okhttp3.OkHttpClient;

public class TMDb {

	private static final String BASE_URL = "https://api.themoviedb.org/3/";
	
	private String apiKey;
	private RequestService requestService;
	
	public TMDb(String apiKey) {
		if(apiKey == null || apiKey.equals(""))
			throw new InvalidParameterValue("API Key can't be empty or null.");
		
		this.apiKey = apiKey;
		
		requestService = new AsyncRequest(BASE_URL, new OkHttpClient());
	}
	
	public Authentication getAuthentication() {
		return new Authentication(apiKey, requestService);
	}
	
	public Account getAccount() {
		return new Account(apiKey, requestService);
	}
	
	public Certifications getCertifications() {
		return new Certifications(apiKey, requestService);
	}
	
	public Changes getChanges() {
		return new Changes(apiKey, requestService);
	}
}
