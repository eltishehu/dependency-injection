package com.services;

import org.springframework.stereotype.Service;

/**
 * Created by e.sh. on 11-Sep-18.
 */
@Service
public class GetterGreetingService implements GreetingService {

	@Override
	public String sayGreeting() {
		return "Hello - I was injected by the getter!";
	}
}
