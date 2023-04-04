package com.JPA.demo.service;

import com.JPA.demo.dto.ClientDTO;
import com.JPA.demo.dto.MessageDTO;
import com.JPA.demo.dto.ProductDTO;
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
        return null;
    }

    @Override
    public ProductDTO getEntityById(Integer integer) {
        return null;
    }

    @Override
    public List<ProductDTO> getAllEntities() {
        var list = productRepository.findAll();
        return list.stream().map(
                        product -> mapper.map(product, ProductDTO.class)
                )
                .collect(Collectors.toList());
    }

    @Override
    public MessageDTO deleteEntity(Integer integer) {
        return null;
    }
}
