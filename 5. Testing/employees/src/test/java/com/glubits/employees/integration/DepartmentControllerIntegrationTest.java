package com.glubits.employees.integration;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.glubits.employees.dto.CrudDTO;
import com.glubits.employees.dto.DepartmentDTO;
import com.glubits.employees.utils.CrudDTOFactory;
import com.glubits.employees.utils.DepartmentDTOFactory;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
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

@SpringBootTest
@AutoConfigureMockMvc
public class DepartmentControllerIntegrationTest {

    @Autowired
    MockMvc mockMvc;

    ObjectWriter writer;

    @BeforeEach
    public void setupBeforeEach(){
        writer = new ObjectMapper()
                .registerModule(new JavaTimeModule())
                .writer();

    }

    @Test
    public void saveDepartment() throws Exception {
        // arrange
        // param
        DepartmentDTO newDepartment = DepartmentDTOFactory.getDptoDePruebaDeTestDTO();

        // La devolucion
        CrudDTO responseBody = CrudDTOFactory.crudDTOSaveDepartmentWhitId3();

        // request
        MockHttpServletRequestBuilder request =
                MockMvcRequestBuilders.post("/department/save")
                        .content(writer.writeValueAsString(newDepartment))
                        .contentType(MediaType.APPLICATION_JSON);

        // ResultMatcher

        ResultMatcher bodyExpected = MockMvcResultMatchers.content().json(writer.writeValueAsString(responseBody));
        ResultMatcher statusExpected = MockMvcResultMatchers.status().isOk();
        ResultMatcher contentTypeExpected = MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON);

        //Act & Assert con mockmvc
        mockMvc.perform(request)
                .andDo(MockMvcResultHandlers.print())
                .andExpectAll(bodyExpected, statusExpected, contentTypeExpected);

    }
    @Test
    public void listAllDepartments() throws Exception {
        // arrange
        // la respuesta
        List<DepartmentDTO> responseBody = List.of(DepartmentDTOFactory.getDptoDefensaArtesAtipedagogicasDTO(), DepartmentDTOFactory.getDptoDeHistoriaSpringDTO(), DepartmentDTOFactory.getDptoDeCuidadoCriaturasDTO());
        // request
        MockHttpServletRequestBuilder request =
                MockMvcRequestBuilders.get("/department/get");

        // ResultMatcher
        ResultMatcher bodyExpected = MockMvcResultMatchers.content().json(writer.writeValueAsString(responseBody));
        ResultMatcher statusExpected = MockMvcResultMatchers.status().isOk();
        ResultMatcher contentTypeExpected = MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON);

        // act & assert with mockMvc
        mockMvc.perform(request)
                .andDo(MockMvcResultHandlers.print())
                .andExpect(bodyExpected)
                .andExpect(statusExpected)
                .andExpect(contentTypeExpected);
    }
    @Test
    public void findOneDepartments() throws Exception {
        // arrange
        // param
        Integer id = 0;
        // response
        DepartmentDTO responseBody = DepartmentDTOFactory.getDptoDefensaArtesAtipedagogicasDTO();

        // request
        MockHttpServletRequestBuilder request = MockMvcRequestBuilders.get("/department/get/{id}", id);

        // ResultMatcher
        ResultMatcher bodyExpected = MockMvcResultMatchers.content().json(writer.writeValueAsString(responseBody));
        ResultMatcher statusExpected = MockMvcResultMatchers.status().isOk();
        ResultMatcher contentTypeExpected = MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON);

        // act & assert with mockMvc
        mockMvc.perform(request)
                .andDo(MockMvcResultHandlers.print())
                .andExpectAll(bodyExpected, statusExpected, contentTypeExpected);
    }

    @Test
    public void findOneDepartmentNonExistentId() throws Exception {
        // arrange
        // param
        Integer id = 999999;
        // response
        CrudDTO responseBody = CrudDTOFactory.crudDTOSearchDepartmentNonExistentId();

        // request
        MockHttpServletRequestBuilder request = MockMvcRequestBuilders.get("/department/get/{id}", id);

        // ResultMatcher
        ResultMatcher bodyExpected = MockMvcResultMatchers.content().json(writer.writeValueAsString(responseBody));
        ResultMatcher statusExpected = MockMvcResultMatchers.status().isNotFound();
        ResultMatcher contentTypeExpected = MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON);

        // act & assert with mockMvc
        mockMvc.perform(request)
                .andDo(MockMvcResultHandlers.print())
                .andExpectAll(bodyExpected, statusExpected, contentTypeExpected);
    }

    @Test
    public void deleteDepartments() throws Exception {
        // arrange
        // param
        Integer id = 2;

        // response
        CrudDTO responseBody = CrudDTOFactory.crudDTODeletionDepartmentWithId2();

        // request
        MockHttpServletRequestBuilder request =
                MockMvcRequestBuilders.delete("/department/delete/{id}", id);
                        //.get("/department/delete/{id}", id);

        // resultMatcher
        ResultMatcher bodyExpected = MockMvcResultMatchers.content().json(writer.writeValueAsString(responseBody));
        ResultMatcher statusExpected = MockMvcResultMatchers.status().isOk();
        ResultMatcher contentTypeExpected = MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON);

        // act & assert whit mockMvc
        mockMvc.perform(request)
                .andDo(MockMvcResultHandlers.print())
                .andExpect(bodyExpected)
                .andExpect(statusExpected)
                .andExpect(contentTypeExpected);
    }

    @Test
    public void findByName() throws Exception {
        // arrange
        // params
        String name = "Departamento de Cuidado de Criaturas Magicas en capacitacion";

        // response
        List<DepartmentDTO> responseBody = List.of(DepartmentDTOFactory.getDptoDeCuidadoCriaturasDTO());

        // request
        MockHttpServletRequestBuilder request = MockMvcRequestBuilders.get("/department/get/byName/{name}", name);

        // resultMatcher
        ResultMatcher bodyExpected = MockMvcResultMatchers.content().json(writer.writeValueAsString(responseBody));
        ResultMatcher statusExpected = MockMvcResultMatchers.status().isOk();
        ResultMatcher contentTypeExpected = MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON);

        // act & assert whit mockMvc
        mockMvc.perform(request)
                .andDo(MockMvcResultHandlers.print())
                .andExpectAll(bodyExpected, statusExpected, contentTypeExpected);
    }

    @Test
    public void findBySize() throws Exception {
        // arrange
        // params
        Integer size = 2;

        // response
        List<DepartmentDTO> responseBody = List.of(DepartmentDTOFactory.getDptoDeHistoriaSpringDTO());

        // request
        MockHttpServletRequestBuilder request = MockMvcRequestBuilders.get("/department/get/bySize/{size}", size);

        // resultMatcher
        ResultMatcher bodyExpected = MockMvcResultMatchers.content().json(writer.writeValueAsString(responseBody));
        ResultMatcher statusExpected = MockMvcResultMatchers.status().isOk();
        ResultMatcher contentTypeExpected = MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON);

        // act & assert whit mockMvc
        mockMvc.perform(request)
                .andDo(MockMvcResultHandlers.print())
                .andExpectAll(bodyExpected, statusExpected, contentTypeExpected);
    }
}
