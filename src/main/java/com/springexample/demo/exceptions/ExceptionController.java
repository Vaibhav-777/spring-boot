package com.springexample.demo.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.springexample.demo.pojo.ExceptionDetails;

@ControllerAdvice
public class ExceptionController {
	@ExceptionHandler(value = ResourceNotFoundException.class)
	public ResponseEntity<ExceptionDetails> exception(ResourceNotFoundException exception) {
		return new ResponseEntity<>(new ExceptionDetails(exception.getMessage()), HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(value = RequestViolationException.class)
	public ResponseEntity<ExceptionDetails> exception(RequestViolationException exception) {
		return new ResponseEntity<>(new ExceptionDetails(exception.getMessage()), HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(value = RequestFailedException.class)
	public ResponseEntity<ExceptionDetails> exception(RequestFailedException exception) {
		return new ResponseEntity<>(new ExceptionDetails(exception.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
