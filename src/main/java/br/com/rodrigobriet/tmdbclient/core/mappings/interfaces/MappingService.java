package br.com.rodrigobriet.tmdbclient.core.mappings.interfaces;

import java.lang.reflect.Type;

/**
 * Specifies the methods that a service mapping need to implements
 * to work with the resources classes.
 */
public interface MappingService {
	
	/**
	 * Map a Json value in a String to the specified Class model.
	 * @param value The Json String.
	 * @param clazz The model class to map.
	 * @return The mapped model as a {@link Object} class.
	 */
	public Object toObject(String value, Class<?> clazz);
	
	/**
	 * Map a Json value in a String to the specified Class model.
	 * @param value The Json String.
	 * @param type The class type to map.
	 * @return The mapped model as a {@link Object} class.
	 */
	public Object toObject(String value, Type type);
	
	/**
	 * Transform a object to a Json String.
	 * @param object The object to be transform.
	 * @return A String with the Json String generated from object.
	 */
	public String toJson(Object object);
	
}
