package com.competitive_exam_management.Mapper;

import org.springframework.stereotype.Component;

import com.competitive_exam_management.DTO.ExamDto;
import com.competitive_exam_management.DTO.ExamRespDto;
import com.competitive_exam_management.DTO.StudentRespDto;
import com.competitive_exam_management.Entity.ExamEntity;
import com.competitive_exam_management.Entity.StudentEntity;

@Component
public class ExamMapper {
	 public ExamEntity toEntity(ExamDto examDto) {
	        if (examDto == null) {
	            return null;
	        }
	        ExamEntity entity = new ExamEntity();
	        entity.setExamId(examDto.getExamId());
	        entity.setExamName(examDto.getExamName());
	        entity.setExamTime(examDto.getExamDuration());
	        return entity;
	    }
	 

	   public ExamRespDto toDto(ExamEntity entity) {
		   ExamRespDto  dto = new ExamRespDto();
	       dto.setExamId(entity.getExamId());
	        dto.setExamName(entity.getExamName());
	        dto.setExamDuration(entity.getExamTime());
	        return dto;
	 
	        
	    
	    }
	
}
