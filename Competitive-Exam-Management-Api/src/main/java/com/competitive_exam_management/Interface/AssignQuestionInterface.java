package com.competitive_exam_management.Interface;

import java.util.List;

import org.springframework.stereotype.Service;

import com.competitive_exam_management.DTO.AssignQuestionReqDto;
import com.competitive_exam_management.DTO.QuestionsRespDto;

@Service
public interface AssignQuestionInterface {

List<QuestionsRespDto> assignQuestion(int studentId, int examId);
}
