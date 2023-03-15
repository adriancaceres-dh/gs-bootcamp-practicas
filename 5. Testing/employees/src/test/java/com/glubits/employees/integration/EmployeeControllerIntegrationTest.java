package com.glubits.employees.integration;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.glubits.employees.dto.CrudDTO;
import com.glubits.employees.dto.EmployeeDTO;
import com.glubits.employees.repository.EmployeeRepository;
import com.glubits.employees.utils.CrudDTOFactory;
import com.glubits.employees.utils.EmployeeDTOFactory;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
@AutoConfigureMockMvc
class EmployeeControllerIntegrationTest {
    @Autowired
    MockMvc mockMvc;

    ObjectWriter writer;

    EmployeeRepository employeeRepository;

    @BeforeEach
     void setup() {
        writer = new ObjectMapper().registerModule(new JavaTimeModule()).writer();
    }

    @BeforeEach
    void setupReository() {
        employeeRepository = new EmployeeRepository();
    }

    @Test
    @DirtiesContext
    void saveEmployee() throws Exception {
        // Arrange
        EmployeeDTO newEmployee = EmployeeDTOFactory.getTinchoDTO();
        CrudDTO responseBody = CrudDTOFactory.crudDTOCreationWithI3();

        // Request
        MockHttpServletRequestBuilder request = MockMvcRequestBuilders.post("/employee/save/")
                .content(
                        writer.writeValueAsString(newEmployee)
                )
                .contentType(MediaType.APPLICATION_JSON);

        // ResultMatchers
        ResultMatcher bodyExpected = MockMvcResultMatchers.content().json(writer.writeValueAsString(responseBody));
        ResultMatcher statusExpected = MockMvcResultMatchers.status().isOk();
        ResultMatcher contentTypeExpected = MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON);

        // Act & Assert con mockMvc
        mockMvc.perform(request)
                .andDo(MockMvcResultHandlers.print())
                .andExpectAll(bodyExpected,
                        statusExpected,
                        contentTypeExpected);
    }

    @Test
    void listAllEmployees() throws Exception {
        // Arrange
        List<EmployeeDTO> expected = List.of(EmployeeDTOFactory.getGabiDTO(),
                EmployeeDTOFactory.getMarcoDTO(),
                EmployeeDTOFactory.getJeanDTO());

        // Request
        MockHttpServletRequestBuilder request = MockMvcRequestBuilders.get("/employee/get");

        // ResultMatchers
        ResultMatcher bodyExpected = MockMvcResultMatchers.content().json(writer.writeValueAsString(expected));
        ResultMatcher statusExpected = MockMvcResultMatchers.status().isOk();
        ResultMatcher contentTypeExpected = MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON);

        // Act & Assert con mockMvc
        mockMvc.perform(request)
                .andDo(MockMvcResultHandlers.print())
                .andExpectAll(bodyExpected,
                        statusExpected,
                        contentTypeExpected);
    }

    @Test
    void findOneEmployee() throws Exception {
        // Arrange
        Integer id = 0;
        EmployeeDTO responseBody = EmployeeDTOFactory.getGabiDTO();

        // Request
        MockHttpServletRequestBuilder request =
                MockMvcRequestBuilders.get("/employee/get/{id}", id);

        // ResultMatchers
        ResultMatcher bodyExpected = MockMvcResultMatchers.content().json(writer.writeValueAsString(responseBody));
        ResultMatcher statusExpected = MockMvcResultMatchers.status().isOk();
        ResultMatcher contentTypeExpected = MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON);

        // Act & Assert con mockMvc
        mockMvc.perform(request)
                .andDo(MockMvcResultHandlers.print())
                .andExpectAll(bodyExpected,
                        statusExpected,
                        contentTypeExpected);
    }

    @Test
    void findOneEmployeeWhitIdNotExistent() throws Exception {
        // Arrange
        Integer id = 999;
        CrudDTO responseBody = CrudDTOFactory.crudDTOReadingNotFoundWithId999();

        // Request
        MockHttpServletRequestBuilder request =
                MockMvcRequestBuilders.get("/employee/get/{id}", id);

        // ResultMatchers
        ResultMatcher bodyExpected = MockMvcResultMatchers.content().json(writer.writeValueAsString(responseBody));
        ResultMatcher statusExpected = MockMvcResultMatchers.status().isNotFound();
        ResultMatcher contentTypeExpected = MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON);

        // Act & Assert con mockMvc
        mockMvc.perform(request)
                .andDo(MockMvcResultHandlers.print())
                .andExpectAll(bodyExpected,
                        statusExpected,
                        contentTypeExpected);
    }

    @Test
    void deleteEmployee() {
    }

    @Test
    void findByName() {
    }
}