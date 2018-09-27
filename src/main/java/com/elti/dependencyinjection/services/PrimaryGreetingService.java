package com.elti.dependencyinjection.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by e.sh. on 11-Sep-18.
 */
//@Service
//@Primary
//@Profile({"en", "default"})
public class PrimaryGreetingService implements GreetingService {

	private GreetingRepository greetingRepository;

	public PrimaryGreetingService(GreetingRepository greetingRepository) {
		this.greetingRepository = greetingRepository;
	}

	@Override
	public String sayGreeting() {
		return greetingRepository.getEnglishGreeting();
	}
}
