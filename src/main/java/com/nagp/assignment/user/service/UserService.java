package com.nagp.assignment.user.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagp.assignment.user.dao.UserEntity;
import com.nagp.assignment.user.dao.UserRepository;
import com.nagp.assignment.user.responsevo.UserDetailsVO;
import com.nagp.assignment.user.responsevo.UserNotExistsException;

/**
 * Service class to perform user related business logic.
 * 
 * @author Yogendra
 */
@Service
public class UserService {

	private static final Logger LOGGER = LoggerFactory.getLogger(UserService.class);

	@Autowired
	private UserRepository userDao;

	public UserDetailsVO getUser(int id) {
		LOGGER.info("Calling dao method to get user details");
//		if (id == 1)
//			return new UserDetails("Yogi", 28, "abc@xyz.com");
//		else
//			return new UserDetails("Yogendra", 28, "xyz@abc.com");

		UserEntity user = userDao.findById(id)
				.orElseThrow(() -> new UserNotExistsException("User not exists."));

		return new UserDetailsVO(user.getName(), user.getAge(), user.getEmail());

	}

}
