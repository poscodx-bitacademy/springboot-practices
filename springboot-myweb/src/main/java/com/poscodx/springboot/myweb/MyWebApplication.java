package com.poscodx.springboot.myweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
public class MyWebApplication {

	@Controller
	public class HellController {
		@ResponseBody
		@RequestMapping("/hello")
		public String hello() {
			return "Hello World!!!!!";
		}
		
		@RequestMapping("/hello2")
		public String hello2() {
			return "hello";
		}		
	}
	
	public static void main(String[] args) {
		SpringApplication.run(MyWebApplication.class, args);
	}
}
