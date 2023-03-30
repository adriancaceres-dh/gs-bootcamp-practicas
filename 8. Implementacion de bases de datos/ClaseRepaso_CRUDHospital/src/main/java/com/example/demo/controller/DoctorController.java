package com.example.demo.controller;

import com.example.demo.dto.DoctorDTO;
import com.example.demo.dto.MessageDTO;
import com.example.demo.service.classes.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("doctor")
public class DoctorController {

    @Autowired
    DoctorService doctorService;

    @PostMapping("/crear")
    public ResponseEntity<DoctorDTO> crear(@RequestBody DoctorDTO doctor){
        return ResponseEntity.ok(
                doctorService.saveEntity(doctor)
        );
    }

    @GetMapping("/")
    public ResponseEntity<List<DoctorDTO>> listar(){
        return ResponseEntity.ok(
                doctorService.getAllEntities()
        );
    }

    @GetMapping("/{id}")
    public ResponseEntity<DoctorDTO> buscarPorId(@PathVariable Integer id){
        return ResponseEntity.ok(
                doctorService.getEntityById(id)
        );
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<MessageDTO> eliminar(@PathVariable Integer id){
        return ResponseEntity.ok(
                doctorService.deleteEntity(id)
        );
    }

}
