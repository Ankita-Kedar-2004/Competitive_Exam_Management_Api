package com.competitive_exam_management.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "student")
public class StudentEntity {
 
     
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
  
    @Column(name = "id")
    private int id;
   

	@Column(name = "user_name")
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;
    
    @Column(name = "contact_number")
    private String contactNumber;
    
    @Column(name = "qualification")
    private String qualification;
    
    @Column(name = "passingYear")
    private int passingYear;
    
    public StudentEntity() {
    	
    }
    
    public StudentEntity(int id, String name, String email, String password, String contactNumber, String qualification,
			int passingYear, String collegeName, int examId) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.contactNumber = contactNumber;
		this.qualification = qualification;
		this.passingYear = passingYear;
		this.collegeName = collegeName;
		this.examId = examId;
	}

	@Column(name = "college_name")
    private String collegeName;
    
    @Column(name = "exam_id")
    private int examId;

	public int getId() {
		return id;
	}

	public void setId(int id) {
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
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

	public int getExamId() {
		return examId;
	}

	public void setExamId(int i) {
		this.examId = i;
	}
    
    

   
}
