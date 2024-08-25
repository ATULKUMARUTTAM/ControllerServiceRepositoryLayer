package com.atuluttam.ControllerServiceRepositoryLayer.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {

    private int id;
    private String Name;
    private String course;
    private Computer c1;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public Computer getC1() {
        return c1;
    }

    @Autowired
    public void setC1(Computer c1) {
        this.c1 = c1;
    }


    public void doAssignment()
    {
        c1.code();
    }
}
