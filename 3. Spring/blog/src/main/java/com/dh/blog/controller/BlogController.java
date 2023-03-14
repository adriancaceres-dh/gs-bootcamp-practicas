package com.dh.blog.controller;

import com.dh.blog.dto.request.BlogRequestDto;
import com.dh.blog.dto.response.BlogResponseDto;
import com.dh.blog.model.EntradaBlog;
import com.dh.blog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BlogController {
    @Autowired //Con esto busca el blog service , genera la conexion con el mismo.
    BlogService blogService;
    @GetMapping("/") //PAra consultar datos
    public String hello(){
        return blogService.greeting(); //con esto ejecuta el saludo en blog service.
    }
    @GetMapping("/blogs/list")//List complete
    public List<EntradaBlog> listBlogs(){return blogService.blogList();}
    @GetMapping("/blog/{id}")
    public BlogRequestDto searchBlog(@PathVariable Integer id){
        return blogService.searchingBlog(id);
    }

    @PostMapping("/blogs")
    public BlogResponseDto createBlog(@RequestBody BlogRequestDto blogRequestDto){
        return blogService.creatingBlog(blogRequestDto);
    }


}
