package com.github.rodrigobriet.tmdbclient.resources.tvseasons.deserializer;

import java.lang.reflect.Type;

import com.github.rodrigobriet.tmdbclient.core.models.requestbody.Rate;
import com.github.rodrigobriet.tmdbclient.resources.tvseasons.models.submodels.TvEpisodesAccountStatesResultItem;
import com.google.gson.Gson;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

public class TvSeasonsAccountStatesResultItemDeserializer implements JsonDeserializer<TvEpisodesAccountStatesResultItem> {

	@Override
	public TvEpisodesAccountStatesResultItem deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
			throws JsonParseException {
		TvEpisodesAccountStatesResultItem t = new Gson().fromJson(json, TvEpisodesAccountStatesResultItem.class);
		
		String rated = json.getAsJsonObject().get("rated").toString();
		boolean isRated = false;
		Rate rate = null;
		
		if(!rated.matches("false")) {
			isRated = true;
			rate = new Gson().fromJson(json.getAsJsonObject().get("rated"), Rate.class);
		}
		
		
		return new TvEpisodesAccountStatesResultItem(t.getId(), t.getEpisodeNumber(), rate, isRated);
	}

}
