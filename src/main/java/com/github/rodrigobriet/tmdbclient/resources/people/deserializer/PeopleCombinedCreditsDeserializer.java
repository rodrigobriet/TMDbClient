package com.github.rodrigobriet.tmdbclient.resources.people.deserializer;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import com.github.rodrigobriet.tmdbclient.resources.people.models.PeopleCombinedCredits;
import com.github.rodrigobriet.tmdbclient.resources.people.models.submodels.PeopleMovieCast;
import com.github.rodrigobriet.tmdbclient.resources.people.models.submodels.PeopleMovieCrew;
import com.github.rodrigobriet.tmdbclient.resources.people.models.submodels.PeopleTvCast;
import com.github.rodrigobriet.tmdbclient.resources.people.models.submodels.PeopleTvCrew;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

public class PeopleCombinedCreditsDeserializer implements JsonDeserializer<PeopleCombinedCredits> {

	@Override
	public PeopleCombinedCredits deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
			throws JsonParseException {
		PeopleCombinedCredits p = new Gson().fromJson(json, PeopleCombinedCredits.class);
		
		// Cast
		JsonArray casts = json.getAsJsonObject().get("cast").getAsJsonArray();
		List<PeopleMovieCast> mCast = new ArrayList<>();
		List<PeopleTvCast> tCast = new ArrayList<>();
		
		for(int i=0; i < casts.size(); i++) {
			JsonObject cast = casts.get(i).getAsJsonObject();
			
			if(cast.get("media_type").getAsString().equals("movie")) {
				mCast.add(new Gson().fromJson(cast, PeopleMovieCast.class));
			} else {
				tCast.add(new Gson().fromJson(cast, PeopleTvCast.class));
			}
		}
		
		// Crew
		JsonArray crews = json.getAsJsonObject().get("crew").getAsJsonArray();
		List<PeopleMovieCrew> mCrew = new ArrayList<>();
		List<PeopleTvCrew> tCrew = new ArrayList<>();
		
		for(int i=0; i < crews.size(); i++) {
			JsonObject crew = crews.get(i).getAsJsonObject();
			
			if(crew.get("media_type").getAsString().equals("movie")) {
				mCrew.add(new Gson().fromJson(crew, PeopleMovieCrew.class));
			} else {
				tCrew.add(new Gson().fromJson(crew, PeopleTvCrew.class));
			}
		}
		
		return new PeopleCombinedCredits(p.getId(), mCast, mCrew, tCast, tCrew);
	}

}
