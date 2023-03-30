package com.example.demo.controller;

import com.example.demo.dto.MessageDTO;
import com.example.demo.dto.PacienteDTO;
import com.example.demo.dto.TutorDTO;
import com.example.demo.service.classes.TutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("tutor")
public class TutorController {

    @Autowired
    TutorService tutorService;

    @PostMapping("/crear")
    public ResponseEntity<TutorDTO> crear(@RequestBody TutorDTO dto){
        return ResponseEntity.ok(tutorService.saveEntity(dto));
    }

    @GetMapping("/")
    public ResponseEntity<List<TutorDTO>> listar(){
        return ResponseEntity.ok(
                tutorService.getAllEntities()
        );
    }

    @GetMapping("/{id}")
    public ResponseEntity<TutorDTO> buscarPorId(@PathVariable Integer id){
        return ResponseEntity.ok(
                tutorService.getEntityById(id)
        );
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<MessageDTO> eliminar(@PathVariable Integer id){
        return ResponseEntity.ok(
                tutorService.deleteEntity(id)
        );
    }
}
