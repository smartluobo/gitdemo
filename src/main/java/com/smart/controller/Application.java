package com.smart.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/springboot") 
public class Application {
	
	@RequestMapping("/")
	public String geeting(){
		System.out.println("zhangsan");
		System.out.println("lisi");
		return "hello world";
		
	}
	
	@RequestMapping("/getList/{id}")
	public String getList(@PathVariable("id")String id){
		return "sdfds--sfdsfds---sdfdsf--sdfsdf"+id;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	
}
