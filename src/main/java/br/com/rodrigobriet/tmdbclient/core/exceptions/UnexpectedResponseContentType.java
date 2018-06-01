package br.com.rodrigobriet.tmdbclient.core.exceptions;

public class UnexpectedResponseContentType extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public UnexpectedResponseContentType(String message) {
		super(message);
	}
	
}
