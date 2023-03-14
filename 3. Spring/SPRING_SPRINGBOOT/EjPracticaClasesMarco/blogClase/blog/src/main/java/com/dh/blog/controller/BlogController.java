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

    @Autowired
    BlogService blogService;

    //ver si tengo que quitar, lo hice con lucio
    public BlogController(BlogService blogService) {
        this.blogService = blogService;
    }

    @GetMapping("/")
    public String hello() {
        return blogService.greeting();
    }

    @PostMapping("/blogs")
    public BlogResponseDTO createBlog(@RequestBody BlogRequestDTO blogRequestDTO) {
        return blogService.creatingBlog(blogRequestDTO);
    }

    @GetMapping("/blogs/list")
    public List<EntradaBlog> listBlog() {
        return blogService.listBlog();
    }

    @GetMapping("/blogs")
    public List<EntradaBlog> blogList(){
        return blogService.blogList();
    }
    @GetMapping("/blog/{id}")
    public EntradaBlog idBlog (@PathVariable Integer id) {
        return blogService.obtenerBlog(id);

    }
}
