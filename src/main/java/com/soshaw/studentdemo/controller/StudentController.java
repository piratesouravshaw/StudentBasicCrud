package com.soshaw.studentdemo.controller;

import com.soshaw.studentdemo.entity.Student;
import com.soshaw.studentdemo.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    StudentRepo studentRepo;
    @GetMapping("/all")
    public List<Student> getAllStudents(){
        return (List<Student>)this.studentRepo.findAll();
    }
    @PostMapping("/create/")
    public void createStudent(@RequestBody Student stud){
        this.studentRepo.save(stud);
    }
    @PutMapping("/update")
    public Student updateStudent(@RequestBody Student student){
        return this.studentRepo.save(student);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteStudent(@PathVariable int id){
        this.studentRepo.deleteById(id);
    }
}
