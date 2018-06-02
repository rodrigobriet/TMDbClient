package br.com.rodrigobriet.tmdbclient.core.requests;

import java.io.IOException;

import br.com.rodrigobriet.tmdbclient.core.exceptions.UnexpectedResponseContentType;
import br.com.rodrigobriet.tmdbclient.core.models.Header;
import br.com.rodrigobriet.tmdbclient.core.requests.interfaces.RequestMediator;
import br.com.rodrigobriet.tmdbclient.core.requests.interfaces.RequestService;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class AsyncRequest implements RequestService {
	
	private String baseURL;
	private OkHttpClient client;
	
	public AsyncRequest(String baseURL, OkHttpClient client) {
		this.client = client;
		this.baseURL = baseURL;
	}
	
	@Override
	public void get(String uri, RequestMediator mapping) {
		Request.Builder r = new Request.Builder()
				.url(baseURL + uri);				
		
		makeCall(r.build(), mapping);
	}
	
	private void makeCall(Request r, RequestMediator mapping) {
		client.newCall(r).enqueue(new Callback() {
			@Override
			public void onResponse(Call call, Response response) throws IOException {
				MediaType m = MediaType.parse(response.header("content-type"));
				
				if(m.type().equals(MediaType.parse("application/json;charset=utf-8").type())) {
					if(response.code() == 200 || response.code() == 201) {
						mapping.onSucces(new Header(response.headers().toMultimap(), response.code()), response.body().string());
					} else {
						mapping.onFail(new Header(response.headers().toMultimap(), response.code()), response.body().string());
					}
				} else {
					throw new UnexpectedResponseContentType("Unexpected content-type (" + response.header("content-type") + ").");
				}
			}
			
			@Override
			public void onFailure(Call call, IOException e) {
				mapping.onError(new Header(call.request().headers().toMultimap(), 0), e);
			}
		});
	}
	
}
