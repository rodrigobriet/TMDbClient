package com.github.rodrigobriet.tmdbclient.core.resources.queries;

/**
 * Represents a query field name for a specified resource.
 * All classes that represent a query field for a resource need to extends {@link AbstractQueryField}.
 */
public abstract class AbstractQueryField {

	private String name;
	
	public AbstractQueryField(String name) {
		this.name = name;
	}
	
	/**
	 * Get the query field name.
	 * @return A {@link String} with the query field name.
	 */
	public String getName() {
		return name;
	}

}
