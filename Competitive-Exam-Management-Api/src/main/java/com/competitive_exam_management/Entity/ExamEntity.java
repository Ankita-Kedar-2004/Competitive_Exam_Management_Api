package com.competitive_exam_management.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="exams")
public class ExamEntity {
	@Id
	private int examId;
	
	@Column(name="exam_name")
	private String examName;
	
	@Column(name="exam_time")
	private int examTime;
	
	public ExamEntity() {}

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

	public int getExamTime() {
		return examTime;
	}

	public void setExamTime(int examTime) {
		this.examTime = examTime;
	}

	public ExamEntity(int examId, String examName, int examTime) {
		super();
		this.examId = examId;
		this.examName = examName;
		this.examTime = examTime;
	}
	
	

}
