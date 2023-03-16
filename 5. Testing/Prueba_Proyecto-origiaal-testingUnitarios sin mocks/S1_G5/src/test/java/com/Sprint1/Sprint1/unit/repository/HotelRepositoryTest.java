package com.Sprint1.Sprint1.unit.repository;

import com.Sprint1.Sprint1.model.HotelObject;
import com.Sprint1.Sprint1.repository.HotelRepository;
import com.Sprint1.Sprint1.utils.HotelFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

 public class HotelRepositoryTest {
    HotelRepository hotelRepository = new HotelRepository();

    @Test
    public void listaDeHotelesTest (){

        //arrange
        List<HotelObject> expected = new ArrayList<>();
        HotelObject hotels = HotelFactory.listaDeHotelesTest();
        expected.add(hotels);

        //act

        var result = hotelRepository.listaDeHoteles();
        //assert
        Assertions.assertEquals(expected, result);

    }

     @Test

     public void listaDeHotelesContarTest(){
         //arrange
         Integer expected = 1;
         //act
         var result = hotelRepository.listaDeHoteles();
         //assert
         Assertions.assertEquals(expected, result.size());

     }

}
