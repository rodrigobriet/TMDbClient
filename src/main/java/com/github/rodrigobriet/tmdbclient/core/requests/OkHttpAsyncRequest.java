package com.github.rodrigobriet.tmdbclient.core.requests;

import java.io.IOException;
import java.nio.charset.Charset;

import com.github.rodrigobriet.tmdbclient.core.exceptions.UnexpectedResponseContentType;
import com.github.rodrigobriet.tmdbclient.core.models.Header;
import com.github.rodrigobriet.tmdbclient.core.requests.interfaces.RequestMediator;
import com.github.rodrigobriet.tmdbclient.core.requests.interfaces.RequestService;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okio.BufferedSink;

/**
 * Implements the {@link RequestService} interface using the OkHttp3 library.
 */
public class OkHttpAsyncRequest implements RequestService {
	
	private String baseURL;
	private OkHttpClient client;
	
	public OkHttpAsyncRequest(String baseURL, OkHttpClient client) {
		this.client = client;
		this.baseURL = baseURL;
	}
	
	@Override
	public void get(String uri, RequestMediator mediator) {
		Request.Builder r = new Request.Builder()
				.url(baseURL + uri);				
		
		makeCall(r.build(), mediator);
	}
	
	@Override
	public void post(String uri, String body, RequestMediator mediator) {
		Request.Builder r = new Request.Builder()
				.post(new RequestBody() {
					
					@Override
					public void writeTo(BufferedSink sink) throws IOException {
						sink.writeString(body, Charset.defaultCharset());
					}
					
					@Override
					public MediaType contentType() {
						return MediaType.parse("application/json;charset=utf-8");
					}
				})
				.url(baseURL + uri);				
		
		makeCall(r.build(), mediator);
	}
	
	@Override
	public void delete(String uri, RequestMediator mediator) {
		Request.Builder r = new Request.Builder()
				.delete()
				.url(baseURL + uri);				
		
		makeCall(r.build(), mediator);
	}
	
	private void makeCall(Request r, RequestMediator mediator) {
		client.newCall(r).enqueue(new Callback() {
			@Override
			public void onResponse(Call call, Response response) throws IOException {
				MediaType m = MediaType.parse(response.header("content-type"));
				
				if(m.type().equals(MediaType.parse("application/json;charset=utf-8").type())) {
					if(response.code() == 200 || response.code() == 201) {
						mediator.onSucces(new Header(response.headers().toMultimap(), response.code()), response.body().string());
					} else {
						mediator.onFail(new Header(response.headers().toMultimap(), response.code()), response.body().string());
					}
				} else {
					throw new UnexpectedResponseContentType("Unexpected content-type (" + response.header("content-type") + ").");
				}
			}
			
			@Override
			public void onFailure(Call call, IOException e) {
				mediator.onError(new Header(call.request().headers().toMultimap(), 0), e);
			}
		});
	}
	
}
