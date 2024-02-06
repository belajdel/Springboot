package com.example.demo.student;

public class StudentControllerBuilder {
    private StudentService studentService;

    public StudentControllerBuilder setStudentService(StudentService studentService) {
        this.studentService = studentService;
        return this;
    }

    public StudentController createStudentController() {
        return new StudentController(studentService);
    }
}