package com.example.es_system.Service;

import com.example.es_system.DTO.GetTeacherDTO;
import com.example.es_system.Entities.Teacher;
import com.example.es_system.Repositories.TeacherRepository;
import com.example.es_system.Utils.ListMapper;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class TeacherService {

    @Autowired
    private TeacherRepository repository;

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private ListMapper listMapper;

    public List<GetTeacherDTO> getAllTeacher(){
        List<Teacher> teacherList = repository.findAll();
        return listMapper.mapList(teacherList,GetTeacherDTO.class,modelMapper);
    }

    public GetTeacherDTO getTeacher(Integer id){
        Teacher teacher =repository.findById(id)
                .orElseThrow(()->new ResponseStatusException(
                        HttpStatus.NOT_FOUND,"Teacher id"+ id +" Does Not Exist !!!"
                ));
        return modelMapper.map(teacher,GetTeacherDTO.class);
    }
}
