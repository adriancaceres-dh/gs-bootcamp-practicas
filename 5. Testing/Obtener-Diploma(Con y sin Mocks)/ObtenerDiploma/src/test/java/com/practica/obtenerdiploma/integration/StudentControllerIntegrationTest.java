package com.practica.obtenerdiploma.integration;

import ch.qos.logback.core.net.ObjectWriter;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest  //Nos habilita a levantar el contexto y la app en cada test
@AutoConfigureMockMvc //Permite toda la configuracion con respecto al MVC
public class StudentControllerIntegrationTest {

    @Autowired
    MockMvc mockMvc; // Es como la persona que manda el request.
    ObjectWriter writer = (ObjectWriter) new ObjectMapper()  //Permite traducir un objeto nuestro a un string plano en JSON.
            .registerModule(new JavaTimeModule())
            .writer();


}
