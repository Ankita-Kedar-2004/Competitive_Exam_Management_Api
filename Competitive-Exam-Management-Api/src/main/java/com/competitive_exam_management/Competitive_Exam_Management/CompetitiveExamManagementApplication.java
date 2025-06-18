package com.competitive_exam_management.Competitive_Exam_Management;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "com.competitive_exam_management")
@EnableJpaRepositories(basePackages = "com.competitive_exam_management.Dao")
@EntityScan(basePackages = "com.competitive_exam_management.Entity")

public class CompetitiveExamManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(CompetitiveExamManagementApplication.class, args);
	}

}
