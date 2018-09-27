package com.elti.dependencyinjection.services;

import org.springframework.stereotype.Service;

/**
 * Created by e.sh. on 11-Sep-18.
 */
@Service
public class ConstructorGreetingService implements GreetingService {

	@Override
	public String sayGreeting() {
		return "Hello - I was injected via the constructor!";
	}
}
