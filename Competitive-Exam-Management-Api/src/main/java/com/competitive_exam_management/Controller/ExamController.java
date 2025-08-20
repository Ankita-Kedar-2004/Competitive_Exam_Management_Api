package com.competitive_exam_management.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.competitive_exam_management.DTO.ExamDto;
import com.competitive_exam_management.DTO.ExamRespDto;
import com.competitive_exam_management.DTO.StudentDto;
import com.competitive_exam_management.DTO.StudentRespDto;
import com.competitive_exam_management.Interface.ExamInterface;

@RestController
@RequestMapping("/exam")
@CrossOrigin("*")
public class ExamController {
	
	@Autowired
	ExamInterface examInterface;

	@PostMapping("/registerExam")
	public String registerExam(@RequestBody ExamDto examDto ) {
		boolean exam = examInterface.registerExam(examDto);
		return "done";
		}
	
	@GetMapping("/Exam_view/{status}")
    public List<ExamRespDto> fetchAllExams(@PathVariable String status) {
		if ("Inactive".equalsIgnoreCase(status)) {
	        List<ExamRespDto> exams = examInterface.getAllInactiveExams(); 
	        return exams;
	    } else {
	        List<ExamRespDto> exams = examInterface.getAllActiveExams();
	        return exams;
	    }
    }
	
	@GetMapping("/Exam_view")
    public List<ExamRespDto> fetchAllExams() {
	        List<ExamRespDto> exams = examInterface.getAllActiveExams();
	        return exams;
	    
    }
	
	 @GetMapping("/exam_update/{id}")
	   public ExamRespDto getdatabyid(@PathVariable int id) {
		   ExamRespDto examRespDto=examInterface.getDataById(id);
		return examRespDto;
}

	 @PostMapping("/exam_update")
	    public ExamDto StudentUpdate(@RequestBody ExamDto examDto) {
		    boolean success=examInterface.examUpdate(examDto);
		    System.out.println(examDto.getExamId());
		 return examDto;
	      
	    }
	 
	 @GetMapping("/exam_delete/{id}")
	   public int deletebyid(@PathVariable int id) {
		   int success=examInterface.softDelete(id);
		return 1;
    }
	   
}
