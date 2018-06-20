package br.com.rodrigobriet.tmdbclient.resources.tvseasons.appends;

import br.com.rodrigobriet.tmdbclient.core.resources.Append;

public enum TvSeasonsAppend implements Append {

	CREDITS("credits"),
	EXTERNAL_IDS("external_ids"),
	IMAGES("images"),
	VIDEOS("videos");
	
	public String value;
	
	private TvSeasonsAppend(String value) {
		this.value = value;
	}
	
	@Override
	public String getValue() {
		return value;
	}

}
