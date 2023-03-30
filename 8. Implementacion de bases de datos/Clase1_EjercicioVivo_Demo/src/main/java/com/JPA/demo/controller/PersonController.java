package com.JPA.demo.controller;

import com.JPA.demo.dto.MessageDTO;
import com.JPA.demo.dto.PersonDTO;
import com.JPA.demo.service.interfaces.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("person")
public class PersonController {

    @Autowired
    IPersonService personService;

    @PostMapping("/")
    public ResponseEntity<PersonDTO> create(@RequestBody PersonDTO personDTO){
        return ResponseEntity.ok(personService.saveEntity(personDTO));
    }

    @GetMapping("/")
    public ResponseEntity<List<PersonDTO>> getAll(){
        return ResponseEntity.ok(personService.getAllEntities());
    }

    @GetMapping("/{id}")
    public ResponseEntity<PersonDTO> getById(@PathVariable Integer id){
        return ResponseEntity.ok(personService.getEntityById(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<MessageDTO> deleteById(@PathVariable Integer id){
        return ResponseEntity.ok(personService.deleteEntity(id));
    }

    @GetMapping("/getName/{name}")
    public ResponseEntity<List<PersonDTO>> findByName(@PathVariable String name){
        return ResponseEntity.ok(personService.findByName(name));
    }

    @GetMapping("/getByAges")
    public ResponseEntity<List<PersonDTO>> findByAges(@RequestParam(required = false) Short desde,
                                                      @RequestParam(required = false) Short hasta){
        return ResponseEntity.ok(personService.findByAges(desde,hasta));
    }

    @GetMapping("/getByAgesAndSalary")
    public ResponseEntity<List<PersonDTO>> findByAgesAndSalary(@RequestParam(required = false) Short desde,
                                                               @RequestParam(required = false) Short hasta,
                                                               @RequestParam(required = false) Double salario){
        return ResponseEntity.ok(personService.findByAgesAndSalary(desde,hasta,salario));
    }

    @GetMapping("/orderByName")
    public ResponseEntity<List<PersonDTO>> orderByName(@RequestParam String order){
        return ResponseEntity.ok(personService.orderByName(order));
    }

    //EJERCICIOS HQL
    @GetMapping("/orderByNameHQL")
    public ResponseEntity<List<PersonDTO>> orderByNameHQL(){
        return ResponseEntity.ok(personService.orderByNameHQL());
    }

    @GetMapping("/findByAgesHQL")
    public ResponseEntity<List<PersonDTO>> findByAgesHQL(@RequestParam Integer year1,
                                                         @RequestParam Integer year2) {
        return ResponseEntity.ok(personService.findByAgesHQL(year1, year2));
    }
}
