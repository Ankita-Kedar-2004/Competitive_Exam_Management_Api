package com.competitive_exam_management.Dao;

import java.awt.print.Pageable;
import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.competitive_exam_management.DTO.QuestionsDto;
import com.competitive_exam_management.DTO.QuestionsRespDto;
import com.competitive_exam_management.Entity.ExamEntity;
import com.competitive_exam_management.Entity.QuestionsEntity;;

@Repository
public interface QuestionsRepository extends JpaRepository<QuestionsEntity, Integer>{

	@Query(value = "SELECT * FROM questions WHERE exam_id = :examId ORDER BY RAND() LIMIT :count", nativeQuery = true)
    List<QuestionsEntity> findRandomQuestionsByExam(@Param("examId") int examId, @Param("count") int count);
    

	@Query("SELECT q.correctAnswer FROM QuestionsEntity q WHERE q.questionId = :questionId")
    String findCorrectAnswerById(@Param("questionId") int  questionId);


    @Query("SELECT q FROM QuestionsEntity q WHERE q.questionId IN :questionIds")
    List<QuestionsEntity> findQuestionsByIds(@Param("questionIds") List<Integer> questionIds);
}
