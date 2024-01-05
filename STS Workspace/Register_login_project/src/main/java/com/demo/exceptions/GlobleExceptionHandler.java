package com.demo.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class GlobleExceptionHandler extends ResponseEntityExceptionHandler	 {

	
	@ExceptionHandler(AccountAlreadyRegisteredException.class)
	public ResponseEntity<?> handleException(AccountAlreadyRegisteredException ex){
		return new ResponseEntity<>(HttpStatus.FORBIDDEN).ok(ex.getMessage());
	}
	
	
	@ExceptionHandler(AccountNotFoundException.class)
	public ResponseEntity<?> handleException(AccountNotFoundException ex){
		return new ResponseEntity<>(HttpStatus.UNAUTHORIZED).ok(ex.getMessage());
	}
	
	@ExceptionHandler(InvalidPasswordException.class)
	public ResponseEntity<?> handleException(InvalidPasswordException ex){
		return new ResponseEntity<>(HttpStatus.UNAUTHORIZED).ok(ex.getMessage());
	}
	
}
