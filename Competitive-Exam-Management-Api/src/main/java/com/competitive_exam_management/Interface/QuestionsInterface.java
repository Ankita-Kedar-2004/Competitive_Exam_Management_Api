package com.competitive_exam_management.Interface;

import org.springframework.stereotype.Service;

import com.competitive_exam_management.DTO.ExamDto;
import com.competitive_exam_management.DTO.QuestionsDto;

@Service
public interface QuestionsInterface {

	boolean registerQuestions(QuestionsDto questionsDto);

}
