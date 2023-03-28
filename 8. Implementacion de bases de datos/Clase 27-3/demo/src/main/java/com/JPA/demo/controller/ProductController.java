package com.JPA.demo.controller;

import com.JPA.demo.dto.ClientDTO;
import com.JPA.demo.dto.MessageDTO;
import com.JPA.demo.dto.PersonDTO;
import com.JPA.demo.dto.ProductDTO;
import com.JPA.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/")
    public ResponseEntity<ProductDTO> create(@RequestBody ProductDTO productDTO){
        return ResponseEntity.ok(productService.saveEntity(productDTO));
    }

    @GetMapping("/")
    public ResponseEntity<List<ProductDTO>> getAll(){
        return ResponseEntity.ok(productService.getAllEntities());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductDTO> getById(@PathVariable Integer id){
        return ResponseEntity.ok(productService.getEntityById(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<MessageDTO> deleteById(@PathVariable Integer id){
        return ResponseEntity.ok(productService.deleteEntity(id));
    }
/*
    @GetMapping("/getByNameProduct/{name}")
    public ResponseEntity<List<ProductDTO>> findByName(@RequestParam(required = false) String name ){
        return ResponseEntity.ok(productService.findByName(name));
    }

    @GetMapping("/getByDescription/{description}")
    public ResponseEntity<List<ProductDTO>> findByDescription(@PathVariable String description ){
        return ResponseEntity.ok(productService.findByDescription(description));
    }

 */
}
