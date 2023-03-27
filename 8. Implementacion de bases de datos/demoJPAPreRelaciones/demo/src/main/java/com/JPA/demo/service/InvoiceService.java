package com.JPA.demo.service;

import com.JPA.demo.dto.InvoiceDTO;
import com.JPA.demo.dto.MessageDTO;
import com.JPA.demo.dto.PersonDTO;
import com.JPA.demo.entity.Invoice;
import com.JPA.demo.entity.Person;
import com.JPA.demo.repository.IInvoiceRepository;
import com.JPA.demo.repository.IPersonRepository;
import com.JPA.demo.service.interfaces.IInvoiceService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.sql.init.dependency.DatabaseInitializationDependencyConfigurer;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class InvoiceService implements IInvoiceService {
    @Autowired
    IInvoiceRepository invoiceRepository;

    ModelMapper mapper = new ModelMapper();

    @Override
    public InvoiceDTO saveEntity(InvoiceDTO personDTO) {
        var entity = mapper.map(personDTO, Invoice.class);
        return mapper.map(
                invoiceRepository.save(entity),
                InvoiceDTO.class);
    }

    @Override
    public InvoiceDTO getEntityById(Integer integer) {
        var entity = invoiceRepository.findById(integer).orElseThrow(
                () -> {throw new RuntimeException("No pude encontrar ninguna FC con ese ID");}
        );
        return mapper.map(entity, InvoiceDTO.class);
    }

    @Override
    public List<InvoiceDTO> getAllEntities() {
        var list = invoiceRepository.findAll();
        return list.stream().map(
                        invoice -> mapper.map(invoice, InvoiceDTO.class)
                )
                .collect(Collectors.toList());

    }

    @Override
    public MessageDTO deleteEntity(Integer integer) {

        if(invoiceRepository.existsById(integer)) {
            invoiceRepository.deleteById(integer);
            return MessageDTO.builder()
                    .message("Se elimino la factura con ID " + integer)
                    .action("DELETATION")
                    .build();
        }
        else{
            return MessageDTO.builder()
                    .message("No se pudo encontrar una factura con " + integer)
                    .action("DELETATION")
                    .build();
        }
    }
}
