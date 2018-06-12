package br.com.rodrigobriet.tmdbclient.core.requests.interfaces;

public interface RequestService {
	
	void get(String uri, RequestMediator mediator);	
	
	void post(String uri, String body, RequestMediator mediator);	
	
	void delete(String uri, RequestMediator mediator);

}
