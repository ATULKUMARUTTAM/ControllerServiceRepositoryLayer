package com.atuluttam.ControllerServiceRepositoryLayer.Service;

import com.atuluttam.ControllerServiceRepositoryLayer.model.Student;
import com.atuluttam.ControllerServiceRepositoryLayer.repository.studentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class studentService {

    @Autowired
    Student st;

    @Autowired
    private studentRepository sr;

    public void addStudent(Student st){
        sr.save(st);
        //System.out.println("Student added");
    }
}
