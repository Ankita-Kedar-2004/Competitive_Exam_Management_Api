package com.competitive_exam_management.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResultRespDto {
private int result_id;
private int user_id;
private int exam_id;
private int score;
private int total;
}
