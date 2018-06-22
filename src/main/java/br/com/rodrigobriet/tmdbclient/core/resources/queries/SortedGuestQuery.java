package br.com.rodrigobriet.tmdbclient.core.resources.queries;

public class SortedGuestQuery extends AbstractQueryField {

	public static final SortedGuestQuery GUEST_SESSION_ID = new SortedGuestQuery("guest_session_id");
	public static final SortedGuestQuery LANGUAGE = new SortedGuestQuery("language");
	public static final SortedGuestQuery PAGE = new SortedGuestQuery("page");
	public static final SortedGuestQuery SORT_BY = new SortedGuestQuery("sort_by");
	
	protected SortedGuestQuery(String name) {
		super(name);
	}

}
