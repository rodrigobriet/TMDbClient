package br.com.rodrigobriet.tmdbclient.core.resources.query;

public class LanguageQuery extends QueryField {

	public static final LanguageQuery LANGUAGE = new LanguageQuery("language");
	
	protected LanguageQuery(String name) {
		super(name);
	}

}
