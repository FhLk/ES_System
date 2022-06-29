package com.example.es_system.DTO;

import com.example.es_system.Entities.Student;
import com.example.es_system.Entities.Subject;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class GetAttendanceDTO {
    private GetIdStudent IdStudent;

    private GetIdSubject IdSubject;

    private Integer onTime;

    private Integer late;

    private Integer leave;

    private Integer absent;
}
