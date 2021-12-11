package com.springexample.demo.exceptions;

public class RequestViolationException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public RequestViolationException(String message) {
		super(message);
	}
}
