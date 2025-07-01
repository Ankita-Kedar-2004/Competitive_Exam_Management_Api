package com.competitive_exam_management.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="exams")
public class ExamEntity {
	@Id
	
	private int examId;
	private String examName;
	
	public ExamEntity() {}
	
	public ExamEntity(int examId, String examName) {
		super();
		this.examId = examId;
		this.examName = examName;
	}
	public int getExamId() {
		return examId;
	}
	public void setExamId(int examId) {
		this.examId = examId;
	}
	public String getExamName() {
		return examName;
	}
	public void setExamName(String examName) {
		this.examName = examName;
	}


}
