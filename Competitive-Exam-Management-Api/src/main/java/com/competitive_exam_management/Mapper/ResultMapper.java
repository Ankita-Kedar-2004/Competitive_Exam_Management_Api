package com.competitive_exam_management.Mapper;

import org.springframework.stereotype.Component;

import com.competitive_exam_management.DTO.ExamRespDto;
import com.competitive_exam_management.DTO.ResultRespDto;
import com.competitive_exam_management.Entity.ExamEntity;
import com.competitive_exam_management.Entity.ResultEntity;

@Component
public class ResultMapper {

	   public ResultRespDto toDto(ResultEntity entity) {
		   ResultRespDto  dto = new ResultRespDto();
	       dto.setExam_id(entity.getExamId());
	        dto.setResult_id(entity.getResultId());
	        dto.setUser_id(entity.getStudentId());
	        dto.setScore(entity.getScore());
	        dto.setTotal(entity.getTotalQuestions());
	        return dto;
	 
	        
	    
	    }

}
