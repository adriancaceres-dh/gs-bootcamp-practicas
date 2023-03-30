package com.JPA.demo.service.interfaces;

import com.JPA.demo.dto.ClientDTO;
import com.JPA.demo.dto.PersonDTO;
import com.JPA.demo.service.interfaces.generics.ICrudService;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Map;

public interface IClientService extends ICrudService<ClientDTO, Integer> {

    //List<ClientDTO> findByAgesHQL(@Param("year1") Integer year1, @Param("year2") Integer year2);
    List<Map<String,String>> listClientWithInvoices();
}
