package com.springboot.docker_connection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

public class Controller {
@Autowired
	
	@RequestMapping("/test")
	public String test()
	{
		return "test";
	}
	@RequestMapping("/hello")
     public String hello()
     {
		return "hello ranchi";
     }
}

