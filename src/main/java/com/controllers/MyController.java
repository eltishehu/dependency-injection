package com.controllers;

import com.services.GreetingService;
import org.springframework.stereotype.Controller;

/**
 * Created by e.sh. on 11-Sep-18.
 */
@Controller
public class MyController {

	private GreetingService greetingService;

	public MyController(GreetingService greetingService) {
		this.greetingService = greetingService;
	}

	public String hello() {
		System.out.println("Hello!!!!");

		return greetingService.sayGreeting();
	}

}
