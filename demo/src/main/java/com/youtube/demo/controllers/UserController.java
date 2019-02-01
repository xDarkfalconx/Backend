package com.youtube.demo.controllers;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.youtube.demo.model.User;
import com.youtube.demo.service.UserService;
import com.youtube.demo.util.RestResponse;

import antlr.StringUtils;

@RestController
public class UserController {
	@Autowired
 protected UserService userService;
 
	protected ObjectMapper mapper;
	
	@RequestMapping(value ="/saveOrUpdate", method=RequestMethod.POST)
	public RestResponse saveOrUpdate(@RequestBody String userJson) 
			throws JsonParseException, JsonMappingException, IOException {
		
		User user = this.mapper.readValue(userJson, User.class);
		
		return null;
		
	}
	
	private boolean validate(User user) {
		boolean isValid = true;
		if (user.getFirstname() == null) {
			isValid=false;
		}
		if (user.getFirstsurname()== null) {
			isValid=false;
		}
		if(user.getAdress()==null) {
			isValid=false;
		}
		return isValid;
	}
}
