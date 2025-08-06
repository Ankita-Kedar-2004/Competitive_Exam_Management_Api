package com.competitive_exam_management.Interface;

import java.util.List;

import org.springframework.stereotype.Service;

import com.competitive_exam_management.DTO.ExamDto;
import com.competitive_exam_management.DTO.ExamRespDto;

@Service
public interface ExamInterface {

	  boolean registerExam(ExamDto examDto);
	  
	ExamRespDto getDataById(int id);

	boolean examUpdate(ExamDto examDto);

	int softDelete(int id);

	List<ExamRespDto> getAllInactiveExams();

	List<ExamRespDto> getAllActiveExams();

}
