CREATE TABLE questions (
    question_id INT PRIMARY KEY AUTO_INCREMENT,
    question_text VARCHAR(255),
    optionA VARCHAR(100),
    optionB VARCHAR(100),
    optionC VARCHAR(100),
    optionD VARCHAR(100),
    correct_answer VARCHAR(50),
    exam_id INT NOT NULL,
    CONSTRAINT fk_exam FOREIGN KEY (exam_id) REFERENCES exam_entity(exam_id)
);