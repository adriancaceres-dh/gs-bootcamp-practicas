package com.JPA.demo.controller;

import com.JPA.demo.dto.ClientDTO;
import com.JPA.demo.dto.MessageDTO;
import com.JPA.demo.dto.PersonDTO;
import com.JPA.demo.dto.ProductDTO;
import com.JPA.demo.service.ClientService;
import com.JPA.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("client")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @PostMapping("/")
    public ResponseEntity<ClientDTO> create(@RequestBody ClientDTO clientDTO){
        return ResponseEntity.ok(clientService.saveEntity(clientDTO));
    }

    @GetMapping("/")
    public ResponseEntity<List<ClientDTO>> getAll(){
        return ResponseEntity.ok(clientService.getAllEntities());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ClientDTO> getById(@PathVariable Integer id){
        return ResponseEntity.ok(clientService.getEntityById(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<MessageDTO> deleteById(@PathVariable Integer id){
        return ResponseEntity.ok(clientService.deleteEntity(id));
    }

    /*@GetMapping("/findByAgesHQL")
    public ResponseEntity<List<ClientDTO>> findByAgesHQL(@RequestParam Integer year1,
                                                         @RequestParam Integer year2){
        return ResponseEntity.ok(clientService.findByAgesHQL(year1,year2));
    }*/
    @GetMapping("/listClientWithInvoices")
    public ResponseEntity<List<Map<String,String>>> listClientWithInvoices(){
        return ResponseEntity.ok(clientService.listClientWithInvoices());
    }


}
