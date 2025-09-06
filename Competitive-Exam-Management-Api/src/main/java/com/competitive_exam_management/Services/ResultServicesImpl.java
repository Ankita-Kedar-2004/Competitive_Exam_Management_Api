package com.competitive_exam_management.Services;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.competitive_exam_management.DTO.QuestionsRespDto;
import com.competitive_exam_management.DTO.ResultRespDto;
import com.competitive_exam_management.Dao.QuestionsRepository;
import com.competitive_exam_management.Dao.ResultRepository;
import com.competitive_exam_management.Entity.QuestionsEntity;
import com.competitive_exam_management.Entity.ResultEntity;
import com.competitive_exam_management.Entity.StudentEntity;
import com.competitive_exam_management.Interface.ResultInterface;
import com.competitive_exam_management.Mapper.QuestionsMapper;
import com.competitive_exam_management.Mapper.ResultMapper;

@Service
public class ResultServicesImpl implements ResultInterface{
	
	@Autowired
	private QuestionsRepository questionsRepository;
	
	
	@Autowired
	private ResultMapper mapper;
	
	@Autowired
	private QuestionsMapper questionsMapper;
	
	@Autowired
	private ResultRepository resultRepository;

	@Override
	public ResultRespDto evaluateExam(int studentId, int examId, Map<Integer, String> answers) {
	    int score = 0;
	    int total = answers.size();

	    List<Integer> questionIds = new ArrayList<>(answers.keySet());
	    List<QuestionsEntity> entities = questionsRepository.findQuestionsByIds(questionIds);

	    List<QuestionsRespDto> questions = entities.stream()
	                                               .map(questionsMapper::toDto)
	                                               .collect(Collectors.toList());

	    for (Map.Entry<Integer, String> entry : answers.entrySet()) {
	        Integer questionId = entry.getKey();
	        String givenAnswer = entry.getValue();

	        String correctAnswer = questionsRepository.findCorrectAnswerById(questionId);

	        if (correctAnswer != null && correctAnswer.equalsIgnoreCase(givenAnswer)) {
	            score++;
	        }
	    }

	    ResultEntity result = new ResultEntity();
	    result.setStudentId(studentId);
	    result.setExamId(examId);
	    result.setTotalQuestions(total);
	    result.setScore(score);
	    resultRepository.save(result);

	    ResultRespDto dto = new ResultRespDto();
	    dto.setResult_id(total);
	    dto.setUser_id(studentId);
	    dto.setExam_id(examId);
	    dto.setTotal(total);
	    dto.setScore(score);
	    dto.setQuestions(questions); 
	    return dto;
	}

	@Override
	public List<ResultRespDto> viewAllResult() {
		 List<ResultEntity> entities = resultRepository.findAll();
		    return entities.stream()
		                   .map(mapper::toDto)
		                   .collect(Collectors.toList());
	}

	@Override
	public List<ResultRespDto> viewResultById(int id) {
	    List<ResultEntity> entities = resultRepository.findResultById(id);
	    return entities.stream()
	                   .map(mapper::toDto)
	                   .collect(Collectors.toList());
	}

}
