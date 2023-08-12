package com.soshaw.studentdemo.repo;

import com.soshaw.studentdemo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student,Integer> {
    void deleteById(int id);
}
