package com.glubits.repasoJPA.controller;

import com.glubits.repasoJPA.dto.DuenioDTO;
import com.glubits.repasoJPA.dto.MessageDTO;
import com.glubits.repasoJPA.service.classes.DuenioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("duenio")
public class DuenioController {

    @Autowired
    DuenioService duenioService;

    @PostMapping("/create")
    public ResponseEntity<DuenioDTO> create(@RequestBody DuenioDTO dto){
        return ResponseEntity.ok(
                duenioService.saveEntity(dto)
        );
    }

    @GetMapping("/")
    public ResponseEntity<List<DuenioDTO>> findAll(){
        return ResponseEntity.ok(
                duenioService.getAllEntities()
        );
    }

    @GetMapping("/{id}")
    public ResponseEntity<DuenioDTO> findById(@PathVariable Integer id){
        return ResponseEntity.ok(
                duenioService.getEntityById(id)
        );
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<MessageDTO> deleteById(@PathVariable Integer id){
        return ResponseEntity.ok(
                duenioService.deleteEntity(id)
        );
    }
}
