package com.example.es_system.DTO;

import com.example.es_system.Entities.Subject;
import com.example.es_system.Entities.Teacher;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class GetTeacherDTO {
    private Integer id;
    private Teacher teacher;
    public String getName(){
        return teacher.getFirstName()+" "+ teacher.getLastName();
    }

    private Subject subject;
}
