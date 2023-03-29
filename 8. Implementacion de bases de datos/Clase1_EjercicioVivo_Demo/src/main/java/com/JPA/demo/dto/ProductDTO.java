package com.JPA.demo.dto;

import com.JPA.demo.entity.Invoice;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class ProductDTO {

    private Integer id;

    private String name;

    private String description;

}
