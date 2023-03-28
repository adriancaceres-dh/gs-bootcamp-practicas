package com.JPA.demo.service;

import com.JPA.demo.dto.InvoiceDTO;
import com.JPA.demo.dto.MessageDTO;

import com.JPA.demo.entity.Invoice;

import com.JPA.demo.repository.IInvoceRepository;
import com.JPA.demo.service.interfaces.IInvoiceService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class InvoiceService implements IInvoiceService {
    @Autowired
    IInvoceRepository invoceRepository;
    ModelMapper mapper = new ModelMapper();
    @Override
    public InvoiceDTO saveEntity(InvoiceDTO personDTO) {
        var entity = mapper.map(personDTO, Invoice.class);
        return mapper.map(
                invoceRepository.save(entity),
                InvoiceDTO.class);
    }

    @Override
    public InvoiceDTO getEntityById(Integer id) {
        var entity = invoceRepository.findById(id).orElseThrow(
                () -> {throw new RuntimeException("No pude encontrar ningun objeto con ese ID");}
        );
        return mapper.map(entity, InvoiceDTO.class);
    }

    @Override
    public List<InvoiceDTO> getAllEntities() {

        var list = invoceRepository.findAll();
        return list.stream().map(
                        invoice -> mapper.map(invoice, InvoiceDTO.class)
                )
                .collect(Collectors.toList());
    }

    @Override
    public MessageDTO deleteEntity(Integer id){
        if(invoceRepository.existsById(id)) {
            invoceRepository.deleteById(id);
            return MessageDTO.builder()
                    .message("Se elimino la factura con ID " + id)
                    .action("DELETATION")
                    .build();
        }
        else{
            return MessageDTO.builder()
                    .message("No se pudo encontrar la factura con " + id)
                    .action("DELETATION")
                    .build();
        }
    }
}
