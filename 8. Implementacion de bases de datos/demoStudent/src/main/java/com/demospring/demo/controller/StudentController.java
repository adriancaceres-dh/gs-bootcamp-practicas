package com.demospring.demo.controller;

import com.demospring.demo.dto.MessageDTO;
import com.demospring.demo.dto.StudentDTO;
import com.demospring.demo.service.classes.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/")
    public ResponseEntity<StudentDTO> create(@RequestBody StudentDTO studentDTO){
        return ResponseEntity.ok(studentService.saveEntity(studentDTO));
    }

    @GetMapping("/")
    public ResponseEntity<List<StudentDTO>> getAll(){
        return ResponseEntity.ok(studentService.getAllEntities());
    }

    @GetMapping("/{id}")
    public ResponseEntity<StudentDTO> getById(@PathVariable Integer id){
        return ResponseEntity.ok(studentService.getEntityById(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<MessageDTO> deleteById(@PathVariable Integer id){
        return ResponseEntity.ok(studentService.deleteEntity(id));
    }
}
