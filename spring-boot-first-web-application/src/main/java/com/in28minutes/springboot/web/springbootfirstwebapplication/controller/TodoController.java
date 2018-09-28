package com.in28minutes.springboot.web.springbootfirstwebapplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.in28minutes.springboot.web.springbootfirstwebapplication.services.TodoService;

/**
 * @author draghuwanshi
 *
 */

@Controller
public class TodoController {
	
	@Autowired
	TodoService loginService;

	@RequestMapping(value="/list-todos",method=RequestMethod.GET)
	public String showLoginPage(ModelMap model) {
		return "list-todos";
	}

}
