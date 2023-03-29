package com.glubits.employees.integration;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.glubits.employees.dto.CrudDTO;
import com.glubits.employees.dto.DepartmentDTO;
import com.glubits.employees.dto.EmployeeDTO;
import com.glubits.employees.utils.CrudDTOFactory;
import com.glubits.employees.utils.DepartmentDTOFactory;
import com.glubits.employees.utils.EmployeeDTOFactory;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@SpringBootTest
@AutoConfigureMockMvc
public class DepartmentControllerIntegrationTest {

    @Autowired
    MockMvc mockMvc; // Es como la persona que manda el request.

    ObjectWriter writer = new ObjectMapper()  //Permite traducir un objeto nuestro a un string plano en JSON.
            .registerModule(new JavaTimeModule())
            .writer();

    @Test
    public void saveDepartment() throws Exception {
        // arrange
        CrudDTO expected = CrudDTOFactory.crudDTOCreationWithId5();
        DepartmentDTO department = DepartmentDTOFactory.getDepartment4();

        //REQUEST CON MockHttpServletRequestBuilder & MockMvcRequestBuilders (librerias)
        //Declaramos la request que vamos a llamar o hacer
        MockHttpServletRequestBuilder request = MockMvcRequestBuilders
                .post("/department/save")
                .contentType(MediaType.APPLICATION_JSON) // aca aviso que estoy enviando un JSON
                .content(writer.writeValueAsString(department)); // y aca hay que usar el writter

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
    public void listAlldepartments() throws Exception {
        // arrange
        List<DepartmentDTO> expected = List.of(
                DepartmentDTOFactory.getDepartament(),
                DepartmentDTOFactory.getDepartament1(),
                DepartmentDTOFactory.getDepartment2(),
                DepartmentDTOFactory.getDepartment3());

        //REQUEST CON MockHttpServletRequestBuilder & MockMvcRequestBuilders (librerias)
        //Declaramos la request que vamos a llamar o hacer
        MockHttpServletRequestBuilder request = MockMvcRequestBuilders.get("/department/get");

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
    public void findOneDepartments() throws Exception {
        // arrange
        Integer id = DepartmentDTOFactory.getDepartment2().getId();
        DepartmentDTO expected = DepartmentDTOFactory.getDepartment2();

        //REQUEST CON MockHttpServletRequestBuilder & MockMvcRequestBuilders (librerias)
        //Declaramos la request que vamos a llamar o hacer
        MockHttpServletRequestBuilder request = MockMvcRequestBuilders.get("/department/get/{id}", id);

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
    //ResponseEntity<CrudDTO> deleteDepartments(@PathVariable Integer id)
    @Test
    public void deleteDepartments() throws Exception {
        // arrange
        Integer id = DepartmentDTOFactory.getDepartment3().getId();
        CrudDTO expected = CrudDTOFactory.crudDTODeletationWithId3();

        //REQUEST CON MockHttpServletRequestBuilder & MockMvcRequestBuilders (librerias)
        //Declaramos la request que vamos a llamar o hacer
        MockHttpServletRequestBuilder request = MockMvcRequestBuilders.delete("/department/delete/{id}", id);

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
        String name = DepartmentDTOFactory.getDepartment2().getName();
        List<DepartmentDTO> expected = List.of(DepartmentDTOFactory.getDepartment2());

        //REQUEST CON MockHttpServletRequestBuilder & MockMvcRequestBuilders (librerias)
        //Declaramos la request que vamos a llamar o hacer
        MockHttpServletRequestBuilder request = MockMvcRequestBuilders.get("/department/get/byName/{name}", name);

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

/*    @GetMapping("/get/bySize/{size}")
    public ResponseEntity<List<DepartmentDTO>> findBySize(@PathVariable Integer size)*/
    @Test
    public void findBySize() throws Exception {
        // arrange
        Integer size = 1;
        List<DepartmentDTO> expected = List.of(
                DepartmentDTOFactory.getDepartament(),
                DepartmentDTOFactory.getDepartament1(),
                DepartmentDTOFactory.getDepartment2());

        //REQUEST CON MockHttpServletRequestBuilder & MockMvcRequestBuilders (librerias)
        //Declaramos la request que vamos a llamar o hacer
        MockHttpServletRequestBuilder request = MockMvcRequestBuilders.get("/department/get/bySize/{size}", size);

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
