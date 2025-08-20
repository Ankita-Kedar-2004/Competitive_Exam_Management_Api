package com.competitive_exam_management.Controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.competitive_exam_management.Interface.ResultInterface;

@RestController
@RequestMapping("/result")
public class ResultController {
	
	@Autowired
	private ResultInterface resultInterface;
	 @PostMapping("/evaluateExam/{studentId}/{examId}")
	    public int evaluateExam(
	            @PathVariable int studentId,      
	            @PathVariable int examId,       
	            @RequestBody Map<String, String> answers) {  
	        Map<Integer, String> finalAnswers = new HashMap<>();
	        for (Map.Entry<String, String> entry : answers.entrySet()) {
	            finalAnswers.put(Integer.parseInt(entry.getKey()), entry.getValue());
	        }
           int result=resultInterface.evaluateExam(studentId, examId, finalAnswers);
	        return result;
	    }

}
