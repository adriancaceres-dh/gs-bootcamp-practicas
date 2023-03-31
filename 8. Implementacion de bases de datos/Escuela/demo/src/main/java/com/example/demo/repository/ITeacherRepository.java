package com.example.demo.repository;

import com.example.demo.entity.teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITeacherRepository extends JpaRepository<teacher,Integer> {
}
