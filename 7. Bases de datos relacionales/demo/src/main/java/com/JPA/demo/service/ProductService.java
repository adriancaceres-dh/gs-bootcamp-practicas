package com.JPA.demo.service;

import com.JPA.demo.dto.MessageDTO;
import com.JPA.demo.dto.ProductDTO;
import com.JPA.demo.service.interfaces.IProductService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IProductService {


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
        return null;
    }

    @Override
    public MessageDTO deleteEntity(Integer integer) {
        return null;
    }
}