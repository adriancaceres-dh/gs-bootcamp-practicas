package com.dh.blog.service;

import com.dh.blog.dto.request.BlogRequestDto;
import com.dh.blog.dto.response.BlogResponseDto;
import com.dh.blog.model.EntradaBlog;
import com.dh.blog.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.concurrent.BlockingQueue;

@Service
public class BlogService {
    @Autowired
    BlogRepository blogRepository; //Conexion con el repository
    public String greeting(){
        String message = blogRepository.getData();
        return message;
    }
   public BlogResponseDto creatingBlog(BlogRequestDto blogRequestDto){
        //Objetivo: Cortar la ejecucion normal cuando un titulo es repetido.
    if(blogRepository.existBlogWithTitle(blogRequestDto.getTitle())){
       throw new RuntimeException("El titulo ya existe");


    }
       EntradaBlog blog = new EntradaBlog();
       blog.setTitle(blogRequestDto.getTitle());
       blog.setName(blogRequestDto.getName());
       blog.setDate(LocalDate.now());

       int blogIdSaved = blogRepository.save(blog);
       BlogResponseDto response = new BlogResponseDto();
       response.setIdBlog(blogIdSaved);
       return response;
   }

  /* public BlogRequestDto searchingBlog(Integer id){
        if(blogRepository.existBlogWithId(id)== null){
            throw new RuntimeException(("El id no existe."));
        }
       BlogRequestDto blogId = new BlogRequestDto(blogRepository.existBlogWithId(id).getTitle(),
               blogRepository.existBlogWithId(id).getName());
        return blogId;
   }*/

    public BlogRequestDto searchingBlog(Integer id) {
        EntradaBlog blog = blogRepository.getBlogById(id)
                .orElseThrow(() -> new RuntimeException("El id no existe."));
        return new BlogRequestDto(blog.getTitle(), blog.getName());
    }

}
