package com.learning.jpa.jpa.demo.app;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.learning.jpa.jpa.demo.app.entity.User;
import com.learning.jpa.jpa.demo.app.service.UserDaoService;

@Component
public class UserDAOServiceCommandLineRunner implements CommandLineRunner {
	private static final Logger log=org.slf4j.LoggerFactory.getLogger(UserDAOServiceCommandLineRunner.class);
	
	@Autowired
	UserDaoService userDaoService;

	@Override
	public void run(String... args) throws Exception {
		User user=new User("Jack","Admin");
		long insertUserId=userDaoService.insertUser(user);
		log.info("New User Created"+ user.toString());
	}

}
