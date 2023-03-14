package com.practica.obtenerdiploma.integration;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.practica.obtenerdiploma.model.StudentDTO;
import com.practica.obtenerdiploma.util.TestUtilsGenerator;
import lombok.Builder;
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

@SpringBootTest
@AutoConfigureMockMvc
@Builder
public class StudenteControllerIntegrationTest {




        @Autowired
        MockMvc mockMvc;

        ObjectWriter writer =  new ObjectMapper()
                .registerModule(new JavaTimeModule()) // convertir fechas
                .writer();
        @Test
        public void registerStudent() throws Exception {
            StudentDTO body = TestUtilsGenerator.getStudentWithId(11L);

            // REQUEST con  MockHttpServletRequestBuilder & MockMvcRequestBuilders
            // aca vamos a declarar la request que vamos a llamar o hacer
            MockHttpServletRequestBuilder request = MockMvcRequestBuilders.post("/student/registerStudent")
                    .contentType(MediaType.APPLICATION_JSON)
                    .content(writer.writeValueAsString(body));

            // Los 3 EXPECTED con ResultMatcher & MockMvcResultMatchers --
            // STATUS
            ResultMatcher statusExpected = MockMvcResultMatchers.status().isOk();

            // BODY
            ResultMatcher bodyExpected = MockMvcResultMatchers.content().json(
                    writer.writeValueAsString(body)
            );

            // CONTENTTYPE
            ResultMatcher contentTypeExpected = MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON);

            // act & assert con mockmvc

            mockMvc.perform(request)
                    .andDo(MockMvcResultHandlers.print())
                    .andExpect(statusExpected);
        }
    @Test
    public void getStudent() throws Exception {
        // arrange
        //Long id = TestUtilsGenerator.getStudentWith3Subjects("Marco").getId();
        Long id = 1L;
        StudentDTO expected = TestUtilsGenerator.getStudentWithId(id);

        // REQUEST con  MockHttpServletRequestBuilder & MockMvcRequestBuilders
        // aca vamos a declarar la request que vamos a llamar o hacer
        MockHttpServletRequestBuilder request = MockMvcRequestBuilders.get("/student/removeStudent/"+id);

        // Los 3 EXPECTED con ResultMatcher & MockMvcResultMatchers --
        // STATUS
        ResultMatcher statusExpected = MockMvcResultMatchers.status().isOk();

        // BODY
        ResultMatcher bodyExpected = MockMvcResultMatchers.content().json(
                writer.writeValueAsString(expected)
        );

        // CONTENTTYPE
        ResultMatcher contentTypeExpected = MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON);

        // act & assert con mockmvc

        mockMvc.perform(request)
                .andDo(MockMvcResultHandlers.print())
                .andExpect(statusExpected)
                .andExpect(bodyExpected)
                .andExpect(contentTypeExpected);
    }
    @Test
    public void modifyStudent() throws Exception {
        StudentDTO body = TestUtilsGenerator.getStudentWithId(11L);

        // REQUEST con  MockHttpServletRequestBuilder & MockMvcRequestBuilders
        // aca vamos a declarar la request que vamos a llamar o hacer
        MockHttpServletRequestBuilder request = MockMvcRequestBuilders.post("/student/modifyStudent")
                .contentType(MediaType.APPLICATION_JSON)
                .content(writer.writeValueAsString(body));

        // Los 3 EXPECTED con ResultMatcher & MockMvcResultMatchers --
        // STATUS
        ResultMatcher statusExpected = MockMvcResultMatchers.status().isOk();

        // BODY
        ResultMatcher bodyExpected = MockMvcResultMatchers.content().json(
                writer.writeValueAsString(body)
        );

        // CONTENTTYPE
        ResultMatcher contentTypeExpected = MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON);

        // act & assert con mockmvc

        mockMvc.perform(request)
                .andDo(MockMvcResultHandlers.print())
                .andExpect(statusExpected);
    }
    @Test
    public void removeStudent() throws Exception {
        // arrange
        //Long id = TestUtilsGenerator.getStudentWith3Subjects("Marco").getId();
        Long id = 1L;
        StudentDTO expected = TestUtilsGenerator.getStudentWithId(id);

        // REQUEST con  MockHttpServletRequestBuilder & MockMvcRequestBuilders
        // aca vamos a declarar la request que vamos a llamar o hacer
        MockHttpServletRequestBuilder request = MockMvcRequestBuilders.get("/student/removeStudent/"+id);

        // Los 3 EXPECTED con ResultMatcher & MockMvcResultMatchers --
        // STATUS
        ResultMatcher statusExpected = MockMvcResultMatchers.status().isOk();

        // BODY
        ResultMatcher bodyExpected = MockMvcResultMatchers.content().json(
                writer.writeValueAsString(expected)
        );

        // CONTENTTYPE
        ResultMatcher contentTypeExpected = MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON);

        // act & assert con mockmvc

        mockMvc.perform(request)
                .andDo(MockMvcResultHandlers.print())
                .andExpect(statusExpected);
    }
}





