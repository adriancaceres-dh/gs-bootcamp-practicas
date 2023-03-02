package com.dh.blog.dto.response;

import com.dh.blog.dto.request.BlogRequestDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class BlogListDTO {

    private List<BlogRequestDTO> list = new ArrayList<>();


}
