package com.glubits.employees.integration;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.glubits.employees.dto.CrudDTO;
import com.glubits.employees.dto.EmployeeDTO;
import com.glubits.employees.utils.CrudDTOFactory;
import com.glubits.employees.utils.EmployerDTOFactory;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.web.client.RequestMatcher;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest
@AutoConfigureMockMvc
public class EmployeeControllerIntegrationTest {

    @Autowired
    MockMvc mockMvc;

    ObjectWriter writer;

    @BeforeEach
    public void setupBeforAll() {
        writer = new ObjectMapper()
                .registerModule(new JavaTimeModule())
                .writer();
    }

    @Test
    public void saveEmployee() throws Exception {
        // Arrange
        EmployeeDTO newEmployee = EmployerDTOFactory.getTinchoDTO();
        CrudDTO responseBody = CrudDTOFactory.crudDTOCreationWidthId3();

        // Request
        MockHttpServletRequestBuilder request =
                MockMvcRequestBuilders.post("/employee/save")
                        .content(
                                writer.writeValueAsString(newEmployee)
                        ).contentType(MediaType.APPLICATION_JSON);

        // ResultMarchers
        ResultMatcher bodyExpected = MockMvcResultMatchers.content().json(writer.writeValueAsString(responseBody));
        ResultMatcher statusExpected = MockMvcResultMatchers.status().isOk();
        ResultMatcher contentTypeExpected = MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON);

        // Act & Assert con MockMVC
        mockMvc.perform(request)
                .andDo(MockMvcResultHandlers.print())
                .andExpect(bodyExpected)
                .andExpect(statusExpected)
                .andExpect(contentTypeExpected);

    }

    @Test
    public void FindOneEmployer() throws Exception {
        // Arrange
        Integer id = 0;

        EmployeeDTO responseBody = EmployerDTOFactory.getGabiDTO();

        // Request
        MockHttpServletRequestBuilder request =
                MockMvcRequestBuilders.get("/employee/get/{id}", id);

        // ResultMarchers
        ResultMatcher bodyExpected = MockMvcResultMatchers.content().json(writer.writeValueAsString(responseBody));
        ResultMatcher statusExpected = MockMvcResultMatchers.status().isOk();
        ResultMatcher contentTypeExpected = MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON);

        // Act & Assert con MockMVC
        mockMvc.perform(request)
                .andDo(MockMvcResultHandlers.print())
                .andExpect(bodyExpected)
                .andExpect(statusExpected)
                .andExpect(contentTypeExpected);
    }
    @Test
    public void FindOneEmployerWithIdNotExistent() throws Exception {
        // Arrange
        Integer id = 999999;

        CrudDTO responseBody = CrudDTOFactory.crudDTOReadingWhitId999999();

        // Request
        MockHttpServletRequestBuilder request =
                MockMvcRequestBuilders.get("/employee/get/{id}", id);

        // ResultMarchers
        ResultMatcher bodyExpected = MockMvcResultMatchers.content().json(writer.writeValueAsString(responseBody));
        ResultMatcher statusExpected = MockMvcResultMatchers.status().isOk();
        ResultMatcher contentTypeExpected = MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON);

        // Act & Assert con MockMVC
        mockMvc.perform(request)
                .andDo(MockMvcResultHandlers.print())
                .andExpect(bodyExpected)
                .andExpect(statusExpected)
                .andExpect(contentTypeExpected);
    }
}
