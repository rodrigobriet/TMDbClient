package br.com.rodrigobriet.tmdbclient.resources.search.deserializer;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

import br.com.rodrigobriet.tmdbclient.core.models.MovieResultItem;
import br.com.rodrigobriet.tmdbclient.core.models.PersonResultItem;
import br.com.rodrigobriet.tmdbclient.core.models.TvResultItem;
import br.com.rodrigobriet.tmdbclient.core.models.deserializer.PersonResultItemDeserializer;
import br.com.rodrigobriet.tmdbclient.resources.search.models.SearchMulti;

public class SearchMultiDeserializer implements JsonDeserializer<SearchMulti>{

	@Override
	public SearchMulti deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
			throws JsonParseException {
		SearchMulti s = new Gson().fromJson(json, SearchMulti.class);
		
		// Parse "results"
		JsonArray results = json.getAsJsonObject().get("results").getAsJsonArray();
		
		List<MovieResultItem> mResults = new ArrayList<>();
		List<TvResultItem> tResults = new ArrayList<>();
		List<PersonResultItem> pResults = new ArrayList<>();
		
		for(int i = 0; i < results.size(); i++) {
			JsonObject result = results.get(i).getAsJsonObject();
			
			if(result.get("media_type").getAsString().equals("movie")) {
				mResults.add(new Gson().fromJson(result, MovieResultItem.class));
			} else if (result.get("media_type").getAsString().equals("tv")) {
				tResults.add(new Gson().fromJson(result, TvResultItem.class));
			} else {
				pResults.add(new GsonBuilder()
						.registerTypeAdapter(PersonResultItem.class, new PersonResultItemDeserializer())
						.create()
						.fromJson(result, PersonResultItem.class));
			}
			
		}
		
		return new SearchMulti(s.getPage(), s.getTotalResults(), s.getTotalPages(), mResults, tResults, pResults);
	}

}
