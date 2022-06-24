package com.example.es_system.Repositories;

import com.example.es_system.Entities.Attendance;
import com.example.es_system.Entities.AttendanceId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AttendanceRepository extends JpaRepository<Attendance,AttendanceId> {
}
