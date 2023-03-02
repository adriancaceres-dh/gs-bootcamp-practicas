package com.example.clase2_DTOResponseEntity.clase4_RepasoVIVO.service;

import com.example.clase2_DTOResponseEntity.clase4_RepasoVIVO.dto.request.BlogRequestDto;
import com.example.clase2_DTOResponseEntity.clase4_RepasoVIVO.dto.response.BlogResponseDto;
import com.example.clase2_DTOResponseEntity.clase4_RepasoVIVO.model.EntradaBlog;
import com.example.clase2_DTOResponseEntity.clase4_RepasoVIVO.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service //LOGICA DE NEGOCIO - TODOS LOS METODOS VAN ACA QUE LUEGO SE LLAMAN EN EL CONTROLLER.
public class BlogService {

    @Autowired
    BlogRepository blogRepository;
    public String greeting(){
        String message = blogRepository.getData(); //Llama el metodo del repository
        return message;
    }

    public BlogResponseDto creatingBlog(BlogRequestDto blogRequestDto){
        //Objetivo: cortar la ejecucion normal cuando un titulo es repetido.//LANZAMOS LA ECEPTION - Para manejarla vamos a crear paq exception y capturarla
        if(blogRepository.existBlogWithTitle(blogRequestDto.getTitle())){
            throw new RuntimeException("El título ya existe");
        }

        EntradaBlog blog = new EntradaBlog();
        blog.setTitle(blogRequestDto.getTitle());
        blog.setNameAuthor((blogRequestDto.getNameAuthor()));
        blog.setDate(LocalDate.now());

        int blogIdSaved = blogRepository.save(blog);

        BlogResponseDto response = new BlogResponseDto();
        response.setIdBlog(blogIdSaved);

        return response;
    }

    //EN LO POSIBLE SIEMPRE DEVOLVER DTO Y NO EL CONTENIDO QUE TENEMOS EN EL REPOSITORIO.
    public EntradaBlog searchBlog(int id) {
        return blogRepository.searchBlog(id);
    }

    public List<EntradaBlog> listBlogs(){
        return blogRepository.listBlogs();
    }
}
