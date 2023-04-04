package com.JPA.demo.service;

import com.JPA.demo.dto.ClientDTO;
import com.JPA.demo.dto.InvoiceDTO;
import com.JPA.demo.dto.MessageDTO;
import com.JPA.demo.dto.PersonDTO;
import com.JPA.demo.entity.Client;
import com.JPA.demo.entity.Invoice;
import com.JPA.demo.entity.Person;
import com.JPA.demo.repository.IClientRepository;
import com.JPA.demo.repository.IInvoiceRepository;
import com.JPA.demo.service.interfaces.IInvoiceService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class InvoiceService implements IInvoiceService {
    @Autowired
    IInvoiceRepository invoiceRepository;

    @Autowired
    IClientRepository clientRepository;

    ModelMapper mapper = new ModelMapper();
    @Override
    public InvoiceDTO saveEntity(InvoiceDTO invoiceDTO) {
        // conversion desde DTO a entity para guardar en el repo
        var entity = mapper.map(invoiceDTO, Invoice.class);

        Client client = null;

        // esto si el id no es nulo, busca la entidad en la base de datos y luego se la asigna a entity.
        if(entity.getClient().getId() != null){
            client = clientRepository.findById(entity.getClient().getId()).get();
        }
        // esto si el id es nulo entonces va y guarda en la base de datos.
        else{
            client = clientRepository.save(entity.getClient());
        }

        entity.setClient(client);

        entity = invoiceRepository.save(entity);

        // convierto desde entity a DTO para devolver al controller
        return mapper.map(entity, InvoiceDTO.class);
    }

    @Override
    public InvoiceDTO getEntityById(Integer integer) {
        return null;
    }

    @Override
    public List<InvoiceDTO> getAllEntities() {
        var list = invoiceRepository.findAll();

        return list.stream().map(
                        invoice -> mapper.map(invoice, InvoiceDTO.class)
                )
                .collect(Collectors.toList());

        // representacion del stream
        // List<InvoiceDTO> invoices = new ArrayList<>();
        // for(int i = 0; i < list.size() - 1; i++){
        //    var entity = list.get(i); // stream
        //    InvoiceDTO dtoAux = mapper.map(entity, InvoiceDTO.class); // map
        //    invoices.add(dtoAux); // collect to list
        //}
    }

    @Override
    public MessageDTO deleteEntity(Integer integer) {
        return null;
    }
}
