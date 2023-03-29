package com.glubits.employees.repository;

import java.util.List;
import java.util.Optional;

public interface ICrudRepository<T> {

    Integer save(T entity);

    Integer delete(Integer id);

    Optional<T> findById(Integer id);

    List<T> findByName(String name);

    List<T> listAll();
}
