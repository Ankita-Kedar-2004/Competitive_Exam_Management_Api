package com.competitive_exam_management.Services;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.competitive_exam_management.Dao.QuestionsRepository;
import com.competitive_exam_management.Interface.ResultInterface;

@Service
public class ResultServicesImpl implements ResultInterface{
	
	@Autowired
	private QuestionsRepository questionsRepository;

	@Override
	public int evaluateExam(int studentId, int examId, Map<Integer, String> answers) {
		  int score = 0;

	        for (Map.Entry<Integer, String> entry : answers.entrySet()) {
	            Integer questionId = entry.getKey();
	            String givenAnswer = entry.getValue();

	            String correctAnswer = questionsRepository.findCorrectAnswerById(questionId);

	            if (correctAnswer != null && correctAnswer.equalsIgnoreCase(givenAnswer)) {
	                score++;
	            }
	        }
	        return score;
	}

}
