package com.example.es_system.DTO;

import com.example.es_system.Entities.Student;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class GetStudentDTO {
    private Integer id;
    private String firstName;
    private String lastName;
    private Integer classNumber;
    private Integer room;
}
