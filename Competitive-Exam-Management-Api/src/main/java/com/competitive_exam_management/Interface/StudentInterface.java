package com.competitive_exam_management.Interface;

import java.util.List;

import org.springframework.stereotype.Service;

import com.competitive_exam_management.DTO.StudentDto;
import com.competitive_exam_management.DTO.StudentRespDto;


import jakarta.servlet.http.HttpSession;

@Service
public interface StudentInterface {
	
	public boolean studentRegistration(StudentDto studentDto);
	
	public List<StudentRespDto> getAllStudents();
	
	public StudentRespDto getDataById(int id);
	
	public boolean studentUpdate(StudentDto studentDto);
}
