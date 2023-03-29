package com.JPA.demo.dto;



import com.JPA.demo.entity.Product;
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

    private List<Product> products;

}
