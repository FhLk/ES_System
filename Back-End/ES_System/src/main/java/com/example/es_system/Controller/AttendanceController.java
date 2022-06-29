package com.example.es_system.Controller;

import com.example.es_system.DTO.GetAttendanceDTO;
import com.example.es_system.DTO.GetIdSubject;
import com.example.es_system.Entities.Attendance;
import com.example.es_system.Service.AttendanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/attendances")
public class AttendanceController {
    @Autowired
    private AttendanceService service;

    @GetMapping("/{id}")
    public ResponseEntity<List<Attendance>> getAttendance(@PathVariable String id){
        return ResponseEntity.ok(service.getAllStudentsBySubject(id));
    }
}
