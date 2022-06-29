package com.example.es_system.Repositories;

import com.example.es_system.Entities.Attendance;
import com.example.es_system.Entities.AttendanceId;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AttendanceRepository extends JpaRepository<Attendance,AttendanceId> {

    List<Attendance> findByIdStudent(Integer id);

    List<Attendance> findByIdSubject(String id);
//    List<Attendance> findAllByIdSubject(String id);
}
