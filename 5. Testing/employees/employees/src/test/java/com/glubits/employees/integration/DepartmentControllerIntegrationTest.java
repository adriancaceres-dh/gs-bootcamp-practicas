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
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@SpringBootTest
@AutoConfigureMockMvc
public class DepartmentControllerIntegrationTest {
    @Autowired
    MockMvc mockMvc;

    ObjectWriter writer = new ObjectMapper()
            .registerModule(new JavaTimeModule())
            .writer();

    @Test
    public void saveDepartments() throws Exception {
        //arrange
        CrudDTO responseBody = CrudDTOFactory.crudDTOCreationDepartment();
        DepartmentDTO department = DepartmentDTOFactory.getJavaDTO();

        //request con MockHhttp
        MockHttpServletRequestBuilder request = MockMvcRequestBuilders.post("/department/save")
                .content(
                        writer.writeValueAsString(department)
                )
                .contentType(MediaType.APPLICATION_JSON);

        //los 3 expected
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
    public void listAllDepartments() throws Exception {
        //arrange
        List<DepartmentDTO> responseBody = List.of(
                DepartmentDTOFactory.getArtesAntipedagogicasDTO(),
                DepartmentDTOFactory.getMagiadeSpringbootDTO(),
                DepartmentDTOFactory.getCriaturasMagicasDTO(),
                DepartmentDTOFactory.getJavaDTO());

        //request con MockHttpServletRequestBuilder
        MockHttpServletRequestBuilder request = MockMvcRequestBuilders.get("/department/get");

        //los 3 expected
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
    public void findOneDepartments () throws Exception {
        //arrange
        Integer id = DepartmentDTOFactory.getJavaDTO().getId();
        DepartmentDTO responseBody = DepartmentDTOFactory.getJavaDTO();

        //request con MockHttpServletRequestBuilder
        MockHttpServletRequestBuilder request = MockMvcRequestBuilders.get("/department/get/{id}", id);

        //los 3 expected
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
    public void deleteDepartments () throws Exception {
        //arrange
        Integer id = DepartmentDTOFactory.getJavaDTO().getId();
        CrudDTO responseBody = CrudDTOFactory.crudDTODeletationDepartmentId3();

        //request con MockHttpServletRequestBuilder
        MockHttpServletRequestBuilder request = MockMvcRequestBuilders.delete("/department/delete/{id}", id);

        //los 3 expected
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
    public void findByName() throws Exception {
        //arrange
        String name = DepartmentDTOFactory.getJavaDTO().getName();
        List<DepartmentDTO> responseBody = List.of(DepartmentDTOFactory.getJavaDTO());

        //request con MockHttpServletRequestBuilder
        MockHttpServletRequestBuilder request = MockMvcRequestBuilders.get("/department/get/byName/{name}", name);

        //los 3 expected
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
    public void findBySize() throws Exception {
        //arrange
        Integer size = 1;
        List<DepartmentDTO> responseBody = List.of(
                DepartmentDTOFactory.getArtesAntipedagogicasDTO(),
                DepartmentDTOFactory.getMagiadeSpringbootDTO(),
                DepartmentDTOFactory.getCriaturasMagicasDTO());

        //request con MockHttpServletRequestBuilder
        MockHttpServletRequestBuilder request = MockMvcRequestBuilders.get("/department/get/bySize/{size}", size);

        //los 3 expected
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
}
