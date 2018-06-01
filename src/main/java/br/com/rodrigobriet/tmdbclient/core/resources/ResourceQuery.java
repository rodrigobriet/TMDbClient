package br.com.rodrigobriet.tmdbclient.core.resources;

import java.util.HashMap;

import br.com.rodrigobriet.tmdbclient.core.exceptions.InvalidParameterValue;
import br.com.rodrigobriet.tmdbclient.core.mapping.MappingService;
import br.com.rodrigobriet.tmdbclient.core.requests.RequestService;

public class ResourceQuery<ModelT, QueryT extends QueryField> extends Resource<ModelT> {

	protected HashMap<QueryT, String> queryString = new HashMap<>();
	
	public ResourceQuery(String path, String apiKey, RequestService requestService, MappingService<ModelT> mappingService) {
		super(path, apiKey, requestService, mappingService);
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
}
