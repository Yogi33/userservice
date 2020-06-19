package com.nagp.assignment.user.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nagp.assignment.user.responsevo.UserDetailsVO;
import com.nagp.assignment.user.service.UserService;

@RestController
@RequestMapping(produces = { MediaType.APPLICATION_JSON_VALUE })
public class UserController {

	private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

	@Autowired
	UserService userService;

	@GetMapping(value = "/user/{id}")
	public ResponseEntity<UserDetailsVO> getUserDetails(
			@RequestHeader(value = "locale", defaultValue = "en") String locale, @PathVariable("id") int id) {

		LOGGER.info("Calling service method to get user details");
		return new ResponseEntity<>(userService.getUser(id), HttpStatus.OK);
	}
}
