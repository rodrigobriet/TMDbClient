package com.github.rodrigobriet.tmdbclient.resources.people.deserializer;

import java.lang.reflect.Type;

import com.github.rodrigobriet.tmdbclient.core.models.MovieResultItem;
import com.github.rodrigobriet.tmdbclient.core.models.TvResultItem;
import com.github.rodrigobriet.tmdbclient.resources.people.models.submodels.PeopleTaggedImagesResultItem;
import com.google.gson.Gson;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

public class PeopleTaggedImagesResultItemDeserializer implements JsonDeserializer<PeopleTaggedImagesResultItem> {

	@Override
	public PeopleTaggedImagesResultItem deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
			throws JsonParseException {
		PeopleTaggedImagesResultItem i = new Gson().fromJson(json, PeopleTaggedImagesResultItem.class);
				
		MovieResultItem mMedia = null;
		TvResultItem tMedia = null;
		
		if(json.getAsJsonObject().get("media_type").getAsString().equals("movie")) {
			mMedia = new Gson().fromJson(json.getAsJsonObject().get("media"), MovieResultItem.class);
		} else {
			tMedia = new Gson().fromJson(json.getAsJsonObject().get("media"), TvResultItem.class);
		}
		
		return new PeopleTaggedImagesResultItem(i.getAspectRatio(), i.getFilePath(), i.getHeight(), 
				i.getId(), i.getIso639_1(), i.getVoteAverage(), i.getVoteCount(), i.getWidth(), 
				i.getImageType(), i.getMediaType(), mMedia, tMedia);
	}

}
