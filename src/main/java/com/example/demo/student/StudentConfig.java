package com.example.demo.student;

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
                    Student veronica = new Student(
                            "veronica",
                            "verohchege40@gmail.com",
                            LocalDate.of(1999, Month.FEBRUARY, 20)
                    );

                    Student dru = new Student(
                            "andrew",
                            "andrew@gmail.com",
                            LocalDate.of(1998, Month.AUGUST, 9)
            );
                    repository.saveAll(
                            List.of(veronica, dru)
                    );
        };
    }
}
