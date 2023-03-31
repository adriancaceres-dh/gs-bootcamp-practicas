package com.JPA.demo.service.interfaces;

import com.JPA.demo.dto.ClientDTO;
import com.JPA.demo.service.interfaces.generics.ICrudService;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IClientService extends ICrudService<ClientDTO, Integer> {
    //Listar todos los clientes en orden alfabético:
    @Query("FROM Client c JOIN c.person p WHERE ORDER BY p.firstname ASC")
    List<ClientDTO> orderByName(String order);
}
