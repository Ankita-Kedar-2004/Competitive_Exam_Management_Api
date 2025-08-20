package com.competitive_exam_management.Services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Pageable; // ✅ Correct one


import com.competitive_exam_management.DTO.ExamDto;
import com.competitive_exam_management.DTO.ExamRespDto;
import com.competitive_exam_management.DTO.QuestionsDto;
import com.competitive_exam_management.DTO.QuestionsRespDto;
import com.competitive_exam_management.Dao.ExamRepository;
import com.competitive_exam_management.Dao.QuestionsRepository;
import com.competitive_exam_management.Entity.ExamEntity;
import com.competitive_exam_management.Entity.QuestionsEntity;
import com.competitive_exam_management.Entity.UserEntity;
import com.competitive_exam_management.Interface.QuestionsInterface;
import com.competitive_exam_management.Mapper.ExamMapper;
import com.competitive_exam_management.Mapper.QuestionsMapper;

@Service
public class QuestionsServicesImpl  implements QuestionsInterface{
	@Autowired
	ExamRepository examRepository;
	
	@Autowired
	 QuestionsRepository questionsRepository;
	
	@Autowired
	QuestionsMapper mapper;
	
	@Override
	public boolean registerQuestions(QuestionsDto questionsDto) {
		Optional<ExamEntity> optionalExam = examRepository.findById(questionsDto.getExamId());
	    if (optionalExam.isEmpty()) {
	        return false; 
	    }
	
		ExamEntity exam = optionalExam.get();
		UserEntity userId = new UserEntity();
		userId.setId(questionsDto.getUserId());
		QuestionsEntity question = mapper.toEntity(questionsDto, exam,userId);
		QuestionsEntity result =   questionsRepository.save(question);
		    return true;
	}

	@Override
	public List<QuestionsRespDto> getAll() {
		 List<QuestionsEntity> entities = questionsRepository.findAll();
	        return entities.stream()
	                       .map(mapper::toDto)
	                       .collect(Collectors.toList());
	}

	@Override
	public QuestionsRespDto getDataById(int id) {
		Optional<QuestionsEntity> data=questionsRepository.findById(id);
		  if(data.isPresent()) {
			  QuestionsEntity exam=data.get();
			return  mapper.toDto(exam);
		  }
		return null;
	}

	@Override
	public QuestionsRespDto questionsUpdate(QuestionsDto questionsDto) {
		  Optional<QuestionsEntity> optionalQ = questionsRepository.findById(questionsDto.getQuestionId());
		    if (optionalQ.isEmpty()) {
		        return null; 
		    }

		    QuestionsEntity oldEntity = optionalQ.get();
		    ExamEntity exam = oldEntity.getExam(); 
		    UserEntity user = oldEntity.getUserId();

		    QuestionsEntity updated = mapper.toEntity(questionsDto, exam, user);
		    QuestionsEntity saved = questionsRepository.save(updated);

		    
		    return mapper.toDto(saved);
	}

	@Override
	public boolean deletedatabyid(int id) {
		 if (questionsRepository.existsById(id)) {
		        questionsRepository.deleteById(id); 
		        return true; }
		return false;
	}
	
	


}
