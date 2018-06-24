package br.com.rodrigobriet.tmdbclient.core.requests.interfaces;

import java.io.IOException;

import br.com.rodrigobriet.tmdbclient.core.mappings.interfaces.MappingService;
import br.com.rodrigobriet.tmdbclient.core.models.Header;

/**
 * Specifies a mediator between a class that implements {@link RequestService} and the {@link RequestCallback} interface.
 * A implementation from this interface need to map the {@link RequestService} String to the expected 
 * {@link RequestCallback} model using a
 * {@link MappingService}.
 */
public interface RequestMediator {

	/**
	 * Executed when a 200 or 201 code is returned from the request.
	 * @param responseHeader The header returned from the request.
	 * @param body A {@link String} created by {@link RequestService} to be mapped before give to {@link RequestCallback}
	 */
	public void onSucces(Header responseHeader, String body);
	
	/**
	 * Executed when the request return something not equal to 200 or 201 response code.
	 * @param responseHeader The header returned from the request.
	 * @param body A {@link String} created by {@link RequestService} to be mapped before give to {@link RequestCallback}
	 */
	public void onFail(Header responseHeader, String body);

	/**
	 * Execute when some exceptions is throw, like "UnknownHostException".
	 * @param requestHeader The header used in the request.
	 * @param e The exception.
	 */
	public void onError(Header requestHeader, IOException e);

}
