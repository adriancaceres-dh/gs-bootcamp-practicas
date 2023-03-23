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

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@SpringBootTest
@AutoConfigureMockMvc
public class MenuControllerIntegrationTest {

    @Autowired
    MockMvc mockMvc;

    ObjectWriter writer =  new ObjectMapper()
            .registerModule(new JavaTimeModule()) // convertir fechas
            .writer();

    // arrange

    // REQUEST con  MockHttpServletRequestBuilder & MockMvcRequestBuilders

    // EXPECTED con ResultMatcher & MockMvcResultMatchers


    // act & assert con mockmvc

    @Test
    public void listDish() throws Exception {
        // arrange
        List<RecipeDTO> expected = List.of(RecipeDTOFactory.getBurgerDTO());

        // REQUEST con  MockHttpServletRequestBuilder & MockMvcRequestBuilders
        // aca vamos a declarar la request que vamos a llamar o hacer
        MockHttpServletRequestBuilder request = MockMvcRequestBuilders.get("/menu");

        // Los 3 EXPECTED con ResultMatcher & MockMvcResultMatchers --
        // STATUS
        ResultMatcher statusExpected = MockMvcResultMatchers.status().isOk();

        // BODY
        ResultMatcher bodyExpected = MockMvcResultMatchers.content().json(
                writer.writeValueAsString(expected)
        );

        // CONTENTTYPE
        ResultMatcher contentTypeExpected = MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON);

        // act & assert con mockmvc

        mockMvc.perform(request)
                .andDo(MockMvcResultHandlers.print())
                .andExpectAll(statusExpected,
                        bodyExpected,
                        contentTypeExpected);
    }


    @Test
    public void createDish() throws Exception {
        // arrange
        RecipeDTO expected = RecipeDTOFactory.getBurgerWithQualityAndCaloriesDTO();
        String name = "burger";

        // REQUEST con  MockHttpServletRequestBuilder & MockMvcRequestBuilders
        // aca vamos a declarar la request que vamos a llamar o hacer
        MockHttpServletRequestBuilder request = MockMvcRequestBuilders.post("/menu/dish")
                .param("name", name);

        // Los 3 EXPECTED con ResultMatcher & MockMvcResultMatchers --
        // STATUS
        ResultMatcher statusExpected = MockMvcResultMatchers.status().isOk();

        // BODY
        ResultMatcher bodyExpected = MockMvcResultMatchers.content().json(
                writer.writeValueAsString(expected)
        );

        // CONTENTTYPE
        ResultMatcher contentTypeExpected = MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON);

        // act & assert con mockmvc

        mockMvc.perform(request)
                .andDo(MockMvcResultHandlers.print())
                .andExpectAll(statusExpected,
                        bodyExpected,
                        contentTypeExpected);
    }
}
