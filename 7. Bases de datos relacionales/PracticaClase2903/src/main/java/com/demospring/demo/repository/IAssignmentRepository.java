package com.demospring.demo.repository;

import com.demospring.demo.entity.Assignment;
import org.hibernate.sql.Select;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface IAssignmentRepository extends JpaRepository<Assignment, Integer> {

}
