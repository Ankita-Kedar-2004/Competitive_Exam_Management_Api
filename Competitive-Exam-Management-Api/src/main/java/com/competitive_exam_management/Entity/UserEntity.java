package com.competitive_exam_management.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "user")
public class UserEntity {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private int userId;
    
   @Column(name = "user_name")
    private String username;

    @Column(name = "email" ,unique = true, nullable = false)
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "role")
    private String role;
    
    @Column(name = "contact_number")
    private String contact_number;
    
    public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getContact_number() {
		return contact_number;
	}
	public void setContact_number(String contact_number) {
		this.contact_number = contact_number;
	}
	
      public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public int getId() { return userId; }
    public void setId(int id) { this.userId = id; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public UserEntity(int userId, String username, String email, String password, String contact_number, String role) {
		super();
		this.userId = userId;
		this.username = username;
		this.email = email;
		this.password = password;
		this.contact_number = contact_number;
		this.role = role;
	}
	public UserEntity() {
    }
	
	public UserEntity orElse(Object object) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
