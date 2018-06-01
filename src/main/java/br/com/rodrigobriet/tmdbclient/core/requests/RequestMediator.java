package br.com.rodrigobriet.tmdbclient.core.requests;

import java.io.IOException;

import br.com.rodrigobriet.tmdbclient.core.models.Header;

public interface RequestMediator {

	public void onSucces(Header responseHeader, String body);
	
	public void onFail(Header responseHeader, String body);

	public void onError(Header requestHeader, IOException e);

}
