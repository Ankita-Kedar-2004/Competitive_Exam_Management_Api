package com.competitive_exam_management.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.competitive_exam_management.DTO.ExamDto;
import com.competitive_exam_management.DTO.QuestionsDto;
import com.competitive_exam_management.Interface.ExamInterface;
import com.competitive_exam_management.Interface.QuestionsInterface;

@RestController
public class QuestionsController {
	
	@Autowired
	QuestionsInterface questionsInterface;

	@PostMapping("/registerQuestions")
	public String registerQuestions(@RequestBody QuestionsDto questionsDto ) {
		boolean exam = questionsInterface.registerQuestions(questionsDto);
		return "done";
		}

}
