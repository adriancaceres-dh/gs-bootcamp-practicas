package com.dh.blog.controller;

import com.dh.blog.dto.request.BlogRequestDto;
import com.dh.blog.dto.response.BlogResponseDto;
import com.dh.blog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BlogController {
    @Autowired
    BlogService blogService;

    @GetMapping("/")
    public String hello() {
        return blogService.greeting();
    }

    @PostMapping("/blogs")
    public BlogResponseDto createBlog(@RequestBody BlogRequestDto blogRequestDto) {
        return blogService.creatingBlog(blogRequestDto);
    }
}
