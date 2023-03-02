package com.dh.blog.controller;

import com.dh.blog.dto.request.BlogRequestDTO;
import com.dh.blog.dto.response.BlogListDTO;
import com.dh.blog.dto.response.BlogResponseDTO;
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

    @GetMapping("/blog/{id}")
    public BlogRequestDTO searchBlog(@PathVariable Integer id) {
        return blogService.searchingBlog(id);
    }

    @GetMapping("/blogs")

    public List listComplete() {
        return blogService.listComplete();
    }

    @PostMapping("/blogs")
    public BlogResponseDTO createBlog(@RequestBody BlogRequestDTO blogRequestDTO){
        return blogService.creatingBlog(blogRequestDTO);
    }


}
