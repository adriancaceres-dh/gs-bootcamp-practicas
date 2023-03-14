package com.Bootcamp.Spring1.repository;

import com.Bootcamp.Spring1.dto.request.fly.FlyRequestDTO;
import com.Bootcamp.Spring1.dto.response.FlyResponseDTO;
import com.Bootcamp.Spring1.model.FlyModel;
import com.Bootcamp.Spring1.model.HotelModel;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@Repository
@Getter
@Setter
public class FlyRepository {
    private List<FlyModel> flights;

    public FlyRepository() { //Creamos la data de los vuelos usando el constructor
        this.flights = new ArrayList<>();
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        // Si no reconoce el formato de fecha se descomenta y se agrega el nombre de la variable al final de cada
        // fecha como segundo parametro.

        FlyModel fly1 = new FlyModel();
        fly1.setFlyNumber("BAPI-1235");
        fly1.setOrigin("Buenos Aires");
        fly1.setDestination("Puerto Iguazú");
        fly1.setSeatType("Economy");
        fly1.setPricePerson(6500);
        fly1.setDepartureDate(LocalDate.parse("10-02-2022", f));
        fly1.setReturnDate(LocalDate.parse("15-02-2022", f));

        flights.add(fly1);


        FlyModel fly2 = new FlyModel();
        fly2.setFlyNumber("PIBA-1420");
        fly2.setOrigin("Puerto Iguazú");
        fly2.setDestination("Bogotá");
        fly2.setSeatType("Business");
        fly2.setPricePerson(43200);
        fly2.setDepartureDate(LocalDate.parse("10-02-2022", f));
        fly2.setReturnDate(LocalDate.parse("20-02-2022", f));

        flights.add(fly2);


        FlyModel fly3 = new FlyModel();
        fly3.setFlyNumber("PIBA-1420");
        fly3.setOrigin("Puerto Iguazú");
        fly3.setDestination("Bogotá");
        fly3.setSeatType("Economy");
        fly3.setPricePerson(25735);
        fly3.setDepartureDate(LocalDate.parse("10-02-2022", f));
        fly3.setReturnDate(LocalDate.parse("21-02-2022", f));

        flights.add(fly3);


        FlyModel fly4 = new FlyModel();
        fly4.setFlyNumber("BATU-5536");
        fly4.setOrigin("Buenos Aires");
        fly4.setDestination("Tucumán");
        fly4.setSeatType("Economy");
        fly4.setPricePerson(7320);
        fly4.setDepartureDate(LocalDate.parse("10-02-2022", f));
        fly4.setReturnDate(LocalDate.parse("17-02-2022", f));

        flights.add(fly4);


        FlyModel fly5 = new FlyModel();
        fly5.setFlyNumber("TUPI-3369");
        fly5.setOrigin("Tucumán");
        fly5.setDestination("Puerto Iguazú");
        fly5.setSeatType("Business");
        fly5.setPricePerson(12530);
        fly5.setDepartureDate(LocalDate.parse("12-02-2022", f));
        fly5.setReturnDate(LocalDate.parse("23-02-2022", f));

        flights.add(fly5);


        FlyModel fly6 = new FlyModel();
        fly6.setFlyNumber("TUPI-3369");
        fly6.setOrigin("Tucumán");
        fly6.setDestination("Puerto Iguazú");
        fly6.setSeatType("Economy");
        fly6.setPricePerson(5400);
        fly6.setDepartureDate(LocalDate.parse("02-01-2022", f));
        fly6.setReturnDate(LocalDate.parse("16-01-2022", f));

        flights.add(fly6);


        FlyModel fly7 = new FlyModel();
        fly7.setFlyNumber("BOCA-4213");
        fly7.setOrigin("Bogotá");
        fly7.setDestination("Cartagena");
        fly7.setSeatType("Economy");
        fly7.setPricePerson(8000);
        fly7.setDepartureDate(LocalDate.parse("23-01-2022", f));
        fly7.setReturnDate(LocalDate.parse("05-02-2022", f));

        flights.add(fly7);


        FlyModel fly8 = new FlyModel();
        fly8.setFlyNumber("CAME-0321");
        fly8.setOrigin("Cartagena");
        fly8.setDestination("Medellín");
        fly8.setSeatType("Economy");
        fly8.setPricePerson(7800);
        fly8.setDepartureDate(LocalDate.parse("23-01-2022", f));
        fly8.setReturnDate(LocalDate.parse("31-01-2022", f));

        flights.add(fly8);


        FlyModel fly9 = new FlyModel();
        fly9.setFlyNumber("BOBA-6567");
        fly9.setOrigin("Bogotá");
        fly9.setDestination("Buenos Aires");
        fly9.setSeatType("Business");
        fly9.setPricePerson(57000);
        fly9.setDepartureDate(LocalDate.parse("15-02-2022", f));
        fly9.setReturnDate(LocalDate.parse("28-02-2022", f));

        flights.add(fly9);


        FlyModel fly10 = new FlyModel();
        fly10.setFlyNumber("BOBA-6567");
        fly10.setOrigin("Bogotá");
        fly10.setDestination("Buenos Aires");
        fly10.setSeatType("Economy");
        fly10.setPricePerson(39860);
        fly10.setDepartureDate(LocalDate.parse("01-03-2022", f));
        fly10.setReturnDate(LocalDate.parse("14-03-2022", f));

        flights.add(fly10);


        FlyModel fly11 = new FlyModel();
        fly11.setFlyNumber("BOME-4442");
        fly11.setOrigin("Bogotá");
        fly11.setDestination("Medellín");
        fly11.setSeatType("Economy");
        fly11.setPricePerson(11000);
        fly11.setDepartureDate(LocalDate.parse("10-02-2022", f));
        fly11.setReturnDate(LocalDate.parse("24-02-2022", f));

        flights.add(fly11);


        FlyModel fly12 = new FlyModel();
        fly12.setFlyNumber("MEPI-9986");
        fly12.setOrigin("Medellín");
        fly12.setDestination("Puerto Iguazú");
        fly12.setSeatType("Business");
        fly12.setPricePerson(41640);
        fly12.setDepartureDate(LocalDate.parse("17-04-2022", f));
        fly12.setReturnDate(LocalDate.parse("02-05-2022", f));

        flights.add(fly12);
    }

    public List<FlyModel> getFlights() {
        return flights;
    }

    public List<FlyModel> availableListFly(String origin, String destination, LocalDate departureDate,
                                           LocalDate returnDate) {
        List<FlyModel> availableFlights = new ArrayList<>();
        for (FlyModel flyModel : flights) {
            if (departureDate.isAfter(flyModel.getDepartureDate().minusDays(1))
                    && returnDate.isBefore(flyModel.getReturnDate().plusDays(1))
                    && origin.equals(flyModel.getOrigin())
                    && destination.equals(flyModel.getDestination())) {
                availableFlights.add(flyModel);
            }
        }
        return availableFlights;
    }

    public Integer searchFlightPrice(String flyNumber) {
        for (FlyModel flyModel : flights) {
            if (flyModel.getFlyNumber().equals(flyNumber)) {
                return flyModel.getPricePerson();
            }
        }
        return null;
    }

}

