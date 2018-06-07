package br.com.rodrigobriet.tmdbclient.core.resources.query;

public class ExternalSourceQuery extends QueryField {

	public static final ExternalSourceQuery LANGUAGE = new ExternalSourceQuery("language");
	public static final ExternalSourceQuery EXTERNAL_SOURCE = new ExternalSourceQuery("external_source");
	
	protected ExternalSourceQuery(String name) {
		super(name);
	}

}
