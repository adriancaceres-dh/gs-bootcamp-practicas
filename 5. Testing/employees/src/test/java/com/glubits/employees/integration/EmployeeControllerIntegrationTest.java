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
    public void setupBeforeAll(){
        writer = new ObjectMapper()
                .registerModule(new JavaTimeModule())
                .writer();
    }

    @Test
    public void saveEmployee() throws Exception {
        // Arrange
        // Param necesario
        EmployeeDTO newEmployee = EmployeeDTOFactory.getTinchoDTO();
        // La devolucion
        CrudDTO responseBody = CrudDTOFactory.crudDTOCreationWithId3();

        // Request
        MockHttpServletRequestBuilder request =
                MockMvcRequestBuilders.post("/employee/save")
                        .content(
                                writer.writeValueAsString(newEmployee)
                        )
                        .contentType(MediaType.APPLICATION_JSON);

        // ResultMatchers

        ResultMatcher bodyExpected = MockMvcResultMatchers.content().json(writer.writeValueAsString(responseBody));
        ResultMatcher statusExpected = MockMvcResultMatchers.status().isOk();
        ResultMatcher contentTypeExpected = MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON);

        // Act & Assert con mockmvc

        mockMvc.perform(request)
                .andDo(MockMvcResultHandlers.print())
                .andExpect(bodyExpected)
                .andExpect(statusExpected)
                .andExpect(contentTypeExpected);
    }

    @Test
    public void listAllEmployees() throws Exception {
        // arrange
        // la respuesta
        List<EmployeeDTO> responseBody = List.of(EmployeeDTOFactory.getGabiDTO(), EmployeeDTOFactory.getMarcoDTO(), EmployeeDTOFactory.getJeanDTO());
        // request
        MockHttpServletRequestBuilder request =
                MockMvcRequestBuilders.get("/employee/get");

        // ResultMatcher
        ResultMatcher bodyExpected = MockMvcResultMatchers.content().json(writer.writeValueAsString(responseBody));
        ResultMatcher statusExpected = MockMvcResultMatchers.status().isOk();
        ResultMatcher contentTypeExpected = MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON);

        // act & assert
        mockMvc.perform(request)
                .andDo(MockMvcResultHandlers.print())
                .andExpect(bodyExpected)
                .andExpect(statusExpected)
                .andExpect(contentTypeExpected);
    }

    //@GetMapping("/get/{id}")
    //    public ResponseEntity<EmployeeDTO>  findOneEmployee(@PathVariable Integer id){
    //        return ResponseEntity.ok(employeeService.findOneEmployee(id));
    //    }

    @Test
    public void findOneEmployee() throws Exception {
        // arrange
            // parametro requerido
            Integer id = 0;
            // la devolucion
            EmployeeDTO responseBody = EmployeeDTOFactory.getGabiDTO();
            // request
            MockHttpServletRequestBuilder request =
                    MockMvcRequestBuilders.get("/employee/get/{id}", id);
            // los 3 expected con resultmatcher
            ResultMatcher bodyExpected = MockMvcResultMatchers.content().json(writer.writeValueAsString(responseBody));
            ResultMatcher statusExpected = MockMvcResultMatchers.status().isOk();
            ResultMatcher contentTypeExpected = MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON);
        // Act & assert
        mockMvc.perform(request)
                .andDo(MockMvcResultHandlers.print())
                .andExpect(bodyExpected)
                .andExpect(statusExpected)
                .andExpect(contentTypeExpected);
    }

    @Test
    public void findOneEmployeeWithIdNotExistent() throws Exception {
        // arrange
        // parametro requerido
        Integer id = 999999;
        // la devolucion
        CrudDTO responseBody = CrudDTOFactory.crudDTOReadingNotFoundWithId999999();
        // request
        MockHttpServletRequestBuilder request =
                MockMvcRequestBuilders.get("/employee/get/{id}", id);
        // los 3 expected con resultmatcher
        ResultMatcher bodyExpected = MockMvcResultMatchers.content().json(writer.writeValueAsString(responseBody));
        ResultMatcher statusExpected = MockMvcResultMatchers.status().isNotFound();
        ResultMatcher contentTypeExpected = MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON);
        // Act & assert
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
        String name = "Marco";

        // response
        List<EmployeeDTO> responseBody = List.of(EmployeeDTOFactory.getMarcoDTO());

        // request
        MockHttpServletRequestBuilder request = MockMvcRequestBuilders.get("/employee/get/byName/{name}", name);

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
    public void deleteEmployee() throws Exception {
        // arrange
        // param
        Integer id = 1;

        // response
        CrudDTO responseBody = CrudDTOFactory.crudDTODeletationWithId1();

        // request
        MockHttpServletRequestBuilder request =
                MockMvcRequestBuilders.delete("/employee/delete/{id}", id);

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


}
