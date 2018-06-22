package br.com.rodrigobriet.tmdbclient.core.resources.queries;

public class MovieIdQuery extends AbstractQueryField {

	public static final MovieIdQuery MOVIE_ID = new MovieIdQuery("movie_id");
	
	public MovieIdQuery(String name) {
		super(name);
	}

}
