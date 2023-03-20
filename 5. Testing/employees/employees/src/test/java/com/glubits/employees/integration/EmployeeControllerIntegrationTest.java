package com.glubits.employees.integration;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.glubits.employees.dto.CrudDTO;
import com.glubits.employees.dto.EmployeeDTO;
import com.glubits.employees.utils.CrudDTOFactory;
import com.glubits.employees.utils.EmployeeDTOFactory;
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
public class EmployeeControllerIntegrationTest {
    @Autowired
    MockMvc mockMvc;
    ObjectWriter writer;
    @BeforeEach
    public void setUpBeforeAll(){
        writer = new ObjectMapper()
                .registerModule(new JavaTimeModule()).writer();
    }
@Test
    public void saveEmployee() throws Exception {
        //arrange
        EmployeeDTO newEmployee = EmployeeDTOFactory.getTinchoDTO();   //viene de la Fcatory

        //la devolucion
        CrudDTO responseBody = CrudDTOFactory.crudDTOCreationWithId3();

        //Request - pertenecen de la parte del arrenge
        MockHttpServletRequestBuilder request = MockMvcRequestBuilders.post("/employee/save")
                .content(
                        writer.writeValueAsString(newEmployee)
                )
                .contentType(MediaType.APPLICATION_JSON);

        //resultsMatchers, son comparaciones que se repiten en los metodos
        ResultMatcher bodyExpected = MockMvcResultMatchers.content().json(writer.writeValueAsString(responseBody));  //necesita el crudDtoFactory, el writer ayuda a escribir en json
        ResultMatcher statusExpected = MockMvcResultMatchers.status().isOk();  //espero un status
        ResultMatcher contentTypeExpected = MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON); // pasamos el tipo de contenido que necesito

        //Assert con Mocks, es igual por estandar
        mockMvc.perform(request)
                .andDo(MockMvcResultHandlers.print()) //hace una muestra en consola de lo que hizo
                .andExpect(bodyExpected)
                .andExpect(statusExpected)
                .andExpect(contentTypeExpected);
    }
    @Test
    public void findOneEmployees () throws Exception {
        //arrange
            //parametro requerido
        Integer id = 0;

            //la devolucion
        EmployeeDTO responseBody = EmployeeDTOFactory.getGabiDTO();

            //request
        MockHttpServletRequestBuilder request = MockMvcRequestBuilders.get("/employee/get/{id}", id);  //solamente tenemos una variable

            //los 3 expected con resultsMatchers
        ResultMatcher bodyExpected = MockMvcResultMatchers.content().json(writer.writeValueAsString(responseBody));  //necesita el crudDtoFactory, el writer ayuda a escribir en json
        ResultMatcher statusExpected = MockMvcResultMatchers.status().isOk();  //espero un status
        ResultMatcher contentTypeExpected = MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON); // pasamos el tipo de contenido que necesito

        //Act & Assert
        mockMvc.perform(request)
                .andDo(MockMvcResultHandlers.print()) //hace una muestra en consola de lo que hizo
                .andExpect(bodyExpected)
                .andExpect(statusExpected)
                .andExpect(contentTypeExpected);
    }
    @Test
    public void findOneEmployeesWhitIdNotExistent () throws Exception {
        //arrange
        //parametro requerido
        Integer id = 9999;

        //la devolucion
        CrudDTO responseBody = CrudDTOFactory.crudDTOReadingNotFindId9999();

        //request
        MockHttpServletRequestBuilder request = MockMvcRequestBuilders.get("/employee/get/{id}", id);  //solamente tenemos una variable

        //los 3 expected con resultsMatchers
        ResultMatcher bodyExpected = MockMvcResultMatchers.content().json(writer.writeValueAsString(responseBody));  //necesita el crudDtoFactory, el writer ayuda a escribir en json
        ResultMatcher statusExpected = MockMvcResultMatchers.status().isNotFound();  //espero un status
        ResultMatcher contentTypeExpected = MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON); // pasamos el tipo de contenido que necesito

        //Act & Assert
        mockMvc.perform(request)
                .andDo(MockMvcResultHandlers.print()) //hace una muestra en consola de lo que hizo
                .andExpect(bodyExpected)
                .andExpect(statusExpected)
                .andExpect(contentTypeExpected);
    }
    @Test
    public void  deleteEmployee() throws Exception {
        //arrange
            //parametro requerido
        Integer id = 1;

            //la devolucion
        CrudDTO responseBody = CrudDTOFactory.crudDTODeletationWithId1();

            //request
        MockHttpServletRequestBuilder request = MockMvcRequestBuilders.delete("/employee/delete/{id}", id);

            //los 3 expected con resultsMatchers
        ResultMatcher bodyExpected = MockMvcResultMatchers.content().json(writer.writeValueAsString(responseBody));  //necesita el crudDtoFactory, el writer ayuda a escribir en json
        ResultMatcher statusExpected = MockMvcResultMatchers.status().isOk();  //espero un status
        ResultMatcher contentTypeExpected = MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON); // pasamos el tipo de contenido que necesito

        //Act & Assert
        mockMvc.perform(request)
                .andDo(MockMvcResultHandlers.print()) //hace una muestra en consola de lo que hizo
                .andExpect(bodyExpected)
                .andExpect(statusExpected)
                .andExpect(contentTypeExpected);
    }
    @Test
    public void findByName() throws Exception {
        //arrange
            //parametro requerido
        String name = EmployeeDTOFactory.getJeanDTO().getName();
        List<EmployeeDTO> expected = List.of(EmployeeDTOFactory.getJeanDTO());

        //request
        MockHttpServletRequestBuilder request = MockMvcRequestBuilders.get("/employee/get/byName/{name}", name);

        //los 3 expected con resultsMatchers
        ResultMatcher bodyExpected = MockMvcResultMatchers.content().json(writer.writeValueAsString(expected));
        ResultMatcher statusExpected = MockMvcResultMatchers.status().isOk();  //espero un status
        ResultMatcher contentTypeExpected = MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON);

        //Act & Assert
        mockMvc.perform(request)
                .andDo(MockMvcResultHandlers.print()) //hace una muestra en consola de lo que hizo
                .andExpect(bodyExpected)
                .andExpect(statusExpected)
                .andExpect(contentTypeExpected);

    }
}
