package br.com.rodrigobriet.tmdbclient.core.resources;

public class QueryField {

	private String name;
	
	protected QueryField(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

}
