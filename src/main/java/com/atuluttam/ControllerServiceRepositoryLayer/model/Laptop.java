package com.atuluttam.ControllerServiceRepositoryLayer.model;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer{

    @Override
    public void code() {
        System.out.println("coding in Laptop");
    }
}
