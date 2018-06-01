package br.com.rodrigobriet.tmdbclient.core.mapping;

public abstract class AbstractMapping<T> implements MappingService<T> {

	protected Class<T> clazz;
	
	public AbstractMapping(Class<T> clazz) {
		this.clazz = clazz;
	}
	
}
