package br.com.rodrigobriet.tmdbclient.resources.find.deserializer;

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

import br.com.rodrigobriet.tmdbclient.core.models.MovieResultItem;
import br.com.rodrigobriet.tmdbclient.core.models.PersonResultItem;
import br.com.rodrigobriet.tmdbclient.core.models.TvResultItem;
import br.com.rodrigobriet.tmdbclient.resources.find.models.FindById;

public class FindByIdDeserializer implements JsonDeserializer<FindById> {

	@Override
	public FindById deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
		FindById byId = new Gson().fromJson(json, FindById.class);		
		
		// Parse "person_results"
		JsonArray personResults = json.getAsJsonObject().get("person_results").getAsJsonArray();
		List<PersonResultItem> pResults = new ArrayList<>();
		
		for(int i = 0; i < personResults.size(); i++) {
			JsonObject personResult = personResults.get(i).getAsJsonObject();
			PersonResultItem tP = new Gson().fromJson(personResult, PersonResultItem.class);

			JsonArray knownFor = personResult.get("known_for").getAsJsonArray();
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
			
			pResults.add(new PersonResultItem(tP.getProfilePath(), tP.isAdult(), tP.getId(), tP.getName(), tP.getPopularity(), kMovie, kTv));
		}

		return new FindById(byId.getMovieResults(), pResults, byId.getTvResults(), byId.getTvEspisodeResults(), byId.getTvSeasonResults());
	}

}
