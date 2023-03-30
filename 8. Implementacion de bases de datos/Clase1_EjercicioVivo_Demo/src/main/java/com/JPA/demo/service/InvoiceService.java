package com.JPA.demo.service;

import com.JPA.demo.dto.ClientDTO;
import com.JPA.demo.dto.InvoiceDTO;
import com.JPA.demo.dto.MessageDTO;
import com.JPA.demo.dto.PersonDTO;
import com.JPA.demo.entity.Invoice;
import com.JPA.demo.repository.IInvoiceRepository;
import com.JPA.demo.service.interfaces.IInvoiceService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
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

    //METODOS CON HQL
    public List<InvoiceDTO> findByYear(Integer year){
        var list = invoiceRepository.findInvoiceByDateEquals(year);

        return list.stream().map(
                yearActual -> mapper.map(yearActual, InvoiceDTO.class)
        ).collect(Collectors.toList());
    }

/*    public List<InvoiceDTO> findByCategory(String category){
        var list = invoiceRepository.findByCategory(category);

        return list.stream().map(
                categoryActual -> mapper.map(categoryActual, InvoiceDTO.class)
        ).collect(Collectors.toList());
    }*/

    public List<Map<String,Integer>> getIdWithCount(){
        var list = invoiceRepository.getIdWithCount();

        return list;
    }

    public List<InvoiceDTO> listInvoiceWithProduct(String producto){
        var list = invoiceRepository.listInvoiceWithProduct(producto);

        return list.stream().map(
                productActual -> mapper.map(productActual, InvoiceDTO.class)
        ).collect(Collectors.toList());
    }

}
