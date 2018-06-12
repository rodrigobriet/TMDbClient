package br.com.rodrigobriet.tmdbclient.core.resources.query;

public class MovieIdQuery extends QueryField {

	public static final MovieIdQuery MOVIE_ID = new MovieIdQuery("movie_id");
	
	public MovieIdQuery(String name) {
		super(name);
	}

}
