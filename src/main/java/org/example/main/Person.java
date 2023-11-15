package org.example.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
    private String name;

    @Autowired
    private Mug mug;

    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setMug(Mug mug){
        this.mug = mug;
    }

    public Mug getMug(){
        return this.mug;
    }
}
