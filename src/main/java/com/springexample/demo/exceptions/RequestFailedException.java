package com.springexample.demo.exceptions;

public class RequestFailedException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public RequestFailedException(String message) {
		super(message);
	}
}
