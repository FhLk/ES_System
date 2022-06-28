package com.example.es_system.Controller;

import com.example.es_system.DTO.GetStudentDTO;
import com.example.es_system.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/students")
public class StudentController {
    @Autowired
    private StudentService service;

    @GetMapping("")
    public ResponseEntity<List<GetStudentDTO>> getAllStudent(){
        return ResponseEntity.ok(service.getAllStudent());
    }

    @GetMapping("/{studentId}")
    public ResponseEntity<GetStudentDTO> getStudent(@PathVariable Integer studentId){
        return ResponseEntity.ok(service.getStudent(studentId));
    }
}
