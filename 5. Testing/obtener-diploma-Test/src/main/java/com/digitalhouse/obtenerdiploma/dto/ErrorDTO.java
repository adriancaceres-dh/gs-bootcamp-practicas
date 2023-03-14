package com.digitalhouse.obtenerdiploma.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data //loombok genera sus propios test
@NoArgsConstructor
@AllArgsConstructor
public class ErrorDTO {

    String explanation;
    List<String> messages;

}
