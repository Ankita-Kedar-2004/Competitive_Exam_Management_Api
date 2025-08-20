package com.competitive_exam_management.Services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.competitive_exam_management.DTO.ExamDto;
import com.competitive_exam_management.DTO.ExamRespDto;
import com.competitive_exam_management.Dao.ExamRepository;
import com.competitive_exam_management.Entity.ExamEntity;
import com.competitive_exam_management.Entity.StudentEntity;
import com.competitive_exam_management.Entity.UserEntity;
import com.competitive_exam_management.Interface.ExamInterface;
import com.competitive_exam_management.Mapper.ExamMapper;

@Service
public class ExamServicesImpl implements ExamInterface {

	@Autowired
	ExamRepository examRepository;
	
	@Autowired
	ExamMapper mapper;

	@Override
	public boolean registerExam(ExamDto examDto) {
	    ExamEntity exam = mapper.toEntity(examDto); 
	    ExamEntity result = examRepository.save(exam); 
	    return true;
	}

	

	
	@Override
	public ExamRespDto getDataById(int id) {
		  Optional<ExamEntity> data=examRepository.findById(id);
		  if(data.isPresent()) {
			  ExamEntity exam=data.get();
			return  mapper.toDto(exam);
		  }
		return null;
	}

	@Override
	public boolean examUpdate(ExamDto examDto) {
		ExamEntity student = mapper.toEntity(examDto); 
		System.out.println("Hii");
		System.out.println(examDto.getExamId());
		examRepository.save(student);
		    return true;
	}

	@Override
	public int softDelete(int id) {
	    int data =examRepository.softDelete(id);
	    return 1;
	}

	@Override
	public List<ExamRespDto> getAllInactiveExams() {
		 List<ExamEntity> entities = examRepository.findAllInactiveStatus();
	        return entities.stream()
	                       .map(mapper::toDto)
	                       .collect(Collectors.toList());
	}

	@Override
	public List<ExamRespDto> getAllActiveExams() {
		 List<ExamEntity> entities = examRepository.findAllActiveStatus();
	        return entities.stream()
	                       .map(mapper::toDto)
	                       .collect(Collectors.toList());
	}

}
