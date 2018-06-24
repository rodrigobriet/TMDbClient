package br.com.rodrigobriet.tmdbclient.core.mappings;

import java.lang.reflect.Type;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import br.com.rodrigobriet.tmdbclient.core.mappings.interfaces.MappingService;
import br.com.rodrigobriet.tmdbclient.core.models.AccountStates;
import br.com.rodrigobriet.tmdbclient.core.models.PersonResultItem;
import br.com.rodrigobriet.tmdbclient.core.models.deserializer.PersonResultItemDeserializer;
import br.com.rodrigobriet.tmdbclient.resources.find.deserializer.FindByIdDeserializer;
import br.com.rodrigobriet.tmdbclient.resources.find.models.FindById;
import br.com.rodrigobriet.tmdbclient.resources.movies.deserializer.MoviesAccountStatesDeserializer;
import br.com.rodrigobriet.tmdbclient.resources.people.deserializer.PeopleCombinedCreditsDeserializer;
import br.com.rodrigobriet.tmdbclient.resources.people.deserializer.PeopleTaggedImagesResultItemDeserializer;
import br.com.rodrigobriet.tmdbclient.resources.people.models.PeopleCombinedCredits;
import br.com.rodrigobriet.tmdbclient.resources.people.models.submodels.PeopleTaggedImagesResultItem;
import br.com.rodrigobriet.tmdbclient.resources.search.deserializer.SearchMultiDeserializer;
import br.com.rodrigobriet.tmdbclient.resources.search.models.SearchMulti;
import br.com.rodrigobriet.tmdbclient.resources.tvepisodes.deserializer.TvEpisodesAccountStatesDeserializer;
import br.com.rodrigobriet.tmdbclient.resources.tvepisodes.models.TvEpisodesAccountStates;
import br.com.rodrigobriet.tmdbclient.resources.tvseasons.deserializer.TvSeasonsAccountStatesResultItemDeserializer;

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
