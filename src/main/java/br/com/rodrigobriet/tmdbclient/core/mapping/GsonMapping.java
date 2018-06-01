package br.com.rodrigobriet.tmdbclient.core.mapping;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import br.com.rodrigobriet.tmdbclient.core.models.StatusMessage;

public class GsonMapping<T> extends AbstractMapping<T> {

	private Gson gson = new GsonBuilder().create();
	
	public GsonMapping(Class<T> clazz) {
		super(clazz);
	}
	
	@Override
	public T map(String value) {
		return (T) gson.fromJson(value, clazz);
	}

	@Override
	public StatusMessage mapError(String value) {
		return gson.fromJson(value, StatusMessage.class);
	}
}
