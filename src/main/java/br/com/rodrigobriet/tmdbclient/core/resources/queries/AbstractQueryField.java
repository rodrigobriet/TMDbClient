package br.com.rodrigobriet.tmdbclient.core.resources.queries;

public abstract class AbstractQueryField {

	private String name;
	
	public AbstractQueryField(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

}
