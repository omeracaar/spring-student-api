package com.omeracar.services;

import com.omeracar.dto.DtoStudent;
import com.omeracar.dto.DtoStudentIU;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IStudentService {

    public DtoStudent saveStudent(DtoStudentIU student);

    public List<DtoStudent> getAllStudents();

    public DtoStudent getStudentById(Integer id);

    public void deleteStudent(Integer id);

    public DtoStudent updateStudent(Integer id,DtoStudentIU dtoStudentIU);

}
