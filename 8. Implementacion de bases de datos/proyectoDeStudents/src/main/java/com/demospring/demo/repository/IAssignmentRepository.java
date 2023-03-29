package com.demospring.demo.repository;

import com.demospring.demo.entity.Assignment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAssignmentRepository extends JpaRepository<Assignment, Integer> {
}
