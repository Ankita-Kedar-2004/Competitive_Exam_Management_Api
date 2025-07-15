package com.competitive_exam_management.Interface;

import java.util.List;

import org.springframework.stereotype.Service;


import com.competitive_exam_management.DTO.ExamDto;
import com.competitive_exam_management.DTO.QuestionsDto;
import com.competitive_exam_management.DTO.QuestionsRespDto;

@Service
public interface QuestionsInterface {

	boolean registerQuestions(QuestionsDto questionsDto);

	List<QuestionsRespDto> getAll();

	QuestionsRespDto getDataById(int id);

	QuestionsRespDto questionsUpdate(QuestionsDto questionsDto);

	boolean deletedatabyid(int id);

}
