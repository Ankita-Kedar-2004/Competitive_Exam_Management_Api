package com.competitive_exam_management.Services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.competitive_exam_management.DTO.StudentDto;
import com.competitive_exam_management.DTO.StudentRespDto;
import com.competitive_exam_management.DTO.UserDto;
import com.competitive_exam_management.DTO.UserLoginDto;
import com.competitive_exam_management.DTO.UserLoginRespDto;
import com.competitive_exam_management.Dao.UserRepository;
import com.competitive_exam_management.Entity.StudentEntity;
import com.competitive_exam_management.Entity.UserEntity;
import com.competitive_exam_management.Interface.UserInterface;
import com.competitive_exam_management.Mapper.UserMapper;

import jakarta.servlet.http.HttpSession;

@Service
public class UserServiceImpl implements UserInterface {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private UserMapper mapper;
	
     @Override
	public boolean userDto(UserDto userDto) {
		UserEntity user=mapper.toEntity(userDto);
		userRepository.save(user);
	        return true;
	}

   
@Override
public UserLoginRespDto userLoginDto(UserLoginDto userLoginDto) {

    UserEntity isValid = userRepository.findByEmailAndPassword(
            userLoginDto.getEmail(),
            userLoginDto.getPassword()
    ).orElse(null);

    if (isValid == null) {
        return null;
    }

    return mapper.toDto1(isValid);
}

	
	

}
