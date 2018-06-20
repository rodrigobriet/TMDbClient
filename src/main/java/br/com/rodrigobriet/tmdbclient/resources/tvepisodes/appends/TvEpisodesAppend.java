package br.com.rodrigobriet.tmdbclient.resources.tvepisodes.appends;

import br.com.rodrigobriet.tmdbclient.core.resources.Append;

public enum TvEpisodesAppend implements Append {

	CREDITS("credits"),
	EXTERNAL_IDS("external_ids"),
	IMAGES("images"),
	TRANSLATIONS("translations"),
	VIDEOS("videos");
	
	public String value;
	
	private TvEpisodesAppend(String value) {
		this.value = value;
	}
	
	@Override
	public String getValue() {
		return value;
	}

}
