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

    public List<EntryBlog> dataBlogs(){
        return blogRepository.dataBlogs();
    }
    public BlogResponseDto creatingBlog(@RequestBody BlogRequestDto blogRequestDto) {

        if (blogRepository.existBlogWhitTitle(blogRequestDto.getTitle())) {
            throw new RuntimeException("El titulo ya existe");
        }

        EntryBlog blog = new EntryBlog();
        blog.setTitle(blogRequestDto.getTitle());
        blog.setNameAuthor(blogRequestDto.getNameAuthor());


        int blogIdSaved = blogRepository.save(blog);

        return new BlogResponseDto(blogIdSaved);
    }

    // TRATAR SIEMPRE DE DEVOLVER DTO Y NO EL CONTENIDO DEL REPOSITORIO
    public EntryBlog requestingBlog(Integer id) {

        if (blogRepository.notExistBlogWhitId(id)) {
            throw new RuntimeException("El id no existe");
        }
        return blogRepository.getBlogWhitId(id);
    }


}
