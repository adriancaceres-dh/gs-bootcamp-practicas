package com.demospring.demo.repository;

import com.demospring.demo.entity.Assignment;
import com.demospring.demo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IAssignmentRepository extends JpaRepository<Assignment, Integer> {
    List<Assignment> findBynameContaining(String name);
}
