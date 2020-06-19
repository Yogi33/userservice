package com.nagp.assignment.user.controller;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.nagp.assignment.user.responsevo.FailureResponse;
import com.nagp.assignment.user.responsevo.UserNotExistsException;

@ControllerAdvice
@RestController
public class UserExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(Exception.class)
	public final ResponseEntity<FailureResponse> handleAllException(Exception ex, WebRequest request) {
		FailureResponse failureResponse = new FailureResponse(new Date(), ex.getMessage(),
				request.getDescription(false));
		return new ResponseEntity<FailureResponse>(failureResponse, HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@ExceptionHandler(UserNotExistsException.class)
	public final ResponseEntity<FailureResponse> handleUserNotFoundException(UserNotExistsException ex,
			WebRequest request) {
		FailureResponse failureResponse = new FailureResponse(new Date(), ex.getMessage(),
				"User with requested ID does not exists in database");
		return new ResponseEntity<FailureResponse>(failureResponse, HttpStatus.NOT_FOUND);
	}

}