package com.competitive_exam_management.Dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.competitive_exam_management.DTO.UserLoginDto;
import com.competitive_exam_management.DTO.UserLoginRespDto;
import com.competitive_exam_management.Entity.StudentEntity;
import com.competitive_exam_management.Entity.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer> {

	
	@Query("SELECT u FROM UserEntity u WHERE u.email = :email AND u.password = :password")
	Optional<UserEntity> findByEmailAndPassword(@Param("email") String email,
	                                            @Param("password") String password);

	 
	  void save(StudentEntity user);
	 


	

	
}
