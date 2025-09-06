package com.competitive_exam_management.Controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.competitive_exam_management.DTO.ResultRespDto;
import com.competitive_exam_management.Interface.ResultInterface;

@RestController
@RequestMapping("/result")
public class ResultController {
	
	@Autowired
	private ResultInterface resultInterface;
	
	 @PostMapping("/evaluateExam/{studentId}/{examId}")
	    public ResultRespDto evaluateExam(
	            @PathVariable int studentId,      
	            @PathVariable int examId,       
	            @RequestBody Map<String, String> answers) {  
	        Map<Integer, String> finalAnswers = new HashMap<>();
	        for (Map.Entry<String, String> entry : answers.entrySet()) {
	            finalAnswers.put(Integer.parseInt(entry.getKey()), entry.getValue());
	        }
           ResultRespDto result=resultInterface.evaluateExam(studentId, examId, finalAnswers);
	        return result;
	    }
	 
	 @GetMapping("/viewAllResult")
	 public List<ResultRespDto> viewAllResult() {
		 
		return resultInterface.viewAllResult();
		 
	 }
	 
	 @PostMapping("/viewResultById/{id}")
	 public List<ResultRespDto> viewAResultById(@PathVariable int id) {
		return resultInterface.viewResultById(id);
		 
	 }

}
