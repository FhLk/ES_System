package com.example.es_system.DTO;

import com.example.es_system.Entities.Subject;
import lombok.*;

import javax.persistence.Column;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class GetAttendance {
    private Integer IdStudent;

    private Subject subject;

    private Integer onTime;

    private Integer late;

    private Integer leave;

    private Integer absent;
}
