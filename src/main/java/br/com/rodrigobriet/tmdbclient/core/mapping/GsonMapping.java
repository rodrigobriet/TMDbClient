package br.com.rodrigobriet.tmdbclient.core.mapping;

import java.lang.reflect.Type;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import br.com.rodrigobriet.tmdbclient.core.models.StatusMessage;
import br.com.rodrigobriet.tmdbclient.resources.find.deserializer.FindPersonResultItemCustomDeserializer;
import br.com.rodrigobriet.tmdbclient.resources.find.models.FindById;

public class GsonMapping<T> extends AbstractMapping<T> {

	private Gson gson = new GsonBuilder().registerTypeAdapter(FindById.class, new FindPersonResultItemCustomDeserializer()).create();
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
