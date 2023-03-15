package com.Sprint1.Sprint1.service;

import com.Sprint1.Sprint1.dto.request.HotelRequestDto;
import com.Sprint1.Sprint1.dto.response.HotelReservaResponseDto;
import com.Sprint1.Sprint1.dto.response.HotelResponseDto;
import com.Sprint1.Sprint1.dto.response.StatusCodeDto;
import com.Sprint1.Sprint1.exception.HotelNoEncontradoException;
import com.Sprint1.Sprint1.exception.SinParametrosException;
import com.Sprint1.Sprint1.model.HotelObject;
import com.Sprint1.Sprint1.repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@Service
public class HotelService {

    @Autowired
    HotelRepository hotelRepository;

    public List<HotelObject> listarHotelesPorFechaDestino(String fechaPartida, String fechaRegreso, String destino)
            throws ParseException {
        if(fechaPartida == null && fechaRegreso == null && destino == null){
            return hotelRepository.listaDeHoteles();
        }else if (fechaPartida == null || fechaRegreso == null || destino == null) {
            throw new SinParametrosException();
        }
        List<HotelObject> hotelesBuscados = new ArrayList<>();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDate fechaPartidaFormateada = LocalDate.parse(fechaPartida, formatter).plusDays(1);
        LocalDate fechaRegresoFormateada = LocalDate.parse(fechaRegreso, formatter).minusDays(1);

        for (HotelObject hotel : hotelRepository.listaDeHoteles()) {
            if (fechaPartidaFormateada.isAfter(hotel.getDisponibleDesde()) &&
                    fechaRegresoFormateada.isBefore(hotel.getDisponibleHasta()) &&
                    destino.equals(hotel.getLugarCiudad())) {
                hotelesBuscados.add(hotel);
            }
        }

        if(hotelesBuscados.size() == 0) {
            throw new HotelNoEncontradoException();
        }

        return hotelesBuscados;
    }

    public HotelResponseDto hotelReservaImpl(HotelRequestDto hotelRequestDto) {

    HotelResponseDto respuestaFinal = new HotelResponseDto();
    Double precio = 0.0;

    respuestaFinal.setNombreUsuario(hotelRequestDto.getNombreUsuario());

        for (HotelObject hotel : hotelRepository.getHotelesCargados()) {

            if(hotel.getCodigoHotel().equals(hotelRequestDto.getHotelReserva().getCodigoHotel())){
                precio = hotel.getPrecioPorNoche();
            }
        }
    respuestaFinal.setTotal(hotelRequestDto.getHotelReserva().getCantidadPersonas() * precio);

        HotelReservaResponseDto reserva = new HotelReservaResponseDto();

        reserva.setFechaDesde(hotelRequestDto.getHotelReserva().getFechaDesde());
        reserva.setFechaHasta(hotelRequestDto.getHotelReserva().getFechaHasta());
        reserva.setDestino(hotelRequestDto.getHotelReserva().getDestino());
        reserva.setCodigoHotel(hotelRequestDto.getHotelReserva().getCodigoHotel());
        reserva.setCantidadPersonas(hotelRequestDto.getHotelReserva().getCantidadPersonas());
        reserva.setTipoHabitacion(hotelRequestDto.getHotelReserva().getTipoHabitacion());
        reserva.setPersonas(hotelRequestDto.getHotelReserva().getPersonas());

        reserva.setEstado(new StatusCodeDto(200,"Funca"));

        respuestaFinal.setHotelReservaResponseDto(reserva);

        return respuestaFinal;

    }
}
