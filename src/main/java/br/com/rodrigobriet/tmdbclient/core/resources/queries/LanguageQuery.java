package br.com.rodrigobriet.tmdbclient.core.resources.queries;

public class LanguageQuery extends AbstractQueryField {

	public static final LanguageQuery LANGUAGE = new LanguageQuery("language");
	
	protected LanguageQuery(String name) {
		super(name);
	}

}
