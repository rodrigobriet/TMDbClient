package br.com.rodrigobriet.tmdbclient.core.mapping;

import br.com.rodrigobriet.tmdbclient.core.models.StatusMessage;

public interface MappingService<T> {

	public T map(String value);
	
	public StatusMessage mapError(String value);
	
}
