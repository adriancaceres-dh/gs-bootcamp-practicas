package com.glubits.repasoJPA.controller;

import com.glubits.repasoJPA.dto.DuenioDTO;
import com.glubits.repasoJPA.dto.MessageDTO;
import com.glubits.repasoJPA.dto.VeterinarioDTO;
import com.glubits.repasoJPA.service.classes.DuenioService;
import com.glubits.repasoJPA.service.classes.VeterinarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("veterinario")
public class VeterinarioController {

    @Autowired
    VeterinarioService veterinarioService;

    @PostMapping("/create")
    public ResponseEntity<VeterinarioDTO> create(@RequestBody VeterinarioDTO dto){
        return ResponseEntity.ok(
                veterinarioService.saveEntity(dto)
        );
    }

    @GetMapping("/")
    public ResponseEntity<List<VeterinarioDTO>> findAll(){
        return ResponseEntity.ok(
                veterinarioService.getAllEntities()
        );
    }

    @GetMapping("/{id}")
    public ResponseEntity<VeterinarioDTO> findById(@PathVariable Integer id){
        return ResponseEntity.ok(
                veterinarioService.getEntityById(id)
        );
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<MessageDTO> deleteById(@PathVariable Integer id){
        return ResponseEntity.ok(
                veterinarioService.deleteEntity(id)
        );
    }
}
