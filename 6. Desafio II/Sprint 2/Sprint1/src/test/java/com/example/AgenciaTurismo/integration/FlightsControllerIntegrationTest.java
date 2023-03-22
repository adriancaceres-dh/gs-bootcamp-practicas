package com.example.AgenciaTurismo.integration;

import com.example.AgenciaTurismo.dto.request.BookingRequestDto;
import com.example.AgenciaTurismo.dto.request.FlightReservationReqDto;
import com.example.AgenciaTurismo.dto.response.BookingResponseDto;
import com.example.AgenciaTurismo.dto.response.FlightResponseDto;
import com.example.AgenciaTurismo.dto.response.FlightsAvailableDto;
import com.example.AgenciaTurismo.util.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cglib.core.Local;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

@SpringBootTest
@AutoConfigureMockMvc
public class FlightsControllerIntegrationTest {

    @Autowired
    MockMvc mockMvc; // Es como la persona que manda el request.

    ObjectWriter writer = new ObjectMapper()  //Permite traducir un objeto nuestro a un string plano en JSON.
            .registerModule(new JavaTimeModule())
            .writer();

    @Test
    @DisplayName("Busqueda de todos los vuelos")
    public void searchAllFlights() throws Exception {

        // arrange
        List<FlightsAvailableDto> expected = FlightAvailableDtoFactory.listFlights();

        //REQUEST CON MockHttpServletRequestBuilder & MockMvcRequestBuilders (librerias)
        //Declaramos la request que vamos a llamar o hacer
        MockHttpServletRequestBuilder request = MockMvcRequestBuilders.get("/api/v1/flights");

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
    @DisplayName("Se filtran los vuelos con las fechas y destino como parámetro")
    public void filterFlights() throws Exception {

        // arrange
        List<FlightsAvailableDto> expected = List.of(FlightAvailableDtoFactory.getBapi());
        String origin = FlightAvailableDtoFactory.getBapi().getOrigen();
        String destin = FlightAvailableDtoFactory.getBapi().getDestino();
        //LocalDate fechaIda = LocalDate.parse(FlightAvailableDtoFactory.getBapi().getFechaIda().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        //LocalDate fechaVuelta = LocalDate.parse(FlightAvailableDtoFactory.getBapi().getFechaVuelta().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        String fechaIda = "10/02/2022";
        String fechaVuelta = "15/02/2022";

        //REQUEST CON MockHttpServletRequestBuilder & MockMvcRequestBuilders (librerias)
        //Declaramos la request que vamos a llamar o hacer

        MockHttpServletRequestBuilder request = MockMvcRequestBuilders.get("/api/v1/flight")
                .param("origin", origin)
                .param("destination", destin)
                .param("dateFrom", String.valueOf(fechaIda))
                .param("dateTo", String.valueOf(fechaVuelta));


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
    @DisplayName("reserva de un vuelo con DTO de reserva como parámetro")
    public void booking() throws Exception {
        // arrange

        FlightReservationReqDto flightReservationReqDto = FlightReservationReqFactory.getFlightReservationDto();
        System.out.println(flightReservationReqDto);

        //response
        FlightResponseDto expectedBody = FlightResponseDtoFactory.getResponse();
        System.out.println(expectedBody);

        // request
        MockHttpServletRequestBuilder request = MockMvcRequestBuilders
                .post("/api/v1/flight-reservation/")
                .content(writer.writeValueAsString(flightReservationReqDto))
                .contentType(MediaType.APPLICATION_JSON);


        // resultMatcher 3 expected bodyExpected - statusExpected - contentTypeExpected
        ResultMatcher bodyExpected = MockMvcResultMatchers.content().json(writer.writeValueAsString(expectedBody));
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
