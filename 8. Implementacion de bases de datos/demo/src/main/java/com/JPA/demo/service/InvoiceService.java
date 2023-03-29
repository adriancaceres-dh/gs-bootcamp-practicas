package com.JPA.demo.service;

import com.JPA.demo.dto.InvoiceDTO;
import com.JPA.demo.dto.MessageDTO;
import com.JPA.demo.entity.Invoice;
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

    ModelMapper mapper = new ModelMapper();
    @Override
    public InvoiceDTO saveEntity(InvoiceDTO personDTO) {
        var entity = mapper.map(personDTO, Invoice.class);
        return mapper.map(
                invoiceRepository.save(entity),
                InvoiceDTO.class
        );
    }

    @Override
    public InvoiceDTO getEntityById(Integer id) {
        var entity = invoiceRepository.findById(id).orElseThrow(
                () -> {throw new RuntimeException("No se encontró ninguna factura con ese ID");}
        );
        return mapper.map(entity, InvoiceDTO.class);
    }

    @Override
    public List<InvoiceDTO> getAllEntities() {
        var list = invoiceRepository.findAll();

        /*List<InvoiceDTO> invoices = new ArrayList<>();
        
         for (int i = 0; i < list.size() - 1; i++){
            var entity = list.get(i); // stream
            InvoiceDTO dtoAux = mapper.map(entity, InvoiceDTO.class); // map
            invoices.add(dtoAux); // collect to list
        }
        return invoices;*/

        return list.stream().map(
                invoice -> mapper.map(invoice, InvoiceDTO.class)
        )
                .collect(Collectors.toList());
    }

    @Override
    public MessageDTO deleteEntity(Integer id) {

        if(invoiceRepository.existsById(id)) {
            invoiceRepository.deleteById(id);
            return MessageDTO.builder()
                    .message("Se eliminó factura con ID " + id)
                    .action("DELETATION")
                    .build();
        }
        else {
            return MessageDTO.builder()
                    .message("No se encontro ninguna factura con el ID " + id)
                    .action("DELETATION")
                    .build();
        }

    }
}
