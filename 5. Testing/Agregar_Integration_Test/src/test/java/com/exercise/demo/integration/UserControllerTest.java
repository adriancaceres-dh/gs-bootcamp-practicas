package com.exercise.demo.integration;

import com.exercise.demo.dto.request.UserRequestDTO;
import com.exercise.demo.dto.response.MessageResponseDTO;
import com.exercise.demo.utils.UserDTOFactory;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.SerializationFeature;
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

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@AutoConfigureMockMvc
class UserControllerTest {
    @Autowired
    MockMvc mockMvc;

    ObjectWriter writer = new ObjectMapper()
            .configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false)
            .registerModule(new JavaTimeModule())
            .writer();

    @Test
    void loginTest() throws Exception {
        // Request
        UserRequestDTO bodyRequest = UserDTOFactory.getUser1();

        MockHttpServletRequestBuilder request =
                MockMvcRequestBuilders.put("/users/login")
                        .content(writer.writeValueAsString(bodyRequest))
                        .contentType(MediaType.APPLICATION_JSON);

        // Expected
        // Status
        ResultMatcher statusExpected = MockMvcResultMatchers.status().isCreated();

        // Body
        var expectedResponse = new MessageResponseDTO("Login Correct");
        ResultMatcher bodyExpected = MockMvcResultMatchers.content().json(writer.writeValueAsString(expectedResponse));

        // ContentType
        ResultMatcher contentTypeExpected = MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON);

        //act & assert con mocking
        mockMvc.perform(request)
                .andDo(MockMvcResultHandlers.print())
                .andExpectAll(statusExpected, bodyExpected, contentTypeExpected);
    }
}