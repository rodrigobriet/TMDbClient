package com.github.rodrigobriet.tmdbclient.core.resources.queries;

public class CountryQuery extends AbstractQueryField {

	public static final CountryQuery COUNTRY = new CountryQuery("country");
	
	protected CountryQuery(String name) {
		super(name);
	}

}
