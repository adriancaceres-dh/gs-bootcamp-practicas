package com.JPA.demo.repository;

import com.JPA.demo.entity.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IInvoceRepository extends JpaRepository<Invoice, Integer> {
}
