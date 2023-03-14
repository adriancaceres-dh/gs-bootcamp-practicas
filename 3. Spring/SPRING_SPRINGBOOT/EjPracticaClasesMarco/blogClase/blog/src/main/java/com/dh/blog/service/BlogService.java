package com.dh.blog.service;

import com.dh.blog.dto.request.BlogRequestDTO;
import com.dh.blog.dto.response.BlogResponseDTO;
import com.dh.blog.model.EntradaBlog;
import com.dh.blog.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.*;
import java.time.LocalDate;
import java.util.List;

@Service
public class BlogService {

    @Autowired
    BlogRepository blogRepository;

    public String greeting() {
        String message = blogRepository.getData();
        return message;
    }

    public BlogResponseDTO creatingBlog(BlogRequestDTO blogRequestDTO) {
        // Objetivo: cortar la ejecucion normal cuando un titulo es repetido
        if (blogRepository.existBlogWithTitle(blogRequestDTO.getTitle())) {
            throw new RuntimeException("El titulo ya existe");
        }

        EntradaBlog blog = new EntradaBlog();
        blog.setTitle(blogRequestDTO.getTitle());
        blog.setNameAuthor(blogRequestDTO.getNameAuthor());
        blog.setDate(LocalDate.now());

        int blogIdSaved = blogRepository.save(blog);

        BlogResponseDTO response = new BlogResponseDTO();
        response.setIdBlog(blogIdSaved);
        return response;
    }

    public List<EntradaBlog> listBlog() {
        return blogRepository.getBlogs();
    }

    public EntradaBlog obtenerBlog(Integer id) {
        return blogRepository.buscarBlogId(id);
    }
}