package com.competitive_exam_management.Mapper;

import org.springframework.stereotype.Component;

import com.competitive_exam_management.DTO.StudentDto;
import com.competitive_exam_management.DTO.StudentRespDto;
import com.competitive_exam_management.Entity.StudentEntity;
import com.competitive_exam_management.Entity.UserEntity;
@Component
public class StudentMapper {
	
	 public UserEntity toEntity1(StudentDto studentDto) {
	        if (studentDto == null) {
	            return null;
	        }
	        UserEntity entity = new UserEntity();
	        entity.setId(studentDto.getId());
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
			    entity.setId(studentDto.getId());
		        entity.setName(studentDto.getName());
		        entity.setEmail(studentDto.getEmail());
		        entity.setPassword(studentDto.getPassword());
		        entity.setContactNumber(studentDto.getContactNumber());
		        entity.setQualification(studentDto.getQualification());
		        entity.setPassingYear(studentDto.getPassingYear());
		        entity.setCollegeName(studentDto.getCollegeName());
		        entity.setExamId(studentDto.getExamId());
		        entity.setStatus(studentDto.getStatus());
		        entity.setUser(studentDto.getUser());
		       
	           return entity;
		}
		
		   public StudentRespDto toDto(StudentEntity entity) {
		        StudentRespDto dto = new StudentRespDto();
		        dto.setId(entity.getId());
		        dto.setName(entity.getName());
		        dto.setEmail(entity.getEmail());
		        dto.setPassword(entity.getPassword());
		        dto.setQualification(entity.getQualification());
		        dto.setPassingYear(entity.getPassingYear());
		        dto.setCollegeName(entity.getCollegeName());
		        dto.setContactNumber(entity.getContactNumber());
		        dto.setExamId(entity.getExamId());
		        dto.setStatus(entity.getStatus());
		        entity.setUser(entity.getUser());
		        return dto;
		    }
		

}
