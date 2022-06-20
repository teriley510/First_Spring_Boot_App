package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {

    @Bean
     CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student Tim = new Student("Timothy Riley", LocalDate.of(1981, DECEMBER,
                    28), "teriley138@gmail.com");

            Student John = new Student ("John Hampton", LocalDate.of(2000, AUGUST, 12),
                    "johnny@gmail.com");



            repository.saveAll( List.of(Tim, John));
        };


    }
}
