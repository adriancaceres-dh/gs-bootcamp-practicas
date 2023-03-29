package com.JPA.demo.service;

import com.JPA.demo.dto.InvoiceDTO;
import com.JPA.demo.dto.MessageDTO;

import com.JPA.demo.entity.Client;
import com.JPA.demo.entity.Invoice;

import com.JPA.demo.repository.IClientRepository;
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

        entity = invoceRepository.save(entity);

        // convierto desde entity a DTO para devolver al controller
        return mapper.map(entity, InvoiceDTO.class);
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

        // representacion del stream
        // List<InvoiceDTO> invoices = new ArrayList<>();
        // for(int i = 0; i < list.size() - 1; i++){
        //    var entity = list.get(i); // stream
        //    InvoiceDTO dtoAux = mapper.map(entity, InvoiceDTO.class); // map
        //    invoices.add(dtoAux); // collect to list
        //}
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
