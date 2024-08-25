package com.atuluttam.ControllerServiceRepositoryLayer.repository;

import com.atuluttam.ControllerServiceRepositoryLayer.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class studentRepository {

    @Autowired
    private Student st;
    public void save(Student st)
    {
        System.out.println("Student info is saved in database");
    }
}
