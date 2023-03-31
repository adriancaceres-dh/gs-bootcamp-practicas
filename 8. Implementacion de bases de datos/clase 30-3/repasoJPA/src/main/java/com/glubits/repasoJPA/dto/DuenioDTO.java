package com.glubits.repasoJPA.dto;

import com.glubits.repasoJPA.entity.Mascota;
import lombok.*;

import javax.persistence.Column;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DuenioDTO {

    private Integer id;

    private String nombre;

    private String email;

    private String telefono;

    private Short edad;

    private LocalDate fechaNacimiento;

    private List<MascotaDTO> mascotas;

    @Override
    public String toString() {
        return "DuenioDTO{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                ", telefono='" + telefono + '\'' +
                ", edad=" + edad +
                ", fechaNacimiento=" + fechaNacimiento +
                '}';
    }
}
