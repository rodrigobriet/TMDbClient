package br.com.rodrigobriet.tmdbclient.core.requests.interfaces;

import java.io.IOException;

import br.com.rodrigobriet.tmdbclient.core.models.Header;
import br.com.rodrigobriet.tmdbclient.core.models.StatusMessage;

/**
 * Define a way to access the returned data from a resource request.
 * @param <T> The request model class returned by the resource.
 */
public interface RequestCallback<T> {

	/**
	 * Executed when a 200 or 201 code is returned from the request.
	 * @param responseHeader The header returned from the request.
	 * @param model The model generated with the requested data.
	 */
	public void onSucess(Header responseHeader, T model);
	
	/**
	 * Executed when the request return something not equal to 200 or 201 response code.
	 * @param responseHeader The header returned from the request.
	 * @param statusMessage A model with the error message and code specified by TMDb API.
	 */
	public void OnFail(Header responseHeader, StatusMessage statusMessage);
	
	/**
	 * Execute when some exceptions is throw, like "UnknownHostException".
	 * @param requestHeader The header used in the request.
	 * @param e The exception.
	 */
	public void onError(Header requestHeader, IOException e);
	
}
