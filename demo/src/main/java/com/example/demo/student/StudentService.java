package com.example.demo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {
    public List<Student> getStudent(){
        //jason
        return List.of(new Student(
                1L,
                "osama",
                "osama@gmail.com",
                LocalDate.of(2001, Month.NOVEMBER, 6),
                20
        ));
    }
}
