package com.bootcamp.testing.integration;

import com.bootcamp.testing.dto.RecipeDTO;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockHttpServletRequestDsl;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import utils.RecipeDTOFactory;

import java.util.LinkedList;
import java.util.List;

@SpringBootTest
@AutoConfigureMockMvc
public class MenuControllerIntegrationTest {

    @Autowired
    MockMvc mockMvc;

    ObjectWriter writer = new ObjectMapper()
            .registerModule(new JavaTimeModule())
            .writer();


    @Test
    public void listDish() throws JsonProcessingException {
        //arrange
        List<RecipeDTO> expected = List.of(RecipeDTOFactory.getBurgerDTO());

        //REQUEST
        MockHttpServletRequestBuilder request = MockMvcRequestBuilders.get("/menu");

        //los 3 expected con ResultMatcher
        //1.STATUS
        ResultMatcher statusExpected = MockMvcResultMatchers.status().isOk();

        //2.BODY
        ResultMatcher bodyExpected = MockMvcResultMatchers.content().json(
                writer.writeValueAsString(expected));

        //3.CONTENTTYPE
        ResultMatcher contentTypeExpected = MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON);

        mockMvc.perform(request)
                .andDo(MockMvcResultHandlers.print())
                .andExpectAll(statusExpected,
                        bodyExpected,
                        contentTypeExpected);

    }


}
