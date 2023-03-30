package com.example.demo.service.generics;

import com.example.demo.dto.MessageDTO;

import java.util.List;

public interface ICrudService<T,ID> {
    T saveEntity(T dto);

    List<T> getAllEntities();

    T getEntityById(ID id);

    MessageDTO deleteEntity(ID id);
}
