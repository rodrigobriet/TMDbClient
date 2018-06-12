package br.com.rodrigobriet.tmdbclient;

import br.com.rodrigobriet.tmdbclient.core.exceptions.InvalidParameterValue;
import br.com.rodrigobriet.tmdbclient.core.requests.AsyncRequest;
import br.com.rodrigobriet.tmdbclient.core.requests.interfaces.RequestService;
import br.com.rodrigobriet.tmdbclient.resources.account.Account;
import br.com.rodrigobriet.tmdbclient.resources.authentication.Authentication;
import br.com.rodrigobriet.tmdbclient.resources.certifications.Certifications;
import br.com.rodrigobriet.tmdbclient.resources.changes.Changes;
import br.com.rodrigobriet.tmdbclient.resources.collections.Collections;
import br.com.rodrigobriet.tmdbclient.resources.companies.Companies;
import br.com.rodrigobriet.tmdbclient.resources.configuration.Configuration;
import br.com.rodrigobriet.tmdbclient.resources.credits.Credits;
import br.com.rodrigobriet.tmdbclient.resources.discover.Discover;
import br.com.rodrigobriet.tmdbclient.resources.find.Find;
import br.com.rodrigobriet.tmdbclient.resources.genres.Genres;
import br.com.rodrigobriet.tmdbclient.resources.guest.Guest;
import br.com.rodrigobriet.tmdbclient.resources.keywords.Keywords;
import br.com.rodrigobriet.tmdbclient.resources.lists.Lists;
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
	
	public Collections getCollections() {
		return new Collections(apiKey, requestService);
	}
	
	public Companies getCompanies() {
		return new Companies(apiKey, requestService);
	}
	
	public Configuration getConfiguration() {
		return new Configuration(apiKey, requestService);
	}
	
	public Credits getCredits() {
		return new Credits(apiKey, requestService);
	}
	
	public Discover getDiscover() {
		return new Discover(apiKey, requestService);
	}
	
	public Find getFind() {
		return new Find(apiKey, requestService);
	}
	
	public Genres getGenres() {
		return new Genres(apiKey, requestService);
	}
	
	public Guest getGuest() {
		return new Guest(apiKey, requestService);
	}
	
	public Keywords getKeywords() {
		return new Keywords(apiKey, requestService);
	}
	
	public Lists getLists() {
		return new Lists(apiKey, requestService);
	}
	
}
