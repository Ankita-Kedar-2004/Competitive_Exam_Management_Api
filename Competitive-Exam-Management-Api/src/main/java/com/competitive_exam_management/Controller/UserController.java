package com.competitive_exam_management.Controller;
	
	import org.hibernate.service.Service;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.context.annotation.ComponentScan;
	import org.springframework.web.bind.annotation.CrossOrigin;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RestController;

import com.competitive_exam_management.DTO.UserDto;
import com.competitive_exam_management.DTO.UserLoginDto;
import com.competitive_exam_management.DTO.UserLoginRespDto;

import com.competitive_exam_management.Services.UserServiceImpl;

import jakarta.servlet.http.HttpSession;
	
	
	@RestController
	@CrossOrigin("*")
	public class UserController {
		
		@Autowired
		  private  UserServiceImpl servicesImpl;
		
		
		
		  @PostMapping("/Sign_up")
		    public String SignUpPage(@RequestBody UserDto userDto) {
			  
		  boolean success=servicesImpl.userDto(userDto);
			  System.out.println("Success");
			  System.out.println(userDto.getContact_number());
				return "signUp";
		      
		    }
		  
		
		  
			@PostMapping("/login")
			public UserLoginRespDto userLogin(@RequestBody UserLoginDto userLoginDto) {
				UserLoginRespDto success = servicesImpl.userLoginDto(userLoginDto);
				
				return success;
			}
	
		
	}
