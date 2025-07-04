package com.competitive_exam_management.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExamRespDto {
	  private int examId;
		private String examName;
		private int ExamDuration;

}
