package com.example.es_system.Service;

import com.example.es_system.DTO.GetAttendanceDTO;
import com.example.es_system.DTO.GetIdSubject;
import com.example.es_system.Entities.Attendance;
import com.example.es_system.Repositories.AttendanceRepository;
import com.example.es_system.Utils.ListMapper;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AttendanceService {
    @Autowired
    private AttendanceRepository repository;

    @Autowired
    private ModelMapper modelMapper;

    @Autowired private ListMapper listMapper;

    public List<Attendance> getAllStudentsBySubject(String id){
        List<Attendance> attendance=repository.findByIdSubject(id);
        return attendance;
//        return listMapper.mapList(attendance, GetAttendanceDTO.class,modelMapper);
    }


}
