package com.competitive_exam_management.Services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.competitive_exam_management.DTO.ExamDto;
import com.competitive_exam_management.DTO.QuestionsDto;
import com.competitive_exam_management.Dao.ExamRepository;
import com.competitive_exam_management.Dao.QuestionsRepository;
import com.competitive_exam_management.Entity.ExamEntity;
import com.competitive_exam_management.Entity.QuestionsEntity;
import com.competitive_exam_management.Interface.QuestionsInterface;
import com.competitive_exam_management.Mapper.ExamMapper;
import com.competitive_exam_management.Mapper.QuestionsMapper;

@Service
public class QuestionsServicesImpl  implements QuestionsInterface{
	@Autowired
	ExamRepository examRepository;
	
	@Autowired
	 QuestionsRepository questionsRepository;
	
	@Autowired
	QuestionsMapper mapper;
	
	@Override
	public boolean registerQuestions(QuestionsDto questionsDto) {
		Optional<ExamEntity> optionalExam = examRepository.findById(questionsDto.getExamId());
	    if (optionalExam.isEmpty()) {
	        return false; // Or throw custom exception
	    }

		ExamEntity exam = optionalExam.get();
		QuestionsEntity question = QuestionsMapper.toEntity(questionsDto, exam);
		QuestionsEntity result =   questionsRepository.save(question);
		    return true;
	}

}
