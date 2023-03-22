package com.bootcamp.testing.dto;

import lombok.*;

@Data

// @Getter @Setter @HashCodeAndEquals @ToString

@AllArgsConstructor
@NoArgsConstructor
@Builder
public class IngredientDTO {

    private String name;
    private Integer quality;
    private Integer quantity;
    private Integer calories;

}
