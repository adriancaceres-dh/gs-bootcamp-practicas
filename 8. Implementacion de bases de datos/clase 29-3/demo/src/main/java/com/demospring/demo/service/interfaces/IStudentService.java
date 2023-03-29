package com.demospring.demo.service.interfaces;

import com.demospring.demo.dto.StudentDTO;
import com.demospring.demo.service.interfaces.generics.ICrudService;

import java.util.List;

public interface IStudentService extends ICrudService<StudentDTO, Integer> {
    List<StudentDTO> findByName(String name);

}
