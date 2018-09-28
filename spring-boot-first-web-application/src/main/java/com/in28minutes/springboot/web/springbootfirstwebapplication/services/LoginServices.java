package com.in28minutes.springboot.web.springbootfirstwebapplication.services;

import org.springframework.stereotype.Component;
/**
 * @author draghuwanshi
 *
 */

@Component
public class LoginServices {

	public boolean validateUser(String name,String password) {
		return name.equalsIgnoreCase("dev") && password.equalsIgnoreCase("dev");
	}
}
