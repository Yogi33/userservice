package com.nagp.assignment.user.responsevo;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class UserNotExistsException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public UserNotExistsException(String message) {
		super(message);
	}
}