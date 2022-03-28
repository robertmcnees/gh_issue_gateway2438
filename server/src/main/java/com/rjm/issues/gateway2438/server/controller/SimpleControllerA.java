package com.rjm.issues.gateway2438.server.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/serviceA")
public class SimpleControllerA {

	@RequestMapping("/control")
	public String printSimpleControlMessage() {
		return "called /serviceA/control";
	}

}
