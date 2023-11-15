package org.example.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {
    private String name;

    private final Mug mug;

    @Autowired
    public Person(@Qualifier("armanmug") Mug mug) {
        this.mug = mug;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

//    public void setMug(Mug mug){
//        this.mug = mug;
//    }

    public Mug getMug(){
        return this.mug;
    }
}
