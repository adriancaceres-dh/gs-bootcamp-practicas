package com.demospring.demo.service.generics;

import com.demospring.demo.dto.MessageDTO;

import java.util.List;

public interface ICrudService<T, ID> {

    T saveEntity(T personDTO);

    T getEntityById(ID id);

    List<T> getAllEntities();

    MessageDTO deleteEntity(ID id);
}
