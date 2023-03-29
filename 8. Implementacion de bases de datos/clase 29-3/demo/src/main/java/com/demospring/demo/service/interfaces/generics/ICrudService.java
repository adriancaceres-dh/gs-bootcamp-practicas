package com.demospring.demo.service.interfaces.generics;

import com.demospring.demo.dto.MessageDTO;
import com.demospring.demo.dto.StudentDTO;

import java.util.List;

public interface ICrudService<T, ID> {

    T saveEntity(T personDTO);

    T getEntityById(ID id);

    List<T> getAllEntities();

    MessageDTO deleteEntity(ID id);

}
