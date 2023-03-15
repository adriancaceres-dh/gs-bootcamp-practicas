package com.Sprint1.Sprint1.service;

import com.Sprint1.Sprint1.dto.request.VueloRequestDto;
import com.Sprint1.Sprint1.dto.response.*;
import com.Sprint1.Sprint1.exception.SinParametrosException;
import com.Sprint1.Sprint1.exception.VueloNoEncontradoException;
import com.Sprint1.Sprint1.model.VuelosObject;
import com.Sprint1.Sprint1.repository.VuelosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@Service
public class VuelosService {
    @Autowired
    VuelosRepository vuelosRepository;

    public List<VuelosObject> listarVuelos() {
        return vuelosRepository.listaDeVuelos();
    }

    public List<VuelosObject> listarVuelosPorFechaDestino(String fechaPartida, String fechaRegreso, String destino)
            throws ParseException {

        if(fechaPartida == null && fechaRegreso == null && destino == null){
            return vuelosRepository.listaDeVuelos();
        } else if (fechaPartida == null || fechaRegreso == null || destino == null) {
            throw new SinParametrosException();
        }

        List<VuelosObject> vuelosBuscados = new ArrayList<>();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDate fechaPartidaFormateada = LocalDate.parse(fechaPartida, formatter).plusDays(1);
        LocalDate fechaRegresoFormateada = LocalDate.parse(fechaRegreso, formatter).minusDays(1);

        for (VuelosObject vuelos : vuelosRepository.listaDeVuelos()) {
            if (fechaPartidaFormateada.isAfter(vuelos.getFechaIda()) &&
                    fechaRegresoFormateada.isBefore(vuelos.getFechaVuelta()) &&
                    destino.equals(vuelos.getDestino())) {
                vuelosBuscados.add(vuelos);
            }
        }

        if(vuelosBuscados.size() == 0) {
            throw new VueloNoEncontradoException();
        }

        return vuelosBuscados;
    }

    public VueloResponseDto reservarVueloImpl(VueloRequestDto vueloRequestDto){

        VueloResponseDto respuestaFinal = new VueloResponseDto();
        Double precio = 0.0;

        respuestaFinal.setUserName(vueloRequestDto.getNombreUsuario());

        for (VuelosObject vuelos : vuelosRepository.getVuelosCargados()) {

            if(vuelos.getNroVuelo().equals(vueloRequestDto.getVueloReserva().getCodigoVuelo())){
                precio = vuelos.getPrecioPorPersona();
            }
        }
        respuestaFinal.setTotal(vueloRequestDto.getVueloReserva().getCantidadAsientos() * precio);

        VueloReservaResponseDto reserva = new VueloReservaResponseDto();

        reserva.setFechaDesde(vueloRequestDto.getVueloReserva().getFechaDesde());
        reserva.setFechaHasta(vueloRequestDto.getVueloReserva().getFechaHasta());
        reserva.setOrigen(vueloRequestDto.getVueloReserva().getOrigen());
        reserva.setDestino(vueloRequestDto.getVueloReserva().getDestino());
        reserva.setCodigoVuelo(vueloRequestDto.getVueloReserva().getCodigoVuelo());
        reserva.setCantidadAsientos(vueloRequestDto.getVueloReserva().getCantidadAsientos());
        reserva.setClaseAsiento(vueloRequestDto.getVueloReserva().getClaseAsientos());
        reserva.setPersonas(vueloRequestDto.getVueloReserva().getPersonas());

        reserva.setEstado(new StatusCodeDto(200,"Funca"));

        respuestaFinal.setVueloReservaResponseDto(reserva);

        return respuestaFinal;
    }
}
