package com.example.es_system.Service;

import com.example.es_system.DTO.GetStudentDTO;
import com.example.es_system.Entities.Student;
import com.example.es_system.Repositories.StudentRepository;
import com.example.es_system.Utils.ListMapper;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class StudentService {
    @Autowired private StudentRepository repository;
    @Autowired
    private ModelMapper modelMapper;
    @Autowired private ListMapper listMapper;

    public List<GetStudentDTO> getAllStudent(){
        List<Student> studentList = repository.findAll();
        return listMapper.mapList(studentList,GetStudentDTO.class,modelMapper);
    }

    public GetStudentDTO getStudent(Integer id){
        Student student =repository.findById(id)
                .orElseThrow(()->new ResponseStatusException(
                        HttpStatus.NOT_FOUND,"Student id"+ id +" Does Not Exist !!!"
                ));
        return modelMapper.map(student,GetStudentDTO.class);
    }
}
