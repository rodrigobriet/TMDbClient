package br.com.rodrigobriet.tmdbclient.core.models.global.deserializer;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

import br.com.rodrigobriet.tmdbclient.core.models.global.MovieResultItem;
import br.com.rodrigobriet.tmdbclient.core.models.global.PersonResultItem;
import br.com.rodrigobriet.tmdbclient.core.models.global.TvResultItem;

public class PersonResultItemDeserializer implements JsonDeserializer<PersonResultItem> {

	@Override
	public PersonResultItem deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
			throws JsonParseException {
		PersonResultItem p = new Gson().fromJson(json, PersonResultItem.class);
		
		// Parse "knowFor"
		JsonArray knownFor = json.getAsJsonObject().get("known_for").getAsJsonArray();
		
		List<MovieResultItem> kMovie = new ArrayList<>();
		List<TvResultItem> kTv = new ArrayList<>();
		
		for(int j = 0; j < knownFor.size(); j++) {
			JsonObject knownType = knownFor.get(j).getAsJsonObject();
			
			if(knownType.get("media_type").getAsString().equals("movie")) {
				kMovie.add(new Gson().fromJson(knownType, MovieResultItem.class));
			} else {
				kTv.add(new Gson().fromJson(knownType, TvResultItem.class));
			}
		}
		
		return new PersonResultItem(p.getProfilePath(), p.isAdult(), p.getId(), p.getName(), p.getPopularity(), kMovie, kTv);
	}

}
