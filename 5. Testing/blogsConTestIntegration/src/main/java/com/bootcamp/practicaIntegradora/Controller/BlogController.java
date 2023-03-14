package com.bootcamp.practicaIntegradora.Controller;

import com.bootcamp.practicaIntegradora.Dto.Request.BlogRequestDto;
import com.bootcamp.practicaIntegradora.Dto.Response.BlogResponseDto;
import com.bootcamp.practicaIntegradora.Model.EntryBlog;
import com.bootcamp.practicaIntegradora.Service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Positive;
import java.util.List;

@RestController
@Validated
public class BlogController {

    @Autowired
    BlogService blogService;

    @GetMapping("/list")
    public List<EntryBlog> blogs(){
      return blogService.dataBlogs();
    }

    @PostMapping("/create")
    public BlogResponseDto createBlog(@RequestBody @Valid BlogRequestDto blogRequestDto){
        return blogService.creatingBlog(blogRequestDto);
    }

    @GetMapping("/blog/{id}")
    public EntryBlog requestBlog(@PathVariable @Positive Integer id){
        return blogService.requestingBlog(id);
    }

}
