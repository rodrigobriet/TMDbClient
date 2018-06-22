package br.com.rodrigobriet.tmdbclient.core.mappings.interfaces;

import java.lang.reflect.Type;

public interface MappingService {
	
	public Object toObject(String value, Class<?> clazz);
	
	public Object toObject(String value, Type type);
	
	public String toJson(Object object);
	
}
