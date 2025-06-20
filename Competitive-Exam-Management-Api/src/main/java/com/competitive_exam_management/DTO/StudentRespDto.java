package com.competitive_exam_management.DTO;



public class StudentRespDto {
	
	
    public StudentRespDto(String name, String email, String qualification, int passingYear, String collegeName,
			String contactNumber, int examId, int id) {
		super();
		this.name = name;
		this.email = email;
		this.qualification = qualification;
		this.passingYear = passingYear;
		this.collegeName = collegeName;
		this.contactNumber = contactNumber;
		this.examId = examId;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public int getPassingYear() {
		return passingYear;
	}
	public void setPassingYear(int passingYear) {
		this.passingYear = passingYear;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public int getExamId() {
		return examId;
	}
	public void setExamId(int examId) {
		this.examId = examId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	private String name;
    private String email;
    private String qualification;
    private int passingYear;
    private String collegeName;
    private String contactNumber;
    private int examId;
    private int id;
    
    
    public StudentRespDto() {
    	
    }
}
