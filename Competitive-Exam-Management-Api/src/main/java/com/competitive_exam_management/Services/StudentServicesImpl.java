package com.competitive_exam_management.Services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.competitive_exam_management.DTO.StudentDto;
import com.competitive_exam_management.DTO.StudentRespDto;
import com.competitive_exam_management.Dao.StudentRepository;
import com.competitive_exam_management.Dao.UserRepository;
import com.competitive_exam_management.Entity.StudentEntity;
import com.competitive_exam_management.Entity.UserEntity;
import com.competitive_exam_management.Interface.StudentInterface;
import com.competitive_exam_management.Mapper.StudentMapper;
import com.competitive_exam_management.Mapper.UserMapper;

import jakarta.servlet.http.HttpSession;
@Service
public class StudentServicesImpl implements StudentInterface{
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	private StudentMapper mapper;
	
	@Override
	 public boolean studentRegistration(StudentDto studentDto) {
		    StudentEntity student = mapper.toEntity(studentDto); 
		    UserEntity user = mapper.toEntity1(studentDto);
		    userRepository.save(user); 
		    studentRepository.save(student);
		    return true;                                      
		}
	
	
	@Override
	public List<StudentRespDto> getAllStudents() {
	    List<StudentEntity> entities = studentRepository.findAll();
	    return entities.stream()
	                   .map(mapper::toDto)  
	                   .collect(Collectors.toList());  
	}

	@Override
	public StudentRespDto  getDataById(int id) {
	  Optional<StudentEntity> data=studentRepository.findById(id);
	  if(data.isPresent()) {
		  StudentEntity student=data.get();
		return  mapper.toDto(student);
	  }
	return null;	
	}


	public boolean studentUpdate(StudentDto studentDto) {
	    StudentEntity student = mapper.toEntity(studentDto); 
	    UserEntity user = mapper.toEntity1(studentDto);
	    userRepository.save(user); 
	    studentRepository.save(student);
	    return true; 
	}
}
