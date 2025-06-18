package com.competitive_exam_management.Mapper;

import org.springframework.stereotype.Component;

import com.competitive_exam_management.DTO.StudentDto;
import com.competitive_exam_management.DTO.UserDto;
import com.competitive_exam_management.DTO.UserLoginDto;
import com.competitive_exam_management.Entity.StudentEntity;
import com.competitive_exam_management.Entity.UserEntity;

@Component
public class UserMapper {

    public UserDto toDto(UserEntity user) {
        if (user == null) {
            return null;
        }
        UserDto dto = new UserDto();
        dto.setUsername(user.getUsername());
        dto.setContact_number(user.getContact_number());
        dto.setEmail(user.getEmail());
        dto.setPassword(user.getPassword());
        dto.setRole(user.getRole());
       
        return dto;
    }

    public UserEntity toEntity(UserDto userDto) {
        if (userDto == null) {
            return null;
        }
        UserEntity entity = new UserEntity();
        entity.setUsername(userDto.getUsername());
        entity.setContact_number(userDto.getContact_number());
        entity.setEmail(userDto.getEmail());
        entity.setPassword(userDto.getPassword());
        entity.setRole(userDto.getRole());
     
        return entity;
    }

    public UserEntity toEntity1(StudentDto studentDto) {
        if (studentDto == null) {
            return null;
        }
        UserEntity entity = new UserEntity();
        entity.setUsername(studentDto.getName());
        entity.setContact_number(studentDto.getContactNumber());
        entity.setEmail(studentDto.getEmail());
        entity.setPassword(studentDto.getPassword());
        entity.setRole("Student");
     
        return entity;
    }
    
	public StudentEntity toEntity(StudentDto studentDto) {
		 if (studentDto == null) {
	            return null;
	        }
		 StudentEntity entity = new StudentEntity();
	        entity.setName(studentDto.getName());
	        entity.setEmail(studentDto.getEmail());
	        entity.setPassword(studentDto.getPassword());
	        entity.setContactNumber(studentDto.getContactNumber());
	        entity.setQualification(studentDto.getQualification());
	        entity.setPassingYear(studentDto.getPassingYear());
	        entity.setCollegeName(studentDto.getCollegeName());
	        entity.setExamId(studentDto.getExamId());
           return entity;
	}
	
	  public StudentDto toDto(StudentEntity user) {
	        if (user == null) {
	            return null;
	        }
	        StudentDto dto = new StudentDto();
	        dto.setName(user.getName());
	        dto.setEmail(user.getEmail());
	        dto.setPassword(user.getPassword());
	        dto.setContactNumber(user.getContactNumber());	
	        dto.setQualification(user.getQualification());
	        dto.setPassingYear(user.getPassingYear());
	        dto.setCollegeName(user.getCollegeName());
	        dto.setExamId(user.getExamId());
	        return dto;
	    }

	
}
