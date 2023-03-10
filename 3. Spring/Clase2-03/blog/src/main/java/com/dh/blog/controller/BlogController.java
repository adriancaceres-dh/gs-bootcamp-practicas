package com.dh.blog.controller;

import com.dh.blog.dto.request.BlogRequestDTO;
import com.dh.blog.dto.response.BlogResponseDTO;
import com.dh.blog.model.EntradaBlog;
import com.dh.blog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.Min;
import javax.validation.constraints.Positive;
import javax.validation.constraints.PositiveOrZero;
import java.util.List;

@RestController
@Validated
public class BlogController {

    @Autowired
    BlogService blogService;

    @GetMapping("/")
    public String hello(){
        return blogService.greeting();
    }

    @PostMapping("/blog")
    public BlogResponseDTO createBlog(@RequestBody BlogRequestDTO blogRequestDTO){
        return blogService.creatingBlog(blogRequestDTO);
    }

    @GetMapping("/blog/{id}") //validaciones (@Min()
    public EntradaBlog requestBlog(@PathVariable @Min(value = 1) Integer id){
        return blogService.requestingBlog(id);
    }

    @GetMapping("/blogs")
    public List<EntradaBlog> blogList() {
        return blogService.Listblog();
    }


}
