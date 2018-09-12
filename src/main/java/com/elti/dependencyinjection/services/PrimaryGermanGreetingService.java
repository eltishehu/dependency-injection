package com.elti.dependencyinjection.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by e.sh. on 11-Sep-18.
 */
@Service
@Primary
@Profile("de")
public class PrimaryGermanGreetingService implements GreetingService {

	@Override
	public String sayGreeting() {
		return "Primarer Grussdienst!";
	}
}
