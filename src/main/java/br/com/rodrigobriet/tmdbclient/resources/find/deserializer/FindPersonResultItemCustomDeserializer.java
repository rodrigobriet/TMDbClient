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

import br.com.rodrigobriet.tmdbclient.resources.find.models.FindById;
import br.com.rodrigobriet.tmdbclient.resources.find.models.submodels.FindPersonResultItem;
import br.com.rodrigobriet.tmdbclient.resources.find.models.submodels.FindPersonResultItemKnowForMovie;
import br.com.rodrigobriet.tmdbclient.resources.find.models.submodels.FindPersonResultItemKnowForTv;

public class FindPersonResultItemCustomDeserializer implements JsonDeserializer<FindById> {

	@Override
	public FindById deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
		FindById byId = new Gson().fromJson(json, FindById.class);		
		
		// Parse "person_results"
		JsonArray personResults = json.getAsJsonObject().get("person_results").getAsJsonArray();
		List<FindPersonResultItem> pResults = new ArrayList<>();
		
		for(int i = 0; i < personResults.size(); i++) {
			JsonObject personResult = personResults.get(i).getAsJsonObject();
			FindPersonResultItem tP = new Gson().fromJson(personResult, FindPersonResultItem.class);

			JsonArray knownFor = personResult.get("known_for").getAsJsonArray();
			List<FindPersonResultItemKnowForMovie> kMovie = new ArrayList<>();
			List<FindPersonResultItemKnowForTv> kTv = new ArrayList<>();
			
			for(int j = 0; j < knownFor.size(); j++) {
				JsonObject knownType = knownFor.get(j).getAsJsonObject();
				
				if(knownType.get("media_type").getAsString().equals("movie")) {
					kMovie.add(new Gson().fromJson(knownType, FindPersonResultItemKnowForMovie.class));
				} else {
					kTv.add(new Gson().fromJson(knownType, FindPersonResultItemKnowForTv.class));
				}
			}
			
			pResults.add(new FindPersonResultItem(tP.getProfilePath(), tP.isAdult(), tP.getId(), tP.getName(), tP.getPopularity(), kMovie, kTv));
		}

		return new FindById(byId.getMovieResults(), pResults, byId.getTvResults(), byId.getTvEspisodeResults());
	}

}
