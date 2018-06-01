package br.com.rodrigobriet.tmdbclient.core.exceptions;

public class InvalidParameterValue extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidParameterValue(String message) {
		super(message);
	}
}
