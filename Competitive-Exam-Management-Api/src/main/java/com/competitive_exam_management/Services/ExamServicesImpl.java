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
	public List<ExamRespDto> getAllExamName() {
		 List<ExamEntity> entities = examRepository.findAll();
	        return entities.stream()
	                       .map(mapper::toDto)
	                       .collect(Collectors.toList());
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
		examRepository.save(student);
		    return true;
	}

}
