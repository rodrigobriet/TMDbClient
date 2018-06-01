package br.com.rodrigobriet.tmdbclient.core.models;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Header {

	private Map<String, List<String>> headers;
	
	public Header(Map<String, List<String>> headers, int statusCode) {
		this.headers = headers;
		this.headers.put("status-code", Arrays.asList(""+statusCode));
	}
	
	public int getRateLimit() {
		return Integer.parseInt(headers.get("x-ratelimit-limit").get(0));
	}
	
	public int getRateLimitRemaining() {
		return Integer.parseInt(headers.get("x-ratelimit-remaining").get(0));
	}
	
	public int getRateLimitReset() {
		return Integer.parseInt(headers.get("x-ratelimit-reset").get(0));
	}
	
	public int getStatusCode() {
		return Integer.parseInt(headers.get("status-code").get(0));
	}
	
	public List<String> getHeader(String field) {
		return headers.get(field);
	}
	
	public Map<String, List<String>> getHeaders() {
		return headers;
	}
}
