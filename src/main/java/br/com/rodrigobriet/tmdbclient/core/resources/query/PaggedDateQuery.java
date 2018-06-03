package br.com.rodrigobriet.tmdbclient.core.resources.query;

public class PaggedDateQuery extends QueryField {

	public static final PaggedDateQuery PAGE = new PaggedDateQuery("page");
	public static final PaggedDateQuery END_DATE = new PaggedDateQuery("end_date");
	public static final PaggedDateQuery START_DATE = new PaggedDateQuery("start_date");
	
	protected PaggedDateQuery(String name) {
		super(name);
	}

}
