package com.services;

import org.springframework.stereotype.Service;

/**
 * Created by e.sh. on 11-Sep-18.
 */
@Service
public class GreetingServiceImpl implements GreetingService {

	public static final String HELLO_PEOPLE = "Hello People!!! - Original";

	@Override public String sayGreeting() {
		return HELLO_PEOPLE;
	}
}
