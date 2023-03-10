package com.digitalhouse.obtenerdiploma.dto;

import lombok.*;

import java.util.List;
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ErrorDTO {

    String explanation;
    List<String> messages;

}
