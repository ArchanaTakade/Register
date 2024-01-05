package com.demo.exceptions;

public class AccountAlreadyRegisteredException extends RuntimeException {

	public AccountAlreadyRegisteredException(String msg) {
		super(msg);
	}
}
