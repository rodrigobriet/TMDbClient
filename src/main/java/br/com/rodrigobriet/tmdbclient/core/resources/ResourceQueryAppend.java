package br.com.rodrigobriet.tmdbclient.core.resources;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import br.com.rodrigobriet.tmdbclient.core.exceptions.InvalidParameterValue;
import br.com.rodrigobriet.tmdbclient.core.mapping.MappingService;
import br.com.rodrigobriet.tmdbclient.core.requests.interfaces.RequestService;
import br.com.rodrigobriet.tmdbclient.core.resources.query.QueryField;

public class ResourceQueryAppend<ModelT, QueryT extends QueryField, AppendT extends Append, QueryAppend extends QueryField> extends ResourceQuery<ModelT, QueryT> {

	protected HashMap<QueryAppend, String> appendQueryString = new HashMap<>();
	private List<AppendT> appendToResponse = new ArrayList<>();
	
	public ResourceQueryAppend(String path, String apiKey, RequestService requestService, MappingService<ModelT> mappingService) {
		super(path, apiKey, requestService, mappingService);
	}
	
	public ResourceQueryAppend(String path, String apiKey, RequestService requestService, MappingService<ModelT> mappingService, int ... pathValues) {
		super(path, apiKey, requestService, mappingService, pathValues);
	}
	
	public ResourceQueryAppend(String path, String apiKey, RequestService requestService, MappingService<ModelT> mappingService, String ... pathValues) {
		super(path, apiKey, requestService, mappingService, pathValues);
	}

	public ResourceQueryAppend<ModelT, QueryT, AppendT, QueryAppend> addAppend(AppendT appendToResponse) {
		this.appendToResponse.add(appendToResponse);
		return this;
	}
	
	public ResourceQueryAppend<ModelT, QueryT, AppendT, QueryAppend> setAppendQuery(QueryAppend field, String value) {
		if(field == null || value == null)
			throw new InvalidParameterValue("Field and Value can't be null");
		
		appendQueryString.put(field, value);
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
		
		return queryString + "&append_to_response=" + appends + buildAppendQueryString();
	}
	
	private String buildAppendQueryString() {
		StringBuilder sb = new StringBuilder();

		for(QueryAppend v: appendQueryString.keySet()) {			
			sb.append("&" + v.getName() + "=" + appendQueryString.get(v));
		}
				
		return sb.toString();
	}
}
