package com.JPA.demo.service;

import com.JPA.demo.dto.MessageDTO;
import com.JPA.demo.dto.ProductDTO;
import com.JPA.demo.entity.Product;
import com.JPA.demo.repository.IProductRepository;
import com.JPA.demo.service.interfaces.IProductService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductService implements IProductService {

    @Autowired
    IProductRepository productRepository;

    ModelMapper mapper = new ModelMapper();

    @Override
    public ProductDTO saveEntity(ProductDTO personDTO) {
        var entity = mapper.map(personDTO, Product.class);
        return mapper.map(
                productRepository.save(entity), ProductDTO.class
        );
    }

    @Override
    public ProductDTO getEntityById(Integer integer) {
        var entity = productRepository.findById(integer).orElseThrow(
                () -> { throw new RuntimeException("No se encontro el producto con ID " + integer);}
        );
        return mapper.map(entity, ProductDTO.class);
    }

    @Override
    public List<ProductDTO> getAllEntities() {
        var list = productRepository.findAll();
        return list.stream().map(
                product -> mapper.map(product, ProductDTO.class)
        ).collect(Collectors.toList());
    }

    @Override
    public MessageDTO deleteEntity(Integer integer) {
        if(productRepository.existsById(integer)) {
            productRepository.deleteById(integer);
            return MessageDTO.builder()
                    .message("Se elimino el producto con ID " + integer)
                    .action("DELETATION")
                    .build();
        } else {
            return MessageDTO.builder()
                    .message("No se encontro el producto con ID " + integer)
                    .action("DELETATION")
                    .build();
        }
    }
}
