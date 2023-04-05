package com.glubits.repasoJPA.service.generics;

import com.glubits.repasoJPA.dto.MessageDTO;

import java.util.List;

public interface ICrudService<T, ID> {

    T saveEntity(T objectDTO);

    List<T> getAllEntities();

    T getEntityById(ID id);

    MessageDTO deleteEntity(ID id);
}
