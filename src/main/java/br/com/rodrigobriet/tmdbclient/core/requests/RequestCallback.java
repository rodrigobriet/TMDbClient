package br.com.rodrigobriet.tmdbclient.core.requests;

import java.io.IOException;

import br.com.rodrigobriet.tmdbclient.core.models.Header;
import br.com.rodrigobriet.tmdbclient.core.models.StatusMessage;

public interface RequestCallback<T> {

	public void onSucess(Header responseHeader, T model);
	
	public void OnFail(Header responseHeader, StatusMessage statusMessage);
	
	public void onError(Header requestHeader, IOException e);
	
}
