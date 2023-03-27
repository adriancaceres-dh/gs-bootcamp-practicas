package com.JPA.demo.service;

import com.JPA.demo.dto.InvoiceDTO;
import com.JPA.demo.dto.MessageDTO;
import com.JPA.demo.entity.Invoice;
import com.JPA.demo.repository.IInvoiceRepository;
import com.JPA.demo.service.interfaces.IInvoiceService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class InvoiceService implements IInvoiceService {


    @Autowired
    IInvoiceRepository invoiceRepository;

    ModelMapper mapper = new ModelMapper();

    @Override
    public InvoiceDTO saveEntity(InvoiceDTO invoiceDTO) {
        var entity = mapper.map(invoiceDTO, Invoice.class);

        return mapper.map(
                invoiceRepository.save(entity), InvoiceDTO.class
        );
    }

    @Override
    public InvoiceDTO getEntityById(Integer integer) {
        var invoice = invoiceRepository.findById(integer).orElseThrow(
                () -> {
                    throw new RuntimeException(("No se encuentra la factura con id: " + integer));
                }
        );

        return mapper.map(invoice, InvoiceDTO.class);
    }

    @Override
    public List<InvoiceDTO> getAllEntities() {
        var list = invoiceRepository.findAll();

        return list.stream().map(
                invoice -> mapper.map(invoice, InvoiceDTO.class)
        ).collect(Collectors.toList());
    }

    @Override
    public MessageDTO deleteEntity(Integer integer) {
        if (invoiceRepository.existsById(integer)) {
            invoiceRepository.deleteById(integer);

            return MessageDTO.builder()
                    .message("Se elimino la factura con id: " + integer)
                    .action("DELETATION")
                    .build();
        }

        return MessageDTO.builder()
                .message("No se encontro la factura con id: " + integer)
                .action("DELETATION")
                .build();
    }
}
