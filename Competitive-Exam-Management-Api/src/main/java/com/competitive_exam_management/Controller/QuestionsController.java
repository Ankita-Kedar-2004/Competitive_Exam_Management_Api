package com.competitive_exam_management.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.competitive_exam_management.DTO.QuestionsDto;
import com.competitive_exam_management.DTO.QuestionsRespDto;
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
	

	@GetMapping("/viewQuestions")
    public List<QuestionsRespDto> fetchAllQuestions() {
        List<QuestionsRespDto> questions = questionsInterface.getAll();
        return questions;
    }
	

	 @GetMapping("/questions_update/{id}")
	   public QuestionsRespDto getdatabyid(@PathVariable int id) {
		   QuestionsRespDto questionsRespDto=questionsInterface.getDataById(id);
		return questionsRespDto;
}
	 
	 @GetMapping("/questions_delete/{id}")
	   public boolean deletedatabyid(@PathVariable int id) {
		   boolean delete= questionsInterface.deletedatabyid(id);
		return delete;
}
	
	 @PostMapping("/questions_update_data1")
	 public QuestionsRespDto questionsUpdate(@RequestBody QuestionsDto questionsDto) {
		   QuestionsRespDto delete= questionsInterface.questionsUpdate(questionsDto); 
 return delete; 	 }
}
