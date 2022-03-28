package com.rjm.issues.gateway2438.server.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/serviceB")
public class SimpleControllerB {

	@RequestMapping("/variable")
	public String printVariableMessage() {
		return "called /serviceB/variable";
	}

}
