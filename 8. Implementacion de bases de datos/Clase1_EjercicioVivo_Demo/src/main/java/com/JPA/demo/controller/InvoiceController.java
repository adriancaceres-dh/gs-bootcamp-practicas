package com.JPA.demo.controller;

import com.JPA.demo.dto.InvoiceDTO;
import com.JPA.demo.dto.MessageDTO;
import com.JPA.demo.dto.ProductDTO;
import com.JPA.demo.service.InvoiceService;
import com.JPA.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("invoice")
public class InvoiceController {

    @Autowired
    private InvoiceService invoiceService;

    @PostMapping("/")
    public ResponseEntity<InvoiceDTO> create(@RequestBody InvoiceDTO invoiceDTO){
        return ResponseEntity.ok(invoiceService.saveEntity(invoiceDTO));
    }

    @GetMapping("/")
    public ResponseEntity<List<InvoiceDTO>> getAll(){
        return ResponseEntity.ok(invoiceService.getAllEntities());
    }

    @GetMapping("/{id}")
    public ResponseEntity<InvoiceDTO> getById(@PathVariable Integer id){
        return ResponseEntity.ok(invoiceService.getEntityById(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<MessageDTO> deleteById(@PathVariable Integer id){
        return ResponseEntity.ok(invoiceService.deleteEntity(id));
    }

    @GetMapping("/findByYear/{year}")
    public ResponseEntity<List<InvoiceDTO>> findByYear(@PathVariable Integer year){
        return ResponseEntity.ok(invoiceService.findByYear(year));
    }

/*    @GetMapping("/findByCategory/{category}")
    public ResponseEntity<List<InvoiceDTO>> findByYear(@PathVariable String category){
        return ResponseEntity.ok(invoiceService.findByCategory(category));
    }*/

    @GetMapping("/getIdWithCount")
    public ResponseEntity<List<Map<String,Integer>>> getIdWithCount(){
        return ResponseEntity.ok(invoiceService.getIdWithCount());
    }

    @GetMapping("/findInvoiceWithProduct/{producto}")
    public ResponseEntity<List<InvoiceDTO>>listInvoiceWithProduct(@PathVariable String producto){
        return ResponseEntity.ok(invoiceService.listInvoiceWithProduct(producto));
    }

}
