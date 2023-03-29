package com.JPA.demo.dto;


import com.JPA.demo.entity.Client;
import com.JPA.demo.entity.Product;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class InvoiceDTO {

    private Integer id;

    private LocalDate date;

    private ClientDTO client;

    private List<ProductDTO> products;

}
