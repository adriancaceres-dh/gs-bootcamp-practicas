package com.glubits.employees.controller;

import com.glubits.employees.dto.CrudDTO;
import com.glubits.employees.dto.EmployeeDTO;
import com.glubits.employees.entity.Employee;
import com.glubits.employees.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("employee")
public class EmployeeController {

    @Autowired
    IEmployeeService employeeService;

    @PostMapping("/save")
    public ResponseEntity<CrudDTO> saveEmployee(@RequestBody EmployeeDTO dto){
        return ResponseEntity.ok(employeeService.saveEmployee(dto));
    }

    @GetMapping("/get")
    public ResponseEntity<List<EmployeeDTO>>  listAllEmployees(){
        return ResponseEntity.ok(employeeService.listAllEmployees());
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<EmployeeDTO>  findOneEmployee(@PathVariable Integer id){
        return ResponseEntity.ok(employeeService.findOneEmployee(id));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<CrudDTO>  deleteEmployee(@PathVariable Integer id){
        return ResponseEntity.ok(employeeService.deleteEmployee(id));
    }

    @GetMapping("/get/byName/{name}")
    public ResponseEntity<List<EmployeeDTO>> findByName(@PathVariable String name){
        return ResponseEntity.ok(employeeService.findByName(name));
    }
}
