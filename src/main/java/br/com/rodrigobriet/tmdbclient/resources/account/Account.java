package br.com.rodrigobriet.tmdbclient.resources.account;

import br.com.rodrigobriet.tmdbclient.core.mapping.GsonMapping;
import br.com.rodrigobriet.tmdbclient.core.requests.interfaces.RequestService;
import br.com.rodrigobriet.tmdbclient.core.resources.ResourcePost;
import br.com.rodrigobriet.tmdbclient.core.resources.ResourceQuery;
import br.com.rodrigobriet.tmdbclient.core.resources.ResourcesConf;
import br.com.rodrigobriet.tmdbclient.core.resources.query.AuthSessionQuery;
import br.com.rodrigobriet.tmdbclient.core.resources.query.PaggedAuthQuery;
import br.com.rodrigobriet.tmdbclient.core.resources.query.SortedAuthQuery;
import br.com.rodrigobriet.tmdbclient.resources.account.models.AccountCreatedList;
import br.com.rodrigobriet.tmdbclient.resources.account.models.AccountDetails;
import br.com.rodrigobriet.tmdbclient.resources.account.models.AccountFavoriteMovies;
import br.com.rodrigobriet.tmdbclient.resources.account.models.AccountFavoriteTvShows;
import br.com.rodrigobriet.tmdbclient.resources.account.models.AccountMovieWatchList;
import br.com.rodrigobriet.tmdbclient.resources.account.models.AccountRatedMovies;
import br.com.rodrigobriet.tmdbclient.resources.account.models.AccountRatedTvEpisodes;
import br.com.rodrigobriet.tmdbclient.resources.account.models.AccountRatedTvShows;
import br.com.rodrigobriet.tmdbclient.resources.account.models.AccountTvShowWatchList;
import br.com.rodrigobriet.tmdbclient.resources.account.requestbody.AccountAddWatchList;
import br.com.rodrigobriet.tmdbclient.resources.account.requestbody.AccountMarkFavorite;

public class Account extends ResourcesConf {

	public Account(String apiKey, RequestService requestService) {
		super(apiKey, requestService);
	}
	
	public ResourceQuery<AccountDetails, AuthSessionQuery> getDetails() {
		return new ResourceQuery<>("/account", apiKey, requestService, new GsonMapping<>(AccountDetails.class));
	}
	
	public ResourceQuery<AccountCreatedList, PaggedAuthQuery> getCreatedList(int accountId) {
		return new ResourceQuery<>("/account/{account_id}/lists", apiKey, requestService, new GsonMapping<>(AccountCreatedList.class), accountId);
	}
	
	public ResourceQuery<AccountFavoriteMovies, SortedAuthQuery> getFavoriteMovies(int accountId) {
		return new ResourceQuery<>("/account/{account_id}/favorite/movies", apiKey, requestService, new GsonMapping<>(AccountFavoriteMovies.class), accountId);
	}
	
	public ResourceQuery<AccountFavoriteTvShows, SortedAuthQuery> getFavoriteTvShows(int accountId) {
		return new ResourceQuery<>("/account/{account_id}/favorite/tv", apiKey, requestService, new GsonMapping<>(AccountFavoriteTvShows.class), accountId);
	}
	
	public ResourceQuery<AccountRatedMovies, SortedAuthQuery> getRatedMovies(int accountId) {
		return new ResourceQuery<>("/account/{account_id}/rated/movies", apiKey, requestService, new GsonMapping<>(AccountRatedMovies.class), accountId);
	}
	
	public ResourceQuery<AccountRatedTvShows, SortedAuthQuery> getRatedTvShows(int accountId) {
		return new ResourceQuery<>("/account/{account_id}/rated/tv", apiKey, requestService, new GsonMapping<>(AccountRatedTvShows.class), accountId);
	}

	public ResourceQuery<AccountRatedTvEpisodes, SortedAuthQuery> getRatedTvEpisodes(int accountId) {
		return new ResourceQuery<>("/account/{account_id}/rated/tv/episodes", apiKey, requestService, new GsonMapping<>(AccountRatedTvEpisodes.class), accountId);
	}
	
	public ResourceQuery<AccountMovieWatchList, SortedAuthQuery> getMovieWatchList(int accountId) {
		return new ResourceQuery<>("/account/{account_id}/watchlist/movies", apiKey, requestService, new GsonMapping<>(AccountMovieWatchList.class), accountId);
	}
	
	public ResourceQuery<AccountTvShowWatchList, SortedAuthQuery> getTvShowWatchList(int accountId) {
		return new ResourceQuery<>("/account/{account_id}/watchlist/tv", apiKey, requestService, new GsonMapping<>(AccountTvShowWatchList.class), accountId);
	}
	
	public ResourcePost<AuthSessionQuery, AccountMarkFavorite> setAsFavorite(int accountId, AccountMarkFavorite favorite) {
		return new ResourcePost<>("/account/{account_id}/favorite", apiKey, requestService, favorite, accountId);
	}
	
	public ResourcePost<AuthSessionQuery, AccountAddWatchList> addToWatchList(int accountId, AccountAddWatchList addToWatchlist) {
		return new ResourcePost<>("/account/{account_id}/watchlist", apiKey, requestService, addToWatchlist, accountId);
	}
	
}
