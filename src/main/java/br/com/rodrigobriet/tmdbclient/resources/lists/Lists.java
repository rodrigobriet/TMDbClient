package br.com.rodrigobriet.tmdbclient.resources.lists;

import br.com.rodrigobriet.tmdbclient.core.mapping.GsonMapping;
import br.com.rodrigobriet.tmdbclient.core.requests.interfaces.RequestService;
import br.com.rodrigobriet.tmdbclient.core.resources.ResourceDelete;
import br.com.rodrigobriet.tmdbclient.core.resources.ResourcePost;
import br.com.rodrigobriet.tmdbclient.core.resources.ResourcePostCustomReturn;
import br.com.rodrigobriet.tmdbclient.core.resources.ResourcePostNoBody;
import br.com.rodrigobriet.tmdbclient.core.resources.ResourceQuery;
import br.com.rodrigobriet.tmdbclient.core.resources.ResourcesConf;
import br.com.rodrigobriet.tmdbclient.core.resources.query.AuthConfirmQuery;
import br.com.rodrigobriet.tmdbclient.core.resources.query.AuthQuery;
import br.com.rodrigobriet.tmdbclient.core.resources.query.LanguageQuery;
import br.com.rodrigobriet.tmdbclient.core.resources.query.MovieIdQuery;
import br.com.rodrigobriet.tmdbclient.resources.lists.models.ListsCheckItemStatus;
import br.com.rodrigobriet.tmdbclient.resources.lists.models.ListsCreateResult;
import br.com.rodrigobriet.tmdbclient.resources.lists.models.ListsDetails;
import br.com.rodrigobriet.tmdbclient.resources.lists.requestbody.ListsCreate;
import br.com.rodrigobriet.tmdbclient.resources.lists.requestbody.ListsItem;

public class Lists extends ResourcesConf {

	public Lists(String apiKey, RequestService requestService) {
		super(apiKey, requestService);
	}

	public ResourceQuery<ListsDetails, LanguageQuery> getDetails(String listId) {
		return new ResourceQuery<>("/list/{list_id}", apiKey, requestService, new GsonMapping<>(ListsDetails.class), listId);
	}
	
	public ResourceQuery<ListsCheckItemStatus, MovieIdQuery> checkItemStatus(String listId, int movieId) {
		ResourceQuery<ListsCheckItemStatus, MovieIdQuery> r = new ResourceQuery<>("/list/{list_id}/item_status", apiKey, requestService, new GsonMapping<>(ListsCheckItemStatus.class), listId);
		r.setQuery(MovieIdQuery.MOVIE_ID, ""+movieId);
		return r;
	}
	
	public ResourcePostCustomReturn<ListsCreateResult, AuthQuery, ListsCreate> create(ListsCreate list) {
		return new ResourcePostCustomReturn<>("/list", apiKey, requestService, new GsonMapping<>(ListsCreateResult.class), list);
	}
	
	public ResourcePost<AuthQuery, ListsItem> addMovie(String listId, int mediaId) {
		ListsItem body = new ListsItem(mediaId);
		return new ResourcePost<AuthQuery, ListsItem>("/list/{list_id}/add_item", apiKey, requestService, body, listId);
	}
	
	public ResourcePost<AuthQuery, ListsItem> removeMovie(String listId, int mediaId) {
		ListsItem body = new ListsItem(mediaId);
		return new ResourcePost<AuthQuery, ListsItem>("/list/{list_id}/remove_item", apiKey, requestService, body, listId);
	}
	
	public ResourcePostNoBody<AuthConfirmQuery> clear(String listId, boolean confirmation) {
		ResourcePostNoBody<AuthConfirmQuery> r = new ResourcePostNoBody<>("/list/{list_id}/clear", apiKey, requestService, listId);
		r.setQuery(AuthConfirmQuery.CONFIRM, ""+confirmation);
		return r;
	}
	
	// API returns error, but delete
	public ResourceDelete<AuthQuery> delete(String listId) {
		return new ResourceDelete<>("/list/{list_id}", apiKey, requestService, listId);
	}
	
}
