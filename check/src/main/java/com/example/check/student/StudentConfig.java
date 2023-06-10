package com.example.check.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
          Student johnDoe = new Student(
                        "John Doe",
                        "john.doe@us.com",
                        LocalDate.of(2000, Month.JANUARY, 1));

            Student janeDoe = new Student(
                    "Jane Doe",
                    "jane.doe@us.com",
                    LocalDate.of(2002, Month.JANUARY, 1));

            repository.saveAll(
                    List.of(johnDoe, janeDoe)
            );

        };
    }
}
