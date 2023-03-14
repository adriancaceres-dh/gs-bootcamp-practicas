package com.Bootcamp.Spring1.repository;


import com.Bootcamp.Spring1.model.HotelModel;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.time.Period;


import lombok.Getter;
import lombok.Setter;


@Repository
// Get lee los datos
@Getter
// Set modifica datos
@Setter
public class HotelRepository {

    private List<HotelModel> hotels;

    public HotelRepository() { //Creamos la data de los hoteles usando el constructor
        this.hotels = new ArrayList<>();
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        // Si no reconoce el formato de fecha se descomenta y se agrega el nombre de la variable al final de cada
        // fecha como segundo parametro.

        HotelModel hotel1 = new HotelModel();
        hotel1.setCodeHotel("CH-0002");
        hotel1.setName("Cataratas Hotel");
        hotel1.setCity("Puerto Iguazú");
        hotel1.setRoomTipe("doble");
        hotel1.setPrice(6300.00);
        hotel1.setRoomTipe("doble");
        hotel1.setAvailableFromDate(LocalDate.parse("10-02-2022", f));
        hotel1.setAvailableUntilDate(LocalDate.parse("20-03-2022", f));
        hotel1.setReserved(false);

        hotels.add(hotel1);

        HotelModel hotel2 = new HotelModel();
        hotel2.setCodeHotel("CH-0003");
        hotel2.setName("Cataratas Hotel 2");
        hotel2.setCity("Puerto Iguazú");
        hotel2.setRoomTipe("triple");
        hotel2.setPrice(8200.00);
        hotel2.setRoomTipe("triple");
        hotel2.setAvailableFromDate(LocalDate.parse("10-02-2022", f));
        hotel2.setAvailableUntilDate(LocalDate.parse("23-03-2022", f));
        hotel2.setReserved(false);

        hotels.add(hotel2);

        HotelModel hotel3 = new HotelModel();
        hotel3.setCodeHotel("HB-0001");
        hotel3.setName("Hotel Bristol");
        hotel3.setCity("Buenos Aires");
        hotel3.setRoomTipe("single");
        hotel3.setPrice(5435.00);
        hotel3.setAvailableFromDate(LocalDate.parse("10-02-2022", f));
        hotel3.setAvailableUntilDate(LocalDate.parse("19-03-2022", f));
        hotel3.setReserved(false);

        hotels.add(hotel3);

        HotelModel hotel4 = new HotelModel();
        hotel4.setCodeHotel("BH-0002");
        hotel4.setName("Hotel Bristol 2");
        hotel4.setCity("Buenos Aires");
        hotel4.setRoomTipe("doble");
        hotel4.setPrice(7200.00);
        hotel4.setAvailableFromDate(LocalDate.parse("12-02-2022", f));
        hotel4.setAvailableUntilDate(LocalDate.parse("17-04-2022", f));
        hotel4.setReserved(false);

        hotels.add(hotel4);

        HotelModel hotel5 = new HotelModel();
        hotel5.setCodeHotel("SH-0002");
        hotel5.setName("Sheraton");
        hotel5.setCity("Tucumán");
        hotel5.setRoomTipe("doble");
        hotel5.setPrice(5790.00);
        hotel5.setAvailableFromDate(LocalDate.parse("17-04-2022", f));
        hotel5.setAvailableUntilDate(LocalDate.parse("23-05-2022", f));
        hotel5.setReserved(false);

        hotels.add(hotel5);

        HotelModel hotel6 = new HotelModel();
        hotel6.setCodeHotel("SH-0001");
        hotel6.setName("Sheraton 2");
        hotel6.setCity("Tucumán");
        hotel6.setRoomTipe("single");
        hotel6.setPrice(4150.00);
        hotel6.setAvailableFromDate(LocalDate.parse("02-01-2022", f));
        hotel6.setAvailableUntilDate(LocalDate.parse("19-02-2022", f));
        hotel6.setReserved(false);

        hotels.add(hotel6);

        HotelModel hotel7 = new HotelModel();
        hotel7.setCodeHotel("SE-0001");
        hotel7.setName("Selina");
        hotel7.setCity("Bogotá");
        hotel7.setRoomTipe("single");
        hotel7.setPrice(3900.00);
        hotel7.setAvailableFromDate(LocalDate.parse("23-01-2022", f));
        hotel7.setAvailableUntilDate(LocalDate.parse("23-11-2022", f));
        hotel7.setReserved(false);

        hotels.add(hotel7);

        HotelModel hotel8 = new HotelModel();
        hotel8.setCodeHotel("SE-0002");
        hotel8.setName("Selina 2");
        hotel8.setCity("Bogotá");
        hotel8.setRoomTipe("doble");
        hotel8.setPrice(5840.00);
        hotel8.setAvailableFromDate(LocalDate.parse("23-01-2022", f));
        hotel8.setAvailableUntilDate(LocalDate.parse("15-10-2022", f));
        hotel8.setReserved(false);

        hotels.add(hotel8);

        HotelModel hotel9 = new HotelModel();
        hotel9.setCodeHotel("EC-0003");
        hotel9.setName("El Campín");
        hotel9.setCity("Bogotá");
        hotel9.setRoomTipe("triple");
        hotel9.setPrice(7020.00);
        hotel9.setAvailableFromDate(LocalDate.parse("15-02-2022", f));
        hotel9.setAvailableUntilDate(LocalDate.parse("27-03-2022", f));
        hotel9.setReserved(false);

        hotels.add(hotel9);

        HotelModel hotel10 = new HotelModel();
        hotel10.setCodeHotel("CP-0004");
        hotel10.setName("Central Plaza");
        hotel10.setCity("Medellín");
        hotel10.setRoomTipe("Múltiple");
        hotel10.setPrice(8600.00);
        hotel10.setAvailableFromDate(LocalDate.parse("01-03-2022", f));
        hotel10.setAvailableUntilDate(LocalDate.parse("17-04-2022", f));
        hotel10.setReserved(false);

        hotels.add(hotel10);

        HotelModel hotel11 = new HotelModel();
        hotel11.setCodeHotel("CP-0002");
        hotel11.setName("Central Plaza 2");
        hotel11.setCity("Medellín");
        hotel11.setRoomTipe("doble");
        hotel11.setPrice(6400.00);
        hotel11.setAvailableFromDate(LocalDate.parse("10-02-2022", f));
        hotel11.setAvailableUntilDate(LocalDate.parse("20-03-2022", f));
        hotel11.setReserved(false);

        hotels.add(hotel11);

        HotelModel hotel12 = new HotelModel();
        hotel12.setCodeHotel("BG-0004");
        hotel12.setName("Bocagrande");
        hotel12.setCity("Cartagena");
        hotel12.setRoomTipe("Múltiple");
        hotel12.setPrice(9370.00);
        hotel12.setAvailableFromDate(LocalDate.parse("17-04-2022", f));
        hotel12.setAvailableUntilDate(LocalDate.parse("12-06-2022", f));
        hotel12.setReserved(false);

        hotels.add(hotel12);

    }

    /*Le indicamos al Repo que a través de una lista con de los atributos que tenemos en HotelModel, nos retorne
     todos los hoteles que tenemos en la variable hotel declarada arriba en los atributos de Repository*/
    public List<HotelModel> getHotels() {
        return hotels;
    }

    public List<HotelModel> availableListHotels(String city, LocalDate availableFromDate, LocalDate availableUntilDate) {
        List<HotelModel> availableHotels = new ArrayList<>();
        for (HotelModel hotelModel : hotels) {
            if (availableFromDate.isAfter(hotelModel.getAvailableFromDate()) && availableUntilDate.isBefore(hotelModel.getAvailableUntilDate())
                    && availableFromDate.equals(hotelModel.getAvailableFromDate())
                    && availableUntilDate.equals(hotelModel.getAvailableUntilDate())
                    && city.equals(hotelModel.getCity())) {
                availableHotels.add(hotelModel);
            }// si el if resulta verdadero, agregar a la lista ese hotel
        }
        return availableHotels;
    }

    // Con el GET leemos los datos, pero con el SET lo modificamos
    public Double buscarPrecioHotel(String hotelCode) {
        for (HotelModel hotel : hotels) {
            if (hotel.getCodeHotel().equals(hotelCode)) {
                return hotel.getPrice();
            }
        }
        return null;
    }

    // Si el método no tiene return le corresponde el VOID y no tiene tipo (es VOID)
    public void hotelBooking(String hotelCode) {
        for (HotelModel hotel : hotels) {
            if (hotel.getCodeHotel().equals(hotelCode) && !hotel.getReserved()) {
                hotel.setReserved(true);
            }
        }
    }

}