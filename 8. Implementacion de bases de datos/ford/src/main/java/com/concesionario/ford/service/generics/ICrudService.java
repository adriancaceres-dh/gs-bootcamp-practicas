package com.concesionario.ford.service.generics;

import com.concesionario.ford.dto.MessageDTO;

import java.util.List;

public interface ICrudService<T, ID> {

    T saveEntity(T objectDTO);

    List<T> getAllEntities();

    T getEntityById(ID id);

    MessageDTO deleteEntity(ID id);
}

