package com.example.demo.controller;

import com.example.demo.dto.DoctorDTO;
import com.example.demo.dto.MessageDTO;
import com.example.demo.dto.PacienteDTO;
import com.example.demo.service.classes.DoctorService;
import com.example.demo.service.classes.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("paciente")
public class PacienteController {

    @Autowired
    PacienteService pacienteService;

    @PostMapping("/crear")
    public ResponseEntity<PacienteDTO> crear(@RequestBody PacienteDTO paciente){
        return ResponseEntity.ok(
                pacienteService.saveEntity(paciente)
        );
    }

    @GetMapping("/")
    public ResponseEntity<List<PacienteDTO>> listar(){
        return ResponseEntity.ok(
                pacienteService.getAllEntities()
        );
    }

    @GetMapping("/{id}")
    public ResponseEntity<PacienteDTO> buscarPorId(@PathVariable Integer id){
        return ResponseEntity.ok(
                pacienteService.getEntityById(id)
        );
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<MessageDTO> eliminar(@PathVariable Integer id){
        return ResponseEntity.ok(
                pacienteService.deleteEntity(id)
        );
    }

}
