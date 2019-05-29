package com.rebel.firstappdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class FirstAppDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstAppDemoApplication.class, args);
	}
	/*@RequestMapping(value = "/")
	public String hello(){
		return "This is a Test";
	}*/

}

