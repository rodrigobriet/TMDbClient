package com.github.rodrigobriet.tmdbclient.resources.movies.deserializer;

import java.lang.reflect.Type;

import com.github.rodrigobriet.tmdbclient.core.models.AccountStates;
import com.github.rodrigobriet.tmdbclient.core.models.AccountStatesRate;
import com.google.gson.Gson;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

public class MoviesAccountStatesDeserializer implements JsonDeserializer<AccountStates> {

	@Override
	public AccountStates deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
		AccountStates m = new Gson().fromJson(json, AccountStates.class);
		
		String rated = json.getAsJsonObject().get("rated").toString();
		boolean isRated = false;
		AccountStatesRate rate = null;
		
		if(!rated.matches("false")) {
			isRated = true;
			rate = new Gson().fromJson(json.getAsJsonObject().get("rated"), AccountStatesRate.class);
		}
		
		
		return new AccountStates(m.getId(), m.isFavorite(), m.isWatchlist(), rate, isRated);
	}

}
