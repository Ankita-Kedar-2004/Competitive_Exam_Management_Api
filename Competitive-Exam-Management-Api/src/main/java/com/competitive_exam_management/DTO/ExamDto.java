package com.competitive_exam_management.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExamDto {
	
    private int examId;
	private String examName;
	private int ExamDuration;
}
