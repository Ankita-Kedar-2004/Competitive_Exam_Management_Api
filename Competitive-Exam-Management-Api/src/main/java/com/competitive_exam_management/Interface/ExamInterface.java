package com.competitive_exam_management.Interface;

import java.util.List;

import org.springframework.stereotype.Service;

import com.competitive_exam_management.DTO.ExamDto;
import com.competitive_exam_management.DTO.ExamRespDto;

@Service
public interface ExamInterface {

	  boolean registerExam(ExamDto examDto);

	List<ExamRespDto> getAllExamName();

	ExamRespDto getDataById(int id);

	boolean examUpdate(ExamDto examDto);

}
