package com.bootcamp.testing.integration;

import com.bootcamp.testing.dto.RecipeDTO;
import com.bootcamp.testing.utils.RecipeDTOFactory;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.List;

@SpringBootTest  //Nos habilita a levantar el contexto y la app en cada test
@AutoConfigureMockMvc //Permite toda la configuracion con respecto al MVC
public class RecipeControllerIntegrationTest {

    @Autowired
    MockMvc mockMvc; // Es como la persona que manda el request.

    ObjectWriter writer = new ObjectMapper()  //Permite traducir un objeto nuestro a un string plano en JSON.
            .registerModule(new JavaTimeModule())
            .writer();

    // arrange


    //REQUEST CON MockHttpServletRequestBuilder & MockMvcRequestBuilders

    //EXPECTED con ResultMatcher & MockMvcResultMatchers


    // act & assert con mockmvc

    @Test
    public void createRecipe() throws Exception {

        // arrange
        RecipeDTO expected = RecipeDTOFactory.getNotBurgerDTO();
        RecipeDTO bodyNewRecipe = RecipeDTOFactory.getNotBurgerDTO();


        //REQUEST CON MockHttpServletRequestBuilder & MockMvcRequestBuilders (librerias)
        //Declaramos la request que vamos a llamar o hacer
        MockHttpServletRequestBuilder request = MockMvcRequestBuilders.post("/recipe")
                .content(writer.writeValueAsString(bodyNewRecipe)).contentType(MediaType.APPLICATION_JSON);

        //Los 3 EXPECTED con ResultMatcher & MockMvcResultMatchers
        //StatusExpected
        ResultMatcher statusExpected = MockMvcResultMatchers.status().isCreated();
        //BodyExpected
        ResultMatcher bodyExpected = MockMvcResultMatchers.content().json(
                writer.writeValueAsString(expected)
        );
        //ContentTypeExpected
        ResultMatcher contentTypeExpected = MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON);

        // act & assert con mockmvc
        mockMvc.perform(request)
                .andDo(MockMvcResultHandlers.print()) //Devuelve el request de manera gráfica
                .andExpect(statusExpected)
                .andExpect(bodyExpected)
                .andExpect(contentTypeExpected);
    }

}
