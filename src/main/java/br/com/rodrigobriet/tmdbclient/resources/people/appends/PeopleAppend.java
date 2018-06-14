package br.com.rodrigobriet.tmdbclient.resources.people.appends;

import br.com.rodrigobriet.tmdbclient.core.resources.Append;

public enum PeopleAppend implements Append {

	MOVIE_CREDITS("movie_credits"), 
	TV_CREDITS("tv_credits"), 
	COMBINED_CREDITS("combined_credits"),
	EXTERNAL_IDS("external_ids"),
	IMAGES("images"),
	TAGGED_IMAGES("tagged_images");
	
	public String value;
	
	private PeopleAppend(String value) {
		this.value = value;
	}
	
	@Override
	public String getValue() {
		return value;
	}

}
