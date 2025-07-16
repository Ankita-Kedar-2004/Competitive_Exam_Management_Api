package com.competitive_exam_management.Interface;


import org.springframework.stereotype.Service;

import com.competitive_exam_management.DTO.StudentDto;
import com.competitive_exam_management.DTO.StudentRespDto;
import com.competitive_exam_management.DTO.UserDto;
import com.competitive_exam_management.DTO.UserLoginDto;
import com.competitive_exam_management.DTO.UserLoginRespDto;

import jakarta.servlet.http.HttpSession;


@Service
public interface UserInterface {
	
 public boolean userDto(UserDto userDto);
 
 public UserLoginRespDto userLoginDto(UserLoginDto userLoginDto);
 
}
