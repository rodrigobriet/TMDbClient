package com.github.rodrigobriet.tmdbclient.core.resources;

import java.lang.reflect.Type;
import java.util.HashMap;

import com.github.rodrigobriet.tmdbclient.core.exceptions.InvalidParameterValue;
import com.github.rodrigobriet.tmdbclient.core.mappings.interfaces.MappingService;
import com.github.rodrigobriet.tmdbclient.core.requests.interfaces.RequestService;
import com.github.rodrigobriet.tmdbclient.core.resources.queries.AbstractQueryField;

/**
 * Represents a resource that accept query string. Need to be created using the {@link ResourceQuery.Builder}.
 * @param <ModelT> The type of the resource model.
 * @param <QueryT> The resource append type.
 */
public class ResourceQuery<ModelT, QueryT extends AbstractQueryField> extends Resource<ModelT> {

	protected HashMap<QueryT, String> queryString = new HashMap<>();
	
	protected ResourceQuery(RequestService requestService, 
			MappingService mappingService, 
			String apiKey, String path,
			Class<ModelT> modelClass, 
			Type modelType, 
			ResourceMethod resourceMethod, 
			String[] pathValues,
			Object bodyContent) {
		super(requestService, mappingService, apiKey, path, modelClass, modelType, resourceMethod, pathValues, bodyContent);
	}

	public ResourceQuery<ModelT, QueryT> setQuery(QueryT field, String value) {
		if(field == null || value == null)
			throw new InvalidParameterValue("Field and Value can't be null");
		
		queryString.put(field, value);
		return this;
	}

	@Override
	protected String buildQueryString() {
		StringBuilder sb = new StringBuilder();

		for(QueryT v: queryString.keySet()) {			
			sb.append("&" + v.getName() + "=" + queryString.get(v));
		}
		
		sb.insert(0, "?api_key=" + apiKey);
		
		return sb.toString();
	}
	
	public static class Builder<ModelT, QueryT extends AbstractQueryField> extends ResourceBuilder<ModelT, ResourceQuery<ModelT, QueryT>> {

		public Builder(RequestService requestService, MappingService mappingService, String apiKey) {
			super(requestService, mappingService, apiKey);
		}
		
		@Override
		public ResourceQuery<ModelT, QueryT> build() {
			return new ResourceQuery<>(requestService, mappingService, apiKey, path, modelClass, modelType, resourceMethod, pathValues, bodyContent);
		}
	}
}
