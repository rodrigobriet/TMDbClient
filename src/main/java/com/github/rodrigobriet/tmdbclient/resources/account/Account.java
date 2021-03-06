package com.github.rodrigobriet.tmdbclient.resources.account;

import com.github.rodrigobriet.tmdbclient.core.mappings.interfaces.MappingService;
import com.github.rodrigobriet.tmdbclient.core.models.StatusMessage;
import com.github.rodrigobriet.tmdbclient.core.requests.interfaces.RequestService;
import com.github.rodrigobriet.tmdbclient.core.resources.ResourceMethod;
import com.github.rodrigobriet.tmdbclient.core.resources.ResourceQuery;
import com.github.rodrigobriet.tmdbclient.core.resources.ResourcesHolder;
import com.github.rodrigobriet.tmdbclient.core.resources.queries.AuthSessionQuery;
import com.github.rodrigobriet.tmdbclient.core.resources.queries.PaggedAuthQuery;
import com.github.rodrigobriet.tmdbclient.core.resources.queries.SortedAuthQuery;
import com.github.rodrigobriet.tmdbclient.resources.account.models.AccountCreatedList;
import com.github.rodrigobriet.tmdbclient.resources.account.models.AccountDetails;
import com.github.rodrigobriet.tmdbclient.resources.account.models.AccountFavoriteMovies;
import com.github.rodrigobriet.tmdbclient.resources.account.models.AccountFavoriteTvShows;
import com.github.rodrigobriet.tmdbclient.resources.account.models.AccountMovieWatchList;
import com.github.rodrigobriet.tmdbclient.resources.account.models.AccountRatedMovies;
import com.github.rodrigobriet.tmdbclient.resources.account.models.AccountRatedTvEpisodes;
import com.github.rodrigobriet.tmdbclient.resources.account.models.AccountRatedTvShows;
import com.github.rodrigobriet.tmdbclient.resources.account.models.AccountTvShowWatchList;
import com.github.rodrigobriet.tmdbclient.resources.account.requestbody.AccountAddWatchList;
import com.github.rodrigobriet.tmdbclient.resources.account.requestbody.AccountMarkFavorite;

public class Account extends ResourcesHolder {

	public Account(String apiKey, RequestService requestService, MappingService mappingService) {
		super(apiKey, requestService, mappingService);
	}

	public ResourceQuery<AccountDetails, AuthSessionQuery> getDetails() {
		return new ResourceQuery.Builder<AccountDetails, AuthSessionQuery>(requestService, mappingService, apiKey)
				.setPath("/account")
				.setModelClass(AccountDetails.class)
				.build();
	}
	
	public ResourceQuery<AccountCreatedList, PaggedAuthQuery> getCreatedList(int accountId) {
		return new ResourceQuery.Builder<AccountCreatedList, PaggedAuthQuery>(requestService, mappingService, apiKey)
				.setPath("/account/{account_id}/lists")
				.setPathValues(""+accountId)
				.setModelClass(AccountCreatedList.class)
				.build();
	}
	
	public ResourceQuery<AccountFavoriteMovies, SortedAuthQuery> getFavoriteMovies(int accountId) {
		return new ResourceQuery.Builder<AccountFavoriteMovies, SortedAuthQuery>(requestService, mappingService, apiKey)
				.setPath("/account/{account_id}/favorite/movies")
				.setPathValues(""+accountId)
				.setModelClass(AccountFavoriteMovies.class)
				.build();
	}
	
	public ResourceQuery<AccountFavoriteTvShows, SortedAuthQuery> getFavoriteTvShows(int accountId) {
		return new ResourceQuery.Builder<AccountFavoriteTvShows, SortedAuthQuery>(requestService, mappingService, apiKey)
				.setPath("/account/{account_id}/favorite/tv")
				.setPathValues(""+accountId)
				.setModelClass(AccountFavoriteTvShows.class)
				.build();
	}
	
	public ResourceQuery<AccountRatedMovies, SortedAuthQuery> getRatedMovies(int accountId) {
		return new ResourceQuery.Builder<AccountRatedMovies, SortedAuthQuery>(requestService, mappingService, apiKey)
				.setPath("/account/{account_id}/rated/movies")
				.setPathValues(""+accountId)
				.setModelClass(AccountRatedMovies.class)
				.build();
	}
	
	public ResourceQuery<AccountRatedTvShows, SortedAuthQuery> getRatedTvShows(int accountId) {
		return new ResourceQuery.Builder<AccountRatedTvShows, SortedAuthQuery>(requestService, mappingService, apiKey)
				.setPath("/account/{account_id}/rated/tv")
				.setPathValues(""+accountId)
				.setModelClass(AccountRatedTvShows.class)
				.build();
	}

	public ResourceQuery<AccountRatedTvEpisodes, SortedAuthQuery> getRatedTvEpisodes(int accountId) {
		return new ResourceQuery.Builder<AccountRatedTvEpisodes, SortedAuthQuery>(requestService, mappingService, apiKey)
				.setPath("/account/{account_id}/rated/tv/episodes")
				.setPathValues(""+accountId)
				.setModelClass(AccountRatedTvEpisodes.class)
				.build();
	}
	
	public ResourceQuery<AccountMovieWatchList, SortedAuthQuery> getMovieWatchList(int accountId) {
		return new ResourceQuery.Builder<AccountMovieWatchList, SortedAuthQuery>(requestService, mappingService, apiKey)
				.setPath("/account/{account_id}/watchlist/movies")
				.setPathValues(""+accountId)
				.setModelClass(AccountMovieWatchList.class)
				.build();
	}
	
	public ResourceQuery<AccountTvShowWatchList, SortedAuthQuery> getTvShowWatchList(int accountId) {
		return new ResourceQuery.Builder<AccountTvShowWatchList, SortedAuthQuery>(requestService, mappingService, apiKey)
				.setPath("/account/{account_id}/watchlist/tv")
				.setPathValues(""+accountId)
				.setModelClass(AccountTvShowWatchList.class)
				.build();
	}
	
	public ResourceQuery<StatusMessage, AuthSessionQuery> setAsFavorite(int accountId, AccountMarkFavorite favorite) {
		return new ResourceQuery.Builder<StatusMessage, AuthSessionQuery>(requestService, mappingService, apiKey)
				.setPath("/account/{account_id}/favorite")
				.setPathValues(""+accountId)
				.setModelClass(StatusMessage.class)
				.setBodyContent(favorite)
				.setResourceMethod(ResourceMethod.POST)
				.build();
	}
	
	public ResourceQuery<StatusMessage, AuthSessionQuery> addToWatchList(int accountId, AccountAddWatchList addToWatchlist) {
		return new ResourceQuery.Builder<StatusMessage, AuthSessionQuery>(requestService, mappingService, apiKey)
				.setPath("/account/{account_id}/watchlist")
				.setPathValues(""+accountId)
				.setModelClass(StatusMessage.class)
				.setBodyContent(addToWatchlist)
				.setResourceMethod(ResourceMethod.POST)
				.build();
	}
	
}
