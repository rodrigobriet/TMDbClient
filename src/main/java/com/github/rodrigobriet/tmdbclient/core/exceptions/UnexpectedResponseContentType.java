package com.github.rodrigobriet.tmdbclient.core.exceptions;

/**
 * Throw when a request return a content-type not equal to "application/json;charset=utf-8"
 */
public class UnexpectedResponseContentType extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public UnexpectedResponseContentType(String message) {
		super(message);
	}
	
}
