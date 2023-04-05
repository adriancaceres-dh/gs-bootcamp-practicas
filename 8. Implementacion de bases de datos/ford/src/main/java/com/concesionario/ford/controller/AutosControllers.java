package com.concesionario.ford.controller;

import com.concesionario.ford.dto.AutoDTO;
import com.concesionario.ford.dto.MessageDTO;
import com.concesionario.ford.service.classes.AutoService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("autos")
public class AutosControllers {

    @Autowired
    AutoService autoService;

    @PostMapping("/create")
    public ResponseEntity<AutoDTO> create (@RequestBody AutoDTO dto){
        return ResponseEntity.ok(
                autoService.saveEntity(dto)
        );
    }

    @GetMapping("/")
    public ResponseEntity<List<AutoDTO>> findAll(){
        return ResponseEntity.ok(
                autoService.getAllEntities()
        );
    }

    @GetMapping("/{id}")
    public ResponseEntity<AutoDTO> findById(@PathVariable Integer id){
        return ResponseEntity.ok(
                autoService.getEntityById(id)
        );
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<MessageDTO> deleteById(@PathVariable Integer id){
        return ResponseEntity.ok(
                autoService.deleteEntity(id)
        );
    }
}
