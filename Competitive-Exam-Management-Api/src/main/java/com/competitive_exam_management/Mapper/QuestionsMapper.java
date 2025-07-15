package com.competitive_exam_management.Mapper;

import org.springframework.stereotype.Component;

import com.competitive_exam_management.DTO.QuestionsDto;
import com.competitive_exam_management.DTO.QuestionsRespDto;
import com.competitive_exam_management.Entity.ExamEntity;
import com.competitive_exam_management.Entity.QuestionsEntity;
import com.competitive_exam_management.Entity.UserEntity;

@Component
public class QuestionsMapper {

    
    public QuestionsEntity toEntity(QuestionsDto dto, ExamEntity exam, UserEntity userId) {
    	 QuestionsEntity question = new QuestionsEntity();
         question.setQuestionId(dto.getQuestionId());
         question.setQuestionText(dto.getQuestionText());
         question.setOptionA(dto.getOptionA());
         question.setOptionB(dto.getOptionB());
         question.setOptionC(dto.getOptionC());
         question.setOptionD(dto.getOptionD());
         question.setCorrectAnswer(dto.getCorrectAnswer());
         question.setExam(exam);
         question.setUserId(userId);
         return question;
    }
    
    
    public QuestionsRespDto toDto(QuestionsEntity question) {
    	QuestionsRespDto dto = new QuestionsRespDto();
        dto.setQuestionId(question.getQuestionId());
        dto.setQuestionText(question.getQuestionText());
        dto.setOptionA(question.getOptionA());
        dto.setOptionB(question.getOptionB());
        dto.setOptionC(question.getOptionC());
        dto.setOptionD(question.getOptionD());
        dto.setCorrectAnswer(question.getCorrectAnswer());
        if (question.getExam() != null) {
            dto.setExamName(question.getExam().getExamName());
        }
        return dto;
    }
}
