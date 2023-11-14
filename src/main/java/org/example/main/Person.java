package org.example.main;

public class Person {
    private String name;
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
