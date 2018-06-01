package br.com.rodrigobriet.tmdbclient.core.requests;

public interface RequestService {
	
	void get(String uri, RequestMediator mapping);	

}
