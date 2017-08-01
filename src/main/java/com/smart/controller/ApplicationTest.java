package com.smart.controller;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.sym.Name;

@SpringBootApplication
@RestController
@RequestMapping("/springboot")
public class ApplicationTest {
	
	@RequestMapping("/")
	public String geeting(){
		
		System.out.println("Hello  world");
		return "hello world";
	}
	
	@RequestMapping("/getList/{id}")
	public String getList(@PathVariable("id")String id){
		return "sdfds--sfdsfds---sdfdsf--sdfsdf"+id;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx){
		
		return null;
	}
}
