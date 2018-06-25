package com.github.rodrigobriet.tmdbclient.core.exceptions;


/**
 * Throw when a invalid value is given in some methods.
 */
public class InvalidParameterValue extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidParameterValue(String message) {
		super(message);
	}
}
