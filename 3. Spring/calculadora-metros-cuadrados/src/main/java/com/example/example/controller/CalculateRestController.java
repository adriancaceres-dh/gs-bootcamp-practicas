package com.example.example.controller;

import com.example.example.dto.HouseResponseDTO;
import com.example.example.dto.HouseDTO;
import com.example.example.service.CalculateService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculateRestController {
  @PostMapping("/calculate")
  public HouseResponseDTO calculate(@RequestBody HouseDTO house){
    CalculateService calculateService = new CalculateService();
    return calculateService.calculate(house);
  }
}
