package com.example.demo.student;
import java.time.LocalDate;

public class Student {

    private long id;
    private String name;
    private String email;
    private LocalDate dof;
    private Integer age;

    public Student(long id,
                   String name,
                   String email,
                   LocalDate dof,
                   Integer age) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.dof = dof;
        this.age = age;
    }

    public Student(String name,
                   String email,
                   LocalDate dof,
                   Integer age) {
        this.name = name;
        this.email = email;
        this.dof = dof;
        this.age = age;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getDof() {
        return dof;
    }

    public Integer getAge() {
        return age;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDof(LocalDate dof) {
        this.dof = dof;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", dof=" + dof +
                ", age=" + age +
                '}';
    }
}
