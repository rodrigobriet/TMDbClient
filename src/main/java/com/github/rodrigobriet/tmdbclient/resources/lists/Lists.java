package com.github.rodrigobriet.tmdbclient.resources.lists;

import com.github.rodrigobriet.tmdbclient.core.mappings.interfaces.MappingService;
import com.github.rodrigobriet.tmdbclient.core.models.StatusMessage;
import com.github.rodrigobriet.tmdbclient.core.requests.interfaces.RequestService;
import com.github.rodrigobriet.tmdbclient.core.resources.ResourceMethod;
import com.github.rodrigobriet.tmdbclient.core.resources.ResourceQuery;
import com.github.rodrigobriet.tmdbclient.core.resources.ResourcesHolder;
import com.github.rodrigobriet.tmdbclient.core.resources.queries.AuthConfirmQuery;
import com.github.rodrigobriet.tmdbclient.core.resources.queries.AuthSessionQuery;
import com.github.rodrigobriet.tmdbclient.core.resources.queries.LanguageQuery;
import com.github.rodrigobriet.tmdbclient.core.resources.queries.MovieIdQuery;
import com.github.rodrigobriet.tmdbclient.resources.lists.models.ListsCheckItemStatus;
import com.github.rodrigobriet.tmdbclient.resources.lists.models.ListsCreateResult;
import com.github.rodrigobriet.tmdbclient.resources.lists.models.ListsDetails;
import com.github.rodrigobriet.tmdbclient.resources.lists.requestbody.ListsCreate;
import com.github.rodrigobriet.tmdbclient.resources.lists.requestbody.ListsItem;

public class Lists extends ResourcesHolder {

	public Lists(String apiKey, RequestService requestService, MappingService mappingService) {
		super(apiKey, requestService, mappingService);
	}

	public ResourceQuery<ListsDetails, LanguageQuery> getDetails(String listId) {
		return new ResourceQuery.Builder<ListsDetails, LanguageQuery>(requestService, mappingService, apiKey)
				.setPath("/list/{list_id}")
				.setPathValues(listId)
				.setModelClass(ListsDetails.class)
				.build();
	}
	
	public ResourceQuery<ListsCheckItemStatus, MovieIdQuery> checkItemStatus(String listId, int movieId) {
		ResourceQuery<ListsCheckItemStatus, MovieIdQuery> r = new ResourceQuery.Builder<ListsCheckItemStatus, MovieIdQuery>(requestService, mappingService, apiKey)
				.setPath("/list/{list_id}/item_status")
				.setPathValues(listId)
				.setModelClass(ListsCheckItemStatus.class)
				.build();
		r.setQuery(MovieIdQuery.MOVIE_ID, ""+movieId);
		return r;
	}
	
	public ResourceQuery<ListsCreateResult, AuthSessionQuery> create(ListsCreate list) {
		return new ResourceQuery.Builder<ListsCreateResult, AuthSessionQuery>(requestService, mappingService, apiKey)
				.setPath("/list")
				.setModelClass(ListsCreateResult.class)
				.setBodyContent(list)
				.setResourceMethod(ResourceMethod.POST)
				.build();		
	}
	
	public ResourceQuery<StatusMessage, AuthSessionQuery> addMovie(String listId, int mediaId) {
		ListsItem body = new ListsItem(mediaId);
		return new ResourceQuery.Builder<StatusMessage, AuthSessionQuery>(requestService, mappingService, apiKey)
				.setPath("/list/{list_id}/add_item")
				.setPathValues(listId)
				.setModelClass(StatusMessage.class)
				.setBodyContent(body)
				.setResourceMethod(ResourceMethod.POST)
				.build();
	}
	
	public ResourceQuery<StatusMessage, AuthSessionQuery> removeMovie(String listId, int mediaId) {
		ListsItem body = new ListsItem(mediaId);
		return new ResourceQuery.Builder<StatusMessage, AuthSessionQuery>(requestService, mappingService, apiKey)
				.setPath("/list/{list_id}/remove_item")
				.setPathValues(listId)
				.setModelClass(StatusMessage.class)
				.setBodyContent(body)
				.setResourceMethod(ResourceMethod.POST)
				.build();
	}
	
	public ResourceQuery<StatusMessage, AuthConfirmQuery> clear(String listId, boolean confirmation) {
		ResourceQuery<StatusMessage, AuthConfirmQuery> r = new ResourceQuery.Builder<StatusMessage, AuthConfirmQuery>(requestService, mappingService, apiKey)
				.setPath("/list/{list_id}/clear")
				.setPathValues(listId)
				.setModelClass(StatusMessage.class)
				.setResourceMethod(ResourceMethod.POST)
				.build();
		r.setQuery(AuthConfirmQuery.CONFIRM, ""+confirmation);
		return r;
	}
	
	// API returns error, but delete
	public ResourceQuery<StatusMessage, AuthSessionQuery> delete(String listId) {
		return new ResourceQuery.Builder<StatusMessage, AuthSessionQuery>(requestService, mappingService, apiKey)
				.setPath("/list/{list_id}")
				.setPathValues(listId)
				.setModelClass(StatusMessage.class)
				.setResourceMethod(ResourceMethod.DELETE)
				.build();
	}
	
}
