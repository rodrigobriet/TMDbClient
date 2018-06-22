package br.com.rodrigobriet.tmdbclient.core.resources.queries;

public class PeopleDetailsAppendQuery extends AbstractQueryField {

	public static final PeopleDetailsAppendQuery PAGE = new PeopleDetailsAppendQuery("page");
	
	public PeopleDetailsAppendQuery(String name) {
		super(name);
	}

}
