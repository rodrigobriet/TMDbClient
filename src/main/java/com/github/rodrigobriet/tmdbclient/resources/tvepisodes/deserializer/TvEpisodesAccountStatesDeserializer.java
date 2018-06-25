package com.github.rodrigobriet.tmdbclient.resources.tvepisodes.deserializer;

import java.lang.reflect.Type;

import com.github.rodrigobriet.tmdbclient.core.models.requestbody.Rate;
import com.github.rodrigobriet.tmdbclient.resources.tvepisodes.models.TvEpisodesAccountStates;
import com.google.gson.Gson;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

public class TvEpisodesAccountStatesDeserializer implements JsonDeserializer<TvEpisodesAccountStates> {

	@Override
	public TvEpisodesAccountStates deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
			throws JsonParseException {
		TvEpisodesAccountStates t = new Gson().fromJson(json, TvEpisodesAccountStates.class);
		
		String rated = json.getAsJsonObject().get("rated").toString();
		boolean isRated = false;
		Rate rate = null;
		
		if(!rated.matches("false")) {
			isRated = true;
			rate = new Gson().fromJson(json.getAsJsonObject().get("rated"), Rate.class);
		}
		
		return new TvEpisodesAccountStates(t.getId(), rate, isRated);
	}

}
