package com.competitive_exam_management.Mapper;

import org.springframework.stereotype.Component;

import com.competitive_exam_management.DTO.QuestionsDto;
import com.competitive_exam_management.Entity.ExamEntity;
import com.competitive_exam_management.Entity.QuestionsEntity;

@Component
public class QuestionsMapper {

    public static QuestionsEntity toEntity(QuestionsDto dto, ExamEntity exam) {
        QuestionsEntity question = new QuestionsEntity();
        question.setQuestionId(dto.getQuestionId());
        question.setQuestionText(dto.getQuestionText());
        question.setOptionA(dto.getOptionA());
        question.setOptionB(dto.getOptionB());
        question.setOptionC(dto.getOptionC());
        question.setOptionD(dto.getOptionD());
        question.setCorrectAnswer(dto.getCorrectAnswer());
        question.setExam(exam); // setting foreign key
        return question;
    }

    public static QuestionsDto toDto(QuestionsEntity question) {
        QuestionsDto dto = new QuestionsDto();
        dto.setQuestionId(question.getQuestionId());
        dto.setQuestionText(question.getQuestionText());
        dto.setOptionA(question.getOptionA());
        dto.setOptionB(question.getOptionB());
        dto.setOptionC(question.getOptionC());
        dto.setOptionD(question.getOptionD());
        dto.setCorrectAnswer(question.getCorrectAnswer());
        dto.setExamId(question.getExam().getExamId()); // extract FK as ID
        return dto;
    }
}
