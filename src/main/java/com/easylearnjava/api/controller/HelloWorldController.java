package com.easylearnjava.api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.easylearnjava.api.model.Creator;

@RestController
@RequestMapping(value = "/")
public class HelloWorldController {

	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public Creator welcome() {		
		return new Creator();
	}
	
	@RequestMapping(value="/hello", method = RequestMethod.GET)
	@ResponseBody
	public Creator sayHello() {		
		return new Creator();
	}

}