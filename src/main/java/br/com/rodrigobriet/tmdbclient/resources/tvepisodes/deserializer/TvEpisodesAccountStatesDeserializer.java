package br.com.rodrigobriet.tmdbclient.resources.tvepisodes.deserializer;

import java.lang.reflect.Type;

import com.google.gson.Gson;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

import br.com.rodrigobriet.tmdbclient.core.models.requestbody.Rate;
import br.com.rodrigobriet.tmdbclient.resources.tvepisodes.models.TvEpisodesAccountStates;

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
