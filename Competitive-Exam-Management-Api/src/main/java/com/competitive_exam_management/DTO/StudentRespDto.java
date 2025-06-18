package com.competitive_exam_management.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentRespDto {
    private String name;
    private String email;
    private String qualification;
    private int passingYear;
    private String collegeName;
    private String contactNumber;
    private int examId;
    private int id;
}
