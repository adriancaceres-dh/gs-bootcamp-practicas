package com.JPA.demo.repository;

import com.JPA.demo.dto.ClientDTO;
import com.JPA.demo.entity.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Map;

public interface IInvoiceRepository extends JpaRepository<Invoice, Integer> {

    //LENGUAJE HQL
    //List<Invoice> findInvoiceByDateyear(); //--> Para esto, no puedo con el date sacar el año sin utilizar un between para buscar entre 2 fechas completas.

    //Utilizando una @Query con HQL puedo pasar un año y que me devuelva las facturas de dicho año
    @Query("FROM Invoice i WHERE YEAR(i.date) = :year") //YEAR es aceptado por HQL
    List<Invoice> findInvoiceByDateEquals(@Param("year") Integer year); //--> VOY AL SERVICE A CREAR EL MÉTODO.


    // AGREGAR CATEGORY EN PRODUCTOS PARA QUE FUNCIONE (OBVIAMENTE QUE ESTÉN RELACIONADOS)
    //@Query("FROM Invoice i JOIN i.products p WHERE p.category = :category")
    //List<Invoice> findByCategory(@Param("category") String category);

    //Quiero obtener los id de invoice junto a la cantidad de productos que tiene
    //{
    //"id" : "--"
    //"cant_product" : "----"
    //}

    @Query("SELECT new map(i.id as id, SIZE(i.products) as count_product) FROM Invoice i") //Puedo pasar mapas solamente pero si retornar listas u objetos.
    List<Map<String,Integer>> getIdWithCount();

    //listar las facturas que tengan un producto en específico.
    @Query("FROM Invoice i JOIN Product p WHERE p.name = :producto")
    List<Invoice> listInvoiceWithProduct(@Param("producto") String producto);


}
