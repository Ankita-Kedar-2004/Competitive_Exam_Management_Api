package com.competitive_exam_management.Interface;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.competitive_exam_management.DTO.ResultRespDto;

@Service
public interface ResultInterface {

	int evaluateExam(int studentId, int examId, Map<Integer, String> answers);

	List<ResultRespDto> viewAllResult();

	List<ResultRespDto> viewResultById(int id);

}
