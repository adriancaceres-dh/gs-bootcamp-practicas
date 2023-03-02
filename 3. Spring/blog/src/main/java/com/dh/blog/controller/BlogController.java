package com.dh.blog.controller;

import com.dh.blog.dto.request.BlogRequestDTO;
import com.dh.blog.dto.response.BlogResponseDTO;
import com.dh.blog.model.EntradaBlog;
import com.dh.blog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BlogController {

    @Autowired // pedirle el objeto que ya esta guardado en memoria
    BlogService blogService;

    @GetMapping("/")
    public String hello(){
        return blogService.greeting();
    }

    @PostMapping("/blog")
    public BlogResponseDTO createBlog(@RequestBody BlogRequestDTO blogRequestDTO){
        return blogService.creatingBlog(blogRequestDTO);
    }

    @GetMapping("/blog/{id}")
    public EntradaBlog requestBlog(@PathVariable Integer id){
        return blogService.requestingBlog(id);
    }

    @GetMapping("/blogs")
    public List<EntradaBlog> blogList() {
        return blogService.Listblog();
    }
}
