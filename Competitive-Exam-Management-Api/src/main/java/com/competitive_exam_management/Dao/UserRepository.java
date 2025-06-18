package com.competitive_exam_management.Dao;

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

    
    @Query("SELECT new com.competitive_exam_management.DTO.UserLoginRespDto(u.email, u.role) FROM UserEntity u WHERE u.email = :email AND u.password = :password")
    Optional<UserLoginRespDto> findByEmailAndPassword(@Param("email") String email, @Param("password") String password);

	void save(StudentEntity user);

}
