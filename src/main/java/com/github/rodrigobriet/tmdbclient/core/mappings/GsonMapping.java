package com.github.rodrigobriet.tmdbclient.core.mappings;

import java.lang.reflect.Type;

import com.github.rodrigobriet.tmdbclient.core.mappings.interfaces.MappingService;
import com.github.rodrigobriet.tmdbclient.core.models.AccountStates;
import com.github.rodrigobriet.tmdbclient.core.models.PersonResultItem;
import com.github.rodrigobriet.tmdbclient.core.models.deserializer.PersonResultItemDeserializer;
import com.github.rodrigobriet.tmdbclient.resources.find.deserializer.FindByIdDeserializer;
import com.github.rodrigobriet.tmdbclient.resources.find.models.FindById;
import com.github.rodrigobriet.tmdbclient.resources.movies.deserializer.MoviesAccountStatesDeserializer;
import com.github.rodrigobriet.tmdbclient.resources.people.deserializer.PeopleCombinedCreditsDeserializer;
import com.github.rodrigobriet.tmdbclient.resources.people.deserializer.PeopleTaggedImagesResultItemDeserializer;
import com.github.rodrigobriet.tmdbclient.resources.people.models.PeopleCombinedCredits;
import com.github.rodrigobriet.tmdbclient.resources.people.models.submodels.PeopleTaggedImagesResultItem;
import com.github.rodrigobriet.tmdbclient.resources.search.deserializer.SearchMultiDeserializer;
import com.github.rodrigobriet.tmdbclient.resources.search.models.SearchMulti;
import com.github.rodrigobriet.tmdbclient.resources.tvepisodes.deserializer.TvEpisodesAccountStatesDeserializer;
import com.github.rodrigobriet.tmdbclient.resources.tvepisodes.models.TvEpisodesAccountStates;
import com.github.rodrigobriet.tmdbclient.resources.tvseasons.deserializer.TvSeasonsAccountStatesResultItemDeserializer;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Implements the {@link MappingService} interface using the Gson library.
 * Some classes uses customs deserializers.
 */
public class GsonMapping implements MappingService {

	private Gson gson = new GsonBuilder()
			.registerTypeAdapter(FindById.class, new FindByIdDeserializer())
			.registerTypeAdapter(SearchMulti.class, new SearchMultiDeserializer())
			.registerTypeAdapter(PersonResultItem.class, new PersonResultItemDeserializer())
			.registerTypeAdapter(PeopleTaggedImagesResultItem.class, new PeopleTaggedImagesResultItemDeserializer())
			.registerTypeAdapter(PeopleCombinedCredits.class, new PeopleCombinedCreditsDeserializer())
			.registerTypeAdapter(AccountStates.class, new MoviesAccountStatesDeserializer())
			.registerTypeAdapter(TvEpisodesAccountStates.class, new TvEpisodesAccountStatesDeserializer())
			.registerTypeAdapter(TvSeasonsAccountStatesResultItemDeserializer.class, new TvSeasonsAccountStatesResultItemDeserializer())
			.create();
	
	@Override
	public Object toObject(String value, Class<?> clazz) {
		return gson.fromJson(value, clazz);
	}

	@Override
	public Object toObject(String value, Type type) {
		return gson.fromJson(value, type);
	}

	@Override
	public String toJson(Object object) {
		return gson.toJson(object);
	}
	
}
