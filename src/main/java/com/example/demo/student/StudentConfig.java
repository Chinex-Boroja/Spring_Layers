package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.util.Calendar.FEBRUARY;
import static java.util.Calendar.JANUARY;


@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student chisom = new Student(
                    "Chisom",
                    "okafor.chisom@gmail.com",
                    LocalDate.of(2002, 1, 28)
            );

            Student felix = new Student(
                    "Felix",
                    "Felix.Man@gmail.com",
                    LocalDate.of(2000, 2, 28)
            );

            repository.saveAll(
                    List.of(chisom, felix)
            );
        };
    }
}
