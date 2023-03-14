package com.bootcamp.practicaIntegradora.Service;

import com.bootcamp.practicaIntegradora.Dto.Request.BlogRequestDto;
import com.bootcamp.practicaIntegradora.Dto.Response.BlogResponseDto;
import com.bootcamp.practicaIntegradora.Model.EntryBlog;
import com.bootcamp.practicaIntegradora.Repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;


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

    public BlogResponseDto creatingBlog(@RequestBody BlogRequestDto blogRequestDto) {

        if (blogRepository.existBlogWhitTitle(blogRequestDto.getTitle())) {
            throw new RuntimeException("El titulo ya existe");
        }

        EntryBlog blog = new EntryBlog();
        blog.setTitle(blogRequestDto.getTitle());
        blog.setNameAuthor(blogRequestDto.getNameAuthor());
        blog.setDate(LocalDate.now());

        int blogIdSaved = blogRepository.save(blog);

        BlogResponseDto response = new BlogResponseDto(blogIdSaved);
        return response;
    }

    // TRATAR SIEMPRE DE DEVOLVER DTO Y NO EL CONTENIDO DEL REPOSITORIO
    public EntryBlog requestingBlog(Integer id) {

        if (blogRepository.notExistBlogWhitId(id)) {
            throw new RuntimeException("El id no existe");
        }
        return blogRepository.getBlogWhitId(id);
    }

    public List<EntryBlog> listBlogs(){
        return blogRepository.listBlogs();
    }

}
