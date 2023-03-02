package com.example.clase2_DTOResponseEntity.clase4_RepasoVIVO.controller;

import com.example.clase2_DTOResponseEntity.clase4_RepasoVIVO.dto.request.BlogRequestDto;
import com.example.clase2_DTOResponseEntity.clase4_RepasoVIVO.dto.response.BlogResponseDto;
import com.example.clase2_DTOResponseEntity.clase4_RepasoVIVO.model.EntradaBlog;
import com.example.clase2_DTOResponseEntity.clase4_RepasoVIVO.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //INDICAMOS A SPRING QUE ESTO ES UN CONTROLLER
public class BlogController {
    @Autowired//Comunicacion con el service BlogService.
    BlogService blogService;

    @GetMapping("/")//Una app externa nos solicita la ruta. (postman)
    public String hello(){
        return blogService.greeting();
    }

    @PostMapping("/blogs")
    public BlogResponseDto createBlog(@RequestBody BlogRequestDto blogRequestDto){
        return blogService.creatingBlog(blogRequestDto);
    }

    @GetMapping("/blog/{id}")
    public EntradaBlog searchBlog(@PathVariable Integer id) {
        return blogService.searchBlog(id);
    }

    @GetMapping("/blogList")
    public List<EntradaBlog> blogList(){
        return blogService.listBlogs();
    }
}
