package com.example.demo.repository;

import com.example.demo.entity.project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProjectRepository extends JpaRepository<project, Integer> {
}
