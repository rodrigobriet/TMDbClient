package br.com.rodrigobriet.tmdbclient.resources.tv.appends;

import br.com.rodrigobriet.tmdbclient.core.resources.Append;

public enum TvAppend implements Append {

	ACCOUNT_STATES("account_states"), 
	ALTERNATIVE_TITLES("alternative_titles"),
	CONTENT_RATINGS("content_ratings"),
	CREDITS("credits"),
	EXTERNAL_IDS("external_ids"),
	IMAGES("images"),
	KEYWORDS("keywords"),
	RECOMMENDATIONS("recommendations"),
	REVIEWS("reviews"),
	SCREENED_THEATRICALLY("screened_theatrically"),
	SIMILAR("similar"),
	TRANSLATIONS("translations"),
	VIDEOS("videos");
	
	public String value;
	
	private TvAppend(String value) {
		this.value = value;
	}
	
	@Override
	public String getValue() {
		return value;
	}

}
