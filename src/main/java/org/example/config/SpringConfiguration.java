package org.example.config;


import org.example.main.Mug;
import org.example.main.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfiguration {

    @Bean
    Person person(){
        Person beanPerson = new Person();
        beanPerson.setName("Kuralai");
        return beanPerson;
    }

    @Bean
    Mug mug(){
        Mug beanMug = new Mug();
        beanMug.setName("Kuralai's Mug");
        return beanMug;
    }
}