package com.competitive_exam_management.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.competitive_exam_management.DTO.StudentDto;
import com.competitive_exam_management.DTO.StudentRespDto;
import com.competitive_exam_management.Services.StudentServicesImpl;
import com.competitive_exam_management.Services.UserServiceImpl;

import jakarta.servlet.http.HttpSession;

@RestController
@CrossOrigin("*")

public class StudentController {
	
	@Autowired
	private StudentServicesImpl servicesImpl;
	
	   @PostMapping("/student_registration_data")
	    public String StudentRgistration(@RequestBody StudentDto studentDto) {
		    boolean success=servicesImpl.studentRegistration(studentDto);
		 return "student_registration";
	      
	    }
	   
	   
	   @PostMapping("/student_update")
	    public String StudentUpdate(@RequestBody StudentDto studentDto) {
		    boolean success=servicesImpl.studentUpdate(studentDto);
		 return "student_view";
	      
	    }
	   
	   
	   
	   @GetMapping("/student_view")
	    public List<StudentRespDto> fetchAllStudents() {
	        List<StudentRespDto> students = servicesImpl.getAllStudents();
	        return students;
	    }
	   
	   @GetMapping("/student_update/{id}")
	   public StudentRespDto getdatabyid(@PathVariable int id) {
		   StudentRespDto studentRespDto=servicesImpl.getDataById(id);
		return studentRespDto;
 }
	   
	   @GetMapping("/student_delete/{id}")
	   public boolean deletebyid(@PathVariable int id) {
		   boolean success=servicesImpl.deleteById(id);
		
		return success;
 }
	}

