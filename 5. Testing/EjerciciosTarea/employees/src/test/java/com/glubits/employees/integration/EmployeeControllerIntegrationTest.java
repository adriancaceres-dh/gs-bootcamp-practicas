package com.glubits.employees.integration;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.glubits.employees.dto.CrudDTO;
import com.glubits.employees.dto.EmployeeDTO;
import com.glubits.employees.utils.CrudDTOFactory;
import com.glubits.employees.utils.EmployeeDTOFactory;
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
public class EmployeeControllerIntegrationTest {

    @Autowired
    MockMvc mockMvc; // Es como la persona que manda el request.

    ObjectWriter writer;

    @BeforeEach
    public void setupBeforeAll(){
        writer = new ObjectMapper()//Permite traducir un objeto nuestro a un string plano en JSON.
                .registerModule(new JavaTimeModule())
                .writer();
    }
/*
    @Test
    public void listAllEmployees() throws Exception {
        // arrange
        List<EmployeeDTO> expected = List.of(
                EmployeeDTOFactory.getGabiDTO(),
                EmployeeDTOFactory.getMarcoDTO(),
                EmployeeDTOFactory.getJeanDTO()
        );

        //REQUEST CON MockHttpServletRequestBuilder & MockMvcRequestBuilders (librerias)
        //Declaramos la request que vamos a llamar o hacer
        MockHttpServletRequestBuilder request = MockMvcRequestBuilders.get("/employee/get");

        //Los 3 EXPECTED con ResultMatcher & MockMvcResultMatchers
        //StatusExpected
        ResultMatcher statusExpected = MockMvcResultMatchers.status().isOk();

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
*/
    /*
    @Test
    public void saveEmployee() throws Exception {
        // Arrange
        // Param necesario
        EmployeeDTO newEmployee = EmployeeDTOFactory.getTinchoDTO();
        // La devolucion
        CrudDTO expected = CrudDTOFactory.crudDTOCreationWithId3();

        //REQUEST CON MockHttpServletRequestBuilder & MockMvcRequestBuilders (librerias)
        //Declaramos la request que vamos a llamar o hacer
        MockHttpServletRequestBuilder request = MockMvcRequestBuilders
                .post("/employee/save")
                .contentType(MediaType.APPLICATION_JSON) // aca aviso que estoy enviando un JSON
                .content(writer.writeValueAsString(newEmployee)); // y aca hay que usar el writter

        //Los 3 EXPECTED con ResultMatcher & MockMvcResultMatchers
        //StatusExpected
        ResultMatcher statusExpected = MockMvcResultMatchers.status().isOk();

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
*/
    @Test
    public void findOneEmployee() throws Exception {
        // arrange
        Integer id = EmployeeDTOFactory.getJeanDTO().getId();
        EmployeeDTO expected = EmployeeDTOFactory.getJeanDTO();

        //REQUEST CON MockHttpServletRequestBuilder & MockMvcRequestBuilders (librerias)
        //Declaramos la request que vamos a llamar o hacer
        MockHttpServletRequestBuilder request = MockMvcRequestBuilders.get("/employee/get/"+id);

        //Los 3 EXPECTED con ResultMatcher & MockMvcResultMatchers
        //StatusExpected
        ResultMatcher statusExpected = MockMvcResultMatchers.status().isOk();

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

    @Test
    public void findByName() throws Exception {
        // arrange
        String name = EmployeeDTOFactory.getJeanDTO().getName();
        List<EmployeeDTO> expected = List.of(EmployeeDTOFactory.getJeanDTO());

        //REQUEST CON MockHttpServletRequestBuilder & MockMvcRequestBuilders (librerias)
        //Declaramos la request que vamos a llamar o hacer
        MockHttpServletRequestBuilder request = MockMvcRequestBuilders.get("/employee/get/byName/"+name);

        //Los 3 EXPECTED con ResultMatcher & MockMvcResultMatchers
        //StatusExpected
        ResultMatcher statusExpected = MockMvcResultMatchers.status().isOk();

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

    @Test
    public void deleteEmploee() throws Exception {
        //arrange
        CrudDTO expected = CrudDTOFactory.crudDTODeletationWithId1();
        Integer id = 1;

        //REQUEST CON MockHttpServletRequestBuilder & MockMvcRequestBuilders (librerias)
        //Declaramos la request que vamos a llamar o hacer
        MockHttpServletRequestBuilder request = MockMvcRequestBuilders.delete("/employee/delete/{id}",id);

        //Los 3 EXPECTED con ResultMatcher & MockMvcResultMatchers
        //StatusExpected
        ResultMatcher statusExpected = MockMvcResultMatchers.status().isOk();

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

