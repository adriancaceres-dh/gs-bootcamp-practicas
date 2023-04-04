package com.demospring.demo.controller;

import com.demospring.demo.dto.AssignmentDTO;
import com.demospring.demo.dto.MessageDTO;
import com.demospring.demo.dto.StudentDTO;
import com.demospring.demo.service.classes.AssignamentService;
import com.demospring.demo.service.classes.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("assignment")
public class AssignmentController {
    @Autowired
    private AssignamentService assignamentService;

    @PostMapping("/create")
    public ResponseEntity<AssignmentDTO> create(@RequestBody AssignmentDTO assignmentDTO){
        return ResponseEntity.ok(assignamentService.saveEntity(assignmentDTO));
    }

    @GetMapping("/all")
    public ResponseEntity<List<AssignmentDTO>> getAll(){
        return ResponseEntity.ok(assignamentService.getAllEntities());
    }

    @GetMapping("/create/{id}")
    public ResponseEntity<AssignmentDTO> getById(@PathVariable Integer id){
        return ResponseEntity.ok(assignamentService.getEntityById(id));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<MessageDTO> deleteById(@PathVariable Integer id){
        return ResponseEntity.ok(assignamentService.deleteEntity(id));
    }
}
