package com.example.AgenciaTurismo.integration;

import com.example.AgenciaTurismo.dto.request.BookingRequestDto;
import com.example.AgenciaTurismo.dto.response.BookingResponseDto;
import com.example.AgenciaTurismo.dto.response.FlightsAvailableDto;
import com.example.AgenciaTurismo.dto.response.HotelAvailableDto;
import com.example.AgenciaTurismo.repository.HotelesRepository;
import com.example.AgenciaTurismo.util.FlightAvailableDtoFactory;
import com.example.AgenciaTurismo.util.HotelAvailableDtoFactory;
import com.example.AgenciaTurismo.util.HotelReservationReqFactory;
import com.example.AgenciaTurismo.util.HotelResponseDtoFactory;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
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

import java.time.LocalDate;
import java.util.List;
@SpringBootTest
@AutoConfigureMockMvc
public class HotelsControllerIntegrationTest {
    @Autowired
    MockMvc mockMvc;

    ObjectWriter writer;

    @BeforeEach
    public void setup(){
        writer = new ObjectMapper()
                .registerModule(new JavaTimeModule())
                .writer();
    }


    @Test
    @DisplayName("Busqueda de todos los hoteles")
    public void searchAllHotels() throws Exception {
        // arrange
        List<HotelAvailableDto> expected = HotelAvailableDtoFactory.listHotels();

        //REQUEST CON MockHttpServletRequestBuilder & MockMvcRequestBuilders (librerias)
        //Declaramos la request que vamos a llamar o hacer
        MockHttpServletRequestBuilder request = MockMvcRequestBuilders.get("/api/v1/hotels");

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
    @DisplayName("Se filtran los hoteles con las fechas y destino como parámetro")
    public void filterHotels() throws Exception {
        // arrange

        String dateFrom = "10/02/2022";
        String dateTo = "19/02/2022";
        String destination = "Buenos Aires";

        //response
        List<HotelAvailableDto> responseBody = List.of(HotelAvailableDtoFactory.BristolHotel());

        // request

        MockHttpServletRequestBuilder request = MockMvcRequestBuilders
                .get("/api/v1/hotel/")
                .param("dateFrom",dateFrom)
                .param("dateTo", dateTo)
                .param("destination", destination);


        // resultMatcher 3 expected bodyExpected - statusExpected - contentTypeExpected
        ResultMatcher bodyExpected = MockMvcResultMatchers.content().json(writer.writeValueAsString(responseBody));
        ResultMatcher statusExpected = MockMvcResultMatchers.status().isOk();
        ResultMatcher contentTypeExpected = MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON);

        // act & assert whit mockMvc
        mockMvc.perform(request)
                .andDo(MockMvcResultHandlers.print())
                .andExpectAll(bodyExpected, statusExpected, contentTypeExpected);
    }

    @Test
    @DisplayName("reserva de un hotel con DTO de reserva como parámetro")
    public void booking() throws Exception {
        // arrange

        BookingRequestDto bookingRequest = HotelReservationReqFactory.getResponseReservationDto();

        //response
        BookingResponseDto expectedBody = HotelResponseDtoFactory.getResponse();

        // request
        MockHttpServletRequestBuilder request = MockMvcRequestBuilders
                .post("/api/v1/booking/")
                .content(writer.writeValueAsString(bookingRequest))
                .contentType(MediaType.APPLICATION_JSON);


        // resultMatcher 3 expected bodyExpected - statusExpected - contentTypeExpected
        ResultMatcher bodyExpected = MockMvcResultMatchers.content().json(writer.writeValueAsString(expectedBody));
        ResultMatcher statusExpected = MockMvcResultMatchers.status().isOk();
        ResultMatcher contentTypeExpected = MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON);

        // act & assert whit mockMvc
        mockMvc.perform(request)
                .andDo(MockMvcResultHandlers.print())
                .andExpectAll(bodyExpected, statusExpected, contentTypeExpected);

    }




}

