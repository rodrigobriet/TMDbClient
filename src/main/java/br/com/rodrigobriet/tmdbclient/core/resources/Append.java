package br.com.rodrigobriet.tmdbclient.core.resources;


/**
 * Define methods for the appends enum.
 * This interface need to be implemented in classes that define the append_to_response endpoints of a resource.
 */
public interface Append {

	/**
	 * Get the endpoint name that this enum represent.
	 * @return Return a {@link String} equal to the resource endpoint that this element represent.
	 */
	public String getValue();
	
}
