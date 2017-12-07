package com.test.test.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(LoggingAspect.class);

	@Before("execution(* com.test.test.controller.GreetingController.*(..))")
	public void beforeLogging() {
		LOGGER.info("Se va ha ejecutar una operación");
	}
	
	@After("execution(* com.test.test.controller.GreetingController.*(..))")
	public void afterLogging() {
		LOGGER.info("Se ha ejecutado una operación");
	}
}
