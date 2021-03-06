package com.test.test.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.test.test.domain.Greeting;

@RestController
public class GreetingController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(GreetingController.class);
	
	@RequestMapping(method = RequestMethod.GET, value = "/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
		LOGGER.info("Enviando");
        return new Greeting(1,"Hola "+name);
    }
}
