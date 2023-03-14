package com.dh.blog.model;

import lombok.*;
import org.springframework.cglib.core.Local;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter //Puede usarse @Data que abarca Getter and Setter y muchas cosas mas (.ToString(), etc)
public class EntradaBlog {

    private int id; //Se puede utilizar Integer, es recomendado para validaciones || No hace falta que lo envien
    private String name;// hace falta.
    private String title;// hace falta.
    private LocalDate date;// no hace falta.


}
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Hotels {

    private String hotelCode;
    private String name;
    private String city;
    private String  typeRoom;
    private String  priceForNight;
    private String availabilityFrom;
    private String  availabilityUntil;
    private String reserved;
}

