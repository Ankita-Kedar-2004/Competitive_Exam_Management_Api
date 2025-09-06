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
	
	@Column(name="status")
    private String status;
	
	@Column(name="user")
    private String user;
	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public ExamEntity(int examId, String examName, int examTime, String status) {
		super();
		this.examId = examId;
		this.examName = examName;
		this.examTime = examTime;
		this.status = status;
	}



	
	

}
