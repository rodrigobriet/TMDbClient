package com.github.rodrigobriet.tmdbclient.core.resources;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import com.github.rodrigobriet.tmdbclient.core.mappings.interfaces.MappingService;
import com.github.rodrigobriet.tmdbclient.core.requests.interfaces.RequestService;
import com.github.rodrigobriet.tmdbclient.core.resources.queries.AbstractQueryField;

/**
 * Represents a resource that accept query string and append_to_response. Need to be created using the {@link ResourceAppend.Builder}.
 * @param <ModelT> The type of the resource model.
 * @param <QueryT> The resource query type.
 * @param <AppendT> The resource append type.
 */
public class ResourceAppend<ModelT, QueryT extends AbstractQueryField, AppendT extends Append> extends ResourceQuery<ModelT, QueryT> {

	private List<AppendT> appendToResponse = new ArrayList<>();
	
	protected ResourceAppend(RequestService requestService, 
			MappingService mappingService, 
			String apiKey, 
			String path,
			Class<ModelT> modelClass, 
			Type modelType, 
			ResourceMethod resourceMethod, 
			String[] pathValues,
			Object bodyContent) {
		super(requestService, mappingService, apiKey, path, modelClass, modelType, resourceMethod, pathValues, bodyContent);
	}

	public ResourceAppend<ModelT, QueryT, AppendT> addAppend(AppendT appendToResponse) {
		this.appendToResponse.add(appendToResponse);
		return this;
	}
	
	@Override
	protected String buildQueryString() {
		String queryString = super.buildQueryString();
				
		String appends = "";
		for(AppendT a: appendToResponse) {
			if(appends.isEmpty()) {
				appends += a.getValue();
			} else {
				appends += ","+a.getValue();
			}
		}
		
		return queryString + "&append_to_response=" + appends;
	}
	
	public static class Builder<ModelT, QueryT extends AbstractQueryField, AppendT extends Append> extends ResourceBuilder<ModelT, ResourceAppend<ModelT, QueryT, AppendT>> {

		public Builder(RequestService requestService, MappingService mappingService, String apiKey) {
			super(requestService, mappingService, apiKey);
		}
		
		@Override
		public ResourceAppend<ModelT, QueryT, AppendT> build() {
			return new ResourceAppend<>(requestService, mappingService, apiKey, path, modelClass, modelType, resourceMethod, pathValues, bodyContent);
		}
	}
}
