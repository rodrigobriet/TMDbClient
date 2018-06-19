package br.com.rodrigobriet.tmdbclient.resources.movies.deserializer;

import java.lang.reflect.Type;

import com.google.gson.Gson;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

import br.com.rodrigobriet.tmdbclient.resources.movies.models.MoviesAccountStates;
import br.com.rodrigobriet.tmdbclient.resources.movies.models.submodels.MoviesAccountStatesRate;

public class MoviesAccountStatesDeserializer implements JsonDeserializer<MoviesAccountStates> {

	@Override
	public MoviesAccountStates deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
		MoviesAccountStates m = new Gson().fromJson(json, MoviesAccountStates.class);
		
		String rated = json.getAsJsonObject().get("rated").toString();
		boolean isRated = false;
		MoviesAccountStatesRate rate = null;
		
		if(!rated.matches("false")) {
			isRated = true;
			rate = new Gson().fromJson(json.getAsJsonObject().get("rated"), MoviesAccountStatesRate.class);
		}
		
		
		return new MoviesAccountStates(m.getId(), m.isFavorite(), m.isWatchlist(), rate, isRated);
	}

}
