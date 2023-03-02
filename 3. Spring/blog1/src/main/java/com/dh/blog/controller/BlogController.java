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

    @GetMapping("/")
    public String hello(){
        return blogService.greeting();
    }

    @PostMapping("/blogs")
    public BlogResponseDTO createBlog(@RequestBody BlogRequestDTO blogRequestDTO){
        return blogService.creatingBlog(blogRequestDTO);
    }

    @GetMapping("/blogs/{id}")
    public EntradaBlog sarchBlog(@PathVariable Integer id){
        return blogService.searchBlog(id);
    }

    @GetMapping("/blogList")
    public List<EntradaBlog> bloglist(){
        return blogService.blogs();
    }
}
