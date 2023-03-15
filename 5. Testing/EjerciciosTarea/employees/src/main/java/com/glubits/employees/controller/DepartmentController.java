package com.glubits.employees.controller;

import com.glubits.employees.dto.CrudDTO;
import com.glubits.employees.dto.DepartmentDTO;
import com.glubits.employees.dto.EmployeeDTO;
import com.glubits.employees.entity.Employee;
import com.glubits.employees.service.IDepartmentService;
import com.glubits.employees.service.IEmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("department")
public class DepartmentController {

   @Autowired
    IDepartmentService departmentService;

    @PostMapping("/save")
    public ResponseEntity<CrudDTO> saveDepartment(@RequestBody DepartmentDTO dto){
        return ResponseEntity.ok(departmentService.saveDepartment(dto));
    }

    @GetMapping("/get")
    public ResponseEntity<List<DepartmentDTO>>  listAllDepartments(){
        return ResponseEntity.ok(departmentService.listAllDeparments());
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<DepartmentDTO>  findOneDepartments(@PathVariable Integer id){
        return ResponseEntity.ok(departmentService.findOneDeparment(id));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<CrudDTO>  deleteDepartments(@PathVariable Integer id){
        return ResponseEntity.ok(departmentService.deleteDeparment(id));
    }

    @GetMapping("/get/byName/{name}")
    public ResponseEntity<List<DepartmentDTO>> findByName(@PathVariable String name){
        return ResponseEntity.ok(departmentService.findByName(name));
    }

    @GetMapping("/get/bySize/{size}")
    public ResponseEntity<List<DepartmentDTO>> findBySize(@PathVariable Integer size){
        return ResponseEntity.ok(departmentService.findByDepartmentSize(size));
    }
}
