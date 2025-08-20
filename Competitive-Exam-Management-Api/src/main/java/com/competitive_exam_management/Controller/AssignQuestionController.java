package com.competitive_exam_management.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.competitive_exam_management.DTO.AssignQuestionReqDto;
import com.competitive_exam_management.DTO.QuestionsRespDto;
import com.competitive_exam_management.Interface.AssignQuestionInterface;
@RestController
@RequestMapping("/assignQuestion")
@CrossOrigin("*")
public class AssignQuestionController {
	
	@Autowired
	 private  AssignQuestionInterface assignmentInterface;

	@GetMapping("/random/{studentId}/{examId}")
   public List<QuestionsRespDto> assignQuestionByexamIdAndStudentId(@PathVariable int studentId,@PathVariable int examId){
		List <QuestionsRespDto> assignedQuestions=assignmentInterface.assignQuestion(studentId,  examId);
		System.out.println(studentId);
		return assignedQuestions;
	}

}
