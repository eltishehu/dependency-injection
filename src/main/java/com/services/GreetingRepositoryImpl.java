package com.services;

import org.springframework.stereotype.Component;

/**
 * Created by e.sh. on 12-Sep-18.
 */
@Component
public class GreetingRepositoryImpl implements GreetingRepository {

	@Override
	public String getEnglishGreeting() {
		return "Hello - Primary Greeting Service!!";
	}

	@Override
	public String getSpanishGreeting() {
		return "Servicio de Saludo Primario!!!";
	}

	@Override
	public String getGermanGreeting() {
		return "Primarer Grussdienst ";
	}
}
