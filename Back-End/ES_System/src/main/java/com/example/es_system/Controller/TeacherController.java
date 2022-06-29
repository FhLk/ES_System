package com.example.es_system.Controller;

import com.example.es_system.DTO.GetStudentDTO;
import com.example.es_system.DTO.GetTeacherDTO;
import com.example.es_system.Service.StudentService;
import com.example.es_system.Service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/teachers")
public class TeacherController {
    @Autowired
    private TeacherService service;

    @GetMapping("")
    public ResponseEntity<List<GetTeacherDTO>> getAllStudent(){
        return ResponseEntity.ok(service.getAllTeacher());
    }

    @GetMapping("/{teacherId}")
    public ResponseEntity<GetTeacherDTO> getStudent(@PathVariable Integer teacherId){
        return ResponseEntity.ok(service.getTeacher(teacherId));
    }
}
