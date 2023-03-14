package com.dh.blog.service;

import com.dh.blog.dto.request.BlogRequestDto;
import com.dh.blog.dto.response.BlogResponseDto;
import com.dh.blog.model.EntradaBlog;
import com.dh.blog.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class BlogService {
    @Autowired
    BlogRepository blogRepository;
    public String greeting() {
        String message = blogRepository.getData();
        return message;
    }
    public BlogResponseDto creatingBlog(BlogRequestDto blogRequestDto){
        if(blogRepository.existBlogWithTitle(blogRequestDto.getTitle())){
            throw new RuntimeException("El titulo ya existe");
        }

        EntradaBlog blog = new EntradaBlog();
        blog.setTitle(blogRequestDto.getTitle());
        blog.setNameAuthor(blogRequestDto.getNameAuthor());
        blog.setDate(LocalDate.now());

        int blogIdSaved = blogRepository.save(blog);

        BlogResponseDto response = new BlogResponseDto(blogIdSaved);
        return response;
    }


}
