package com.elti.dependencyinjection.controllers;

import com.elti.dependencyinjection.services.GreetingService;
import com.elti.dependencyinjection.services.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * Created by e.sh. on 11-Sep-18.
 */
@Controller
public class GetterInjectedController {

	public GreetingService greetingService;

	public String sayHello() {
		return greetingService.sayGreeting();
	}

	@Autowired
	public void setGreetingService(@Qualifier("getterGreetingService") GreetingService greetingService) {
		this.greetingService = greetingService;
	}
}
