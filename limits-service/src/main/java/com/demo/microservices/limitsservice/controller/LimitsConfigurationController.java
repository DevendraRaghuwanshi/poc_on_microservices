/**
 * 
 */
package com.demo.microservices.limitsservice.controller;

import com.demo.microservices.limitsservice.bean.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.microservices.limitsservice.bean.LimitsConfiguration;

/**
 * @author draghuwanshi
 *
 */
@RestController
public class LimitsConfigurationController {

	@Autowired
	private Configuration configuration;
	
	@GetMapping(value="/limits")
	public LimitsConfiguration retriveLimits() {
		return new LimitsConfiguration(configuration.getMaximum(),configuration.getMinimum());
	}
}
