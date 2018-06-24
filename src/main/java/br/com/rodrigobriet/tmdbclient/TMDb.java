package br.com.rodrigobriet.tmdbclient;

import java.io.File;

import br.com.rodrigobriet.tmdbclient.core.exceptions.InvalidParameterValue;
import br.com.rodrigobriet.tmdbclient.core.mappings.GsonMapping;
import br.com.rodrigobriet.tmdbclient.core.mappings.interfaces.MappingService;
import br.com.rodrigobriet.tmdbclient.core.requests.OkHttpAsyncRequest;
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
import br.com.rodrigobriet.tmdbclient.resources.movies.Movies;
import br.com.rodrigobriet.tmdbclient.resources.networks.Networks;
import br.com.rodrigobriet.tmdbclient.resources.people.People;
import br.com.rodrigobriet.tmdbclient.resources.reviews.Reviews;
import br.com.rodrigobriet.tmdbclient.resources.search.Search;
import br.com.rodrigobriet.tmdbclient.resources.tv.Tv;
import br.com.rodrigobriet.tmdbclient.resources.tvepisodes.TvEpisodes;
import br.com.rodrigobriet.tmdbclient.resources.tvseasons.TvSeasons;
import okhttp3.Cache;
import okhttp3.OkHttpClient;

public class TMDb {

	private static final String BASE_URL = "https://api.themoviedb.org/3/";
	
	private String apiKey;
	private RequestService requestService;
	private MappingService mappingService;
	
	public TMDb(String apiKey, File cacheDirectory, int cacheSize) {
		if(apiKey == null || apiKey.equals(""))
			throw new InvalidParameterValue("API Key can't be empty or null.");
		
		this.apiKey = apiKey;
		
		configureRequestService(cacheDirectory, cacheSize);
		configureMappingService();
	}
	
	private void configureRequestService(File cacheDirectory, int cacheSize) {
		requestService = new OkHttpAsyncRequest(BASE_URL, new OkHttpClient.Builder()
				.cache(new Cache(cacheDirectory, cacheSize))
				.build());
	}
	
	private void configureMappingService() {
		mappingService = new GsonMapping();
	}

	public Authentication getAuthentication() {
		return new Authentication(apiKey, requestService, mappingService);
	}
	
	public Account getAccount() {
		return new Account(apiKey, requestService, mappingService);
	}
	
	public Certifications getCertifications() {
		return new Certifications(apiKey, requestService, mappingService);
	}
	
	public Changes getChanges() {
		return new Changes(apiKey, requestService, mappingService);
	}
	
	public Collections getCollections() {
		return new Collections(apiKey, requestService, mappingService);
	}
	
	public Companies getCompanies() {
		return new Companies(apiKey, requestService, mappingService);
	}
	
	public Configuration getConfiguration() {
		return new Configuration(apiKey, requestService, mappingService);
	}
	
	public Credits getCredits() {
		return new Credits(apiKey, requestService, mappingService);
	}
	
	public Discover getDiscover() {
		return new Discover(apiKey, requestService, mappingService);
	}
	
	public Find getFind() {
		return new Find(apiKey, requestService, mappingService);
	}
	
	public Genres getGenres() {
		return new Genres(apiKey, requestService, mappingService);
	}
	
	public Guest getGuest() {
		return new Guest(apiKey, requestService, mappingService);
	}
	
	public Keywords getKeywords() {
		return new Keywords(apiKey, requestService, mappingService);
	}
	
	public Lists getLists() {
		return new Lists(apiKey, requestService, mappingService);
	}
	
	public Movies getMovies() {
		return new Movies(apiKey, requestService, mappingService);
	}
	
	public Networks getNetworks() {
		return new Networks(apiKey, requestService, mappingService);
	}
	
	public People getPeople() {
		return new People(apiKey, requestService, mappingService);
	}
	
	public Reviews getReviews() {
		return new Reviews(apiKey, requestService, mappingService);
	}
	
	public Search getSearch() {
		return new Search(apiKey, requestService, mappingService);
	}
	
	public Tv getTv() {
		return new Tv(apiKey, requestService, mappingService);
	}
	
	public TvSeasons getTvSeasons() {
		return new TvSeasons(apiKey, requestService, mappingService);
	}
	
	public TvEpisodes getTvEpisodes() {
		return new TvEpisodes(apiKey, requestService, mappingService);
	}
	
}
