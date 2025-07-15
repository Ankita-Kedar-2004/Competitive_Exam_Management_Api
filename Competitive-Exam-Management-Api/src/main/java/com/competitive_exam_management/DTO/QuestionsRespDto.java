package com.competitive_exam_management.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class QuestionsRespDto {
	   private int questionId;
	    private String questionText;

	    private String optionA;
	    private String optionB;
	    private String optionC;
	    private String optionD;

	    private String correctAnswer;

	    private String examName;
	 
}
