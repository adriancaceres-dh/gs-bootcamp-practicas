package com.glubits.repasoJPA.controller;

import com.glubits.repasoJPA.dto.DuenioDTO;
import com.glubits.repasoJPA.dto.MascotaDTO;
import com.glubits.repasoJPA.dto.MessageDTO;
import com.glubits.repasoJPA.dto.VeterinarioDTO;
import com.glubits.repasoJPA.service.classes.MascotaService;
import com.glubits.repasoJPA.service.classes.VeterinarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("mascota")
public class MascotaController {

    @Autowired
    MascotaService mascotaService;

    @PostMapping("/create")
    public ResponseEntity<MascotaDTO> create(@RequestBody MascotaDTO dto){
        return ResponseEntity.ok(
                mascotaService.saveEntity(dto)
        );
    }

    @GetMapping("/")
    public ResponseEntity<List<MascotaDTO>> findAll(){
        return ResponseEntity.ok(
                mascotaService.getAllEntities()
        );
    }

    @GetMapping("/{id}")
    public ResponseEntity<MascotaDTO> findById(@PathVariable Integer id){
        return ResponseEntity.ok(
                mascotaService.getEntityById(id)
        );
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<MessageDTO> deleteById(@PathVariable Integer id){
        return ResponseEntity.ok(
                mascotaService.deleteEntity(id)
        );
    }
}
