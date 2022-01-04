package com.springexample.demo.exceptions;

public class ResourceNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public ResourceNotFoundException(String exceptionMessage) {
		super(exceptionMessage);
	}
}
