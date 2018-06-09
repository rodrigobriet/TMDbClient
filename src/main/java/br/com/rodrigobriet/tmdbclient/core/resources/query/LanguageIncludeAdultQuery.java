package br.com.rodrigobriet.tmdbclient.core.resources.query;

public class LanguageIncludeAdultQuery extends QueryField {

	public static final LanguageIncludeAdultQuery LANGUAGE = new LanguageIncludeAdultQuery("language");
	public static final LanguageIncludeAdultQuery INCLUDE_ADULT = new LanguageIncludeAdultQuery("include_adult");
	
	public LanguageIncludeAdultQuery(String name) {
		super(name);
	}

}
