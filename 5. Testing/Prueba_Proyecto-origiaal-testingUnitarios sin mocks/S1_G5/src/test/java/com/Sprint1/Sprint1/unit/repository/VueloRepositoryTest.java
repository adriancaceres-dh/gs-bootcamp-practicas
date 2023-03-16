package com.Sprint1.Sprint1.unit.repository;
import com.Sprint1.Sprint1.model.VuelosObject;
import com.Sprint1.Sprint1.repository.VuelosRepository;
import com.Sprint1.Sprint1.utils.VueloFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

public class VueloRepositoryTest {

    VuelosRepository vuelosRepository = new VuelosRepository();

    @Test
    public void listaDeVuelosTest (){

        //arrange
        List<VuelosObject> expected = new ArrayList<>();
        VuelosObject vuelos = VueloFactory.listaDeVuelosTest();
        expected.add(vuelos);

        //act

        var result = vuelosRepository.listaDeVuelos();
        //assert
        Assertions.assertEquals(expected, result);

    }

    @Test

    public void listaDeVuelosContarTest(){
        //arrange
        Integer expected = 1;
        //act
        var result = vuelosRepository.listaDeVuelos();
        //assert
        Assertions.assertEquals(expected, result.size());

    }

}
