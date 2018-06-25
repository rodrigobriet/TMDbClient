package com.github.rodrigobriet.tmdbclient.core.resources.queries;

public class ExternalSourceQuery extends AbstractQueryField {

	public static final ExternalSourceQuery LANGUAGE = new ExternalSourceQuery("language");
	public static final ExternalSourceQuery EXTERNAL_SOURCE = new ExternalSourceQuery("external_source");
	
	protected ExternalSourceQuery(String name) {
		super(name);
	}

}
