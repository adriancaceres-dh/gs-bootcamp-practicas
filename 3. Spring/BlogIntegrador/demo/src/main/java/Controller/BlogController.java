package com.dh.blog.controller;

import com.dh.blog.dto.request.BlogRequestDTO;
import com.dh.blog.dto.response.BlogResponseDTO;
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
    public String hello(){
        return blogService.greeting();
    }

    @PostMapping("/blogs")
    public BlogResponseDTO createBlog(@RequestBody BlogRequestDTO blogRequestDTO){
        return blogService.creatingBlog(blogRequestDTO);
    }
}



//package Controller;
//
//import Service.BlogService;
//import dto.request.BlogRequestDto;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class BlogController {
//
//    @Autowired
//    BlogService;
//    public String hello (){
//
//        @GetMapping("/");
//        return BlogService"Hello World!";
//               //Es importante que si en el public indique string, el return coincida en el tipo de dato.
//    }
//    @PostMapping ("/blogs")
//    public BlogRequestDto createBlogs(@RequestBody BlogRequestDto){
//        return BlogService.creatingBlog(BlogRequestDto);
//    }
//
//
//}
