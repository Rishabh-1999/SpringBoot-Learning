package com.example1.demo1.student;

import org.apache.tomcat.jni.Local;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository
    ) {
        return  agrs -> {
            Student rishabh = new Student("Rishabh","rishabh@gmail.com", LocalDate.of(2000, Month.FEBRUARY,19));
            Student hero = new Student("hero","hero@gmail.com", LocalDate.of(1995, Month.FEBRUARY,19));

                    repository.saveAll(List.of(rishabh,hero));
        };
    }

}
