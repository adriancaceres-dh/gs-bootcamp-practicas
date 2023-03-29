package com.bootcamp.testing.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class IngredientDTO {

    private String name;
    private Integer quality;
    private Integer quantity;
    private Integer calories;

}
