package br.com.rodrigobriet.tmdbclient.core.mapping;

import java.lang.reflect.Type;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import br.com.rodrigobriet.tmdbclient.core.models.StatusMessage;
import br.com.rodrigobriet.tmdbclient.core.models.global.AccountStates;
import br.com.rodrigobriet.tmdbclient.core.models.global.PersonResultItem;
import br.com.rodrigobriet.tmdbclient.core.models.global.deserializer.PersonResultItemDeserializer;
import br.com.rodrigobriet.tmdbclient.resources.find.deserializer.FindByIdDeserializer;
import br.com.rodrigobriet.tmdbclient.resources.find.models.FindById;
import br.com.rodrigobriet.tmdbclient.resources.movies.deserializer.MoviesAccountStatesDeserializer;
import br.com.rodrigobriet.tmdbclient.resources.people.deserializer.PeopleCombinedCreditsDeserializer;
import br.com.rodrigobriet.tmdbclient.resources.people.deserializer.PeopleTaggedImagesResultItemDeserializer;
import br.com.rodrigobriet.tmdbclient.resources.people.models.PeopleCombinedCredits;
import br.com.rodrigobriet.tmdbclient.resources.people.models.submodels.PeopleTaggedImagesResultItem;
import br.com.rodrigobriet.tmdbclient.resources.search.deserializer.SearchMultiDeserializer;
import br.com.rodrigobriet.tmdbclient.resources.search.models.SearchMulti;

public class GsonMapping<T> extends AbstractMapping<T> {

	private Gson gson = new GsonBuilder()
			.registerTypeAdapter(FindById.class, new FindByIdDeserializer())
			.registerTypeAdapter(SearchMulti.class, new SearchMultiDeserializer())
			.registerTypeAdapter(PersonResultItem.class, new PersonResultItemDeserializer())
			.registerTypeAdapter(PeopleTaggedImagesResultItem.class, new PeopleTaggedImagesResultItemDeserializer())
			.registerTypeAdapter(PeopleCombinedCredits.class, new PeopleCombinedCreditsDeserializer())
			.registerTypeAdapter(AccountStates.class, new MoviesAccountStatesDeserializer())
			.create();
	private Type type;
	
	public GsonMapping(Class<T> clazz) {
		super(clazz);
	}
	
	public GsonMapping(Type type) {
		super(null);
		this.type = type;
	}
	
	@Override
	public T map(String value) {
		if(clazz == null) {
			return gson.fromJson(value, type);
		} else {
			return (T) gson.fromJson(value, clazz);
		}
	}

	@Override
	public StatusMessage mapError(String value) {
		return gson.fromJson(value, StatusMessage.class);
	}
}
