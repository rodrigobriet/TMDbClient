package br.com.rodrigobriet.tmdbclient.core.requests.interfaces;

import br.com.rodrigobriet.tmdbclient.TMDb;

/**
 * Defines what methods a request service needs to implement.
 * A implementation of RequestService need to request a resource and give the result to the {@link RequestMediator}.
 * 
 * <p>This class needs to receive the BASE_URL from {@link TMDb} class.</p>
 */
public interface RequestService {
	
	
	/**
	 * Make a GET request to the specified URI.
	 * @param uri The URI to request.
	 * @param mediator The mediator to send the request result.
	 */
	void get(String uri, RequestMediator mediator);	
	
	/**
	 * Make a POST request to the specified URI.
	 * @param uri The URI to request.
	 * @param mediator The mediator to send the request result.
	 */
	void post(String uri, String body, RequestMediator mediator);	
	
	/**
	 * Make a DELETE request to the specified URI.
	 * @param uri The URI to request.
	 * @param mediator The mediator to send the request result.
	 */
	void delete(String uri, RequestMediator mediator);

}
