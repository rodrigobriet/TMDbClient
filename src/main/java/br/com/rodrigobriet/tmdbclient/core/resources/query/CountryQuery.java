package br.com.rodrigobriet.tmdbclient.core.resources.query;

public class CountryQuery extends QueryField {

	public static final CountryQuery COUNTRY = new CountryQuery("country");
	
	protected CountryQuery(String name) {
		super(name);
	}

}
