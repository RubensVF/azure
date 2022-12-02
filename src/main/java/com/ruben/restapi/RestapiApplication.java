package com.ruben.restapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import lombok.extern.apachecommons.CommonsLog;

@SpringBootApplication
@RestController
@CommonsLog
public class RestapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestapiApplication.class, args);
	}

  @GetMapping("/")
	public String hello(){
		return "hello world form linux";
	}
 
  @GetMapping("/info")
	public String info(RequestEntity<Object> requestEntity){
		System.out.println(requestEntity.getUrl());
    log.warn("mi primer log");
		System.out.println(requestEntity.toString());
		return "hello world form linux";
	}
  
  
	@GetMapping("/dto")
  public Dto dto(){
		Dto dto = Dto.builder().id("2").name("ruben").build();
		log.error(dto.toString());
		return dto;
	}

	@GetMapping("/null")
	public void helloNull(){
	}
	@GetMapping("/error/")
	public String error(){
	   try{
		  throw new RuntimeException("error happen");
		}
		catch(RuntimeException e){
		  throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"erro mio xd");
		}
	}
}
