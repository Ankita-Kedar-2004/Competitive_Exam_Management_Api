package com.competitive_exam_management.Services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import com.competitive_exam_management.Dao.ExamRepository;
import com.competitive_exam_management.Dao.QuestionsRepository;
import com.competitive_exam_management.Entity.ExamEntity;
import com.competitive_exam_management.Entity.QuestionsEntity;
import com.competitive_exam_management.DTO.ExamDto;
import com.competitive_exam_management.DTO.QuestionsDto;
import com.competitive_exam_management.DTO.QuestionsRespDto;
import com.competitive_exam_management.Interface.AssignQuestionInterface;
import com.competitive_exam_management.Mapper.QuestionsMapper;

import ch.qos.logback.core.util.Duration;

@Service
public class AssignQuestionServiceImpl implements AssignQuestionInterface {

    @Autowired
    private ExamRepository examRepository;

    @Autowired
    private QuestionsRepository questionRepository;

  @Autowired
  private QuestionsMapper questionMapper;

    @Override
    public List<QuestionsRespDto> assignQuestion(int studentId, int examId) {

    	Optional<ExamEntity> exam = examRepository.findById(examId);
    	       
    	ExamEntity examEntity = exam.orElseThrow(() -> new RuntimeException("Exam not found"));
    	int count = examEntity.getExamTime(); 
    	List<QuestionsEntity> questions = questionRepository.findRandomQuestionsByExam(examId, count);
    	return questions.stream()
    	        .map(questionMapper::toDto) 
    	        .collect(Collectors.toList());
    }
}
