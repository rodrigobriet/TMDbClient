package com.github.rodrigobriet.tmdbclient.resources.movies.appends;

import com.github.rodrigobriet.tmdbclient.core.resources.Append;

public enum MoviesAppend implements Append {

	ACCOUNT_STATES("account_states"), 
	ALTERNATIVE_TITLES("alternative_titles"), 
	CREDITS("credits"),
	EXTERNAL_IDS("external_ids"),
	IMAGES("images"),
	KEYWORDS("keywords"),
	RELEASE_DATES("release_dates"),
	VIDEOS("videos"),
	TRANSLATIONS("translations"),
	RECOMMENDATIONS("recommendations"),
	SIMILAR("similar"),
	REVIEWS("reviews"),
	LISTS("lists");
	
	public String value;
	
	private MoviesAppend(String value) {
		this.value = value;
	}
	
	@Override
	public String getValue() {
		return value;
	}

}
