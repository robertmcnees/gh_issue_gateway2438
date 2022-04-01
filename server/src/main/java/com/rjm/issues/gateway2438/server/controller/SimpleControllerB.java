package com.rjm.issues.gateway2438.server.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleControllerB {

	@RequestMapping("/{id}/partners/{partner}/home")
	public String printVariableMessage(@PathVariable("id") String id, @PathVariable("partner") String partner) {
		return "called /" + id + "/partners/" + partner + "/home";
	}

}
