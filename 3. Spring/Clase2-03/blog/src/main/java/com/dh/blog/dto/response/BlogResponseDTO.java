package com.dh.blog.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.PositiveOrZero;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

//Al ser un dto de entrada puedo aplicarle validaciones
//Es necesario poner @Validated? NO
public class BlogResponseDTO {
    @PositiveOrZero
    private int idBlog;

}
