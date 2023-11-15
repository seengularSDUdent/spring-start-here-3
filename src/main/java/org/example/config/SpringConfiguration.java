package org.example.config;


import org.example.main.Mug;
import org.example.main.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.example.main")
public class SpringConfiguration {

//    @Bean
//    Person person(Mug mug){
//        Person beanPerson = new Person();
//        beanPerson.setName("Kuralai");
//        beanPerson.setMug(mug);
//        return beanPerson;
//    }

    @Bean(name = "kuralaimug")
    Mug mug(){
        Mug beanMug = new Mug();
        beanMug.setName("Kuralai's Mug");
        return beanMug;
    }

    @Bean(value = "armanmug")
    Mug mug1(){
        Mug beanMug = new Mug();
        beanMug.setName("Arman's Mug");
        return beanMug;
    }
}
