package org.example.main;

import org.example.config.SpringConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);

        Person samplePerson = context.getBean(Person.class);
        System.out.println(samplePerson.getName());

        Mug sampleMug = context.getBean(Mug.class);
        System.out.println(sampleMug);

        System.out.println(samplePerson.getMug());

        samplePerson.setMug(sampleMug);
        System.out.println(samplePerson.getMug());
    }
}