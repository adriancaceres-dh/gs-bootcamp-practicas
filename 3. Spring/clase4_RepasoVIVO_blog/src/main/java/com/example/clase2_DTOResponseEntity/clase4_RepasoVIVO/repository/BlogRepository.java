package com.example.clase2_DTOResponseEntity.clase4_RepasoVIVO.repository;

import com.example.clase2_DTOResponseEntity.clase4_RepasoVIVO.model.EntradaBlog;
import lombok.Data;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository //SpringBoot sabe que es un repository
public class BlogRepository {
    private List<EntradaBlog> blogs;
    private int autoIncrement; //Para generar id automatico
    private String data;


    //Contructor - Define un estado inicial para los objetos que se creen.
    public BlogRepository(){
        data = "Hello World";
        autoIncrement = 1;
        blogs = new ArrayList<>();
    }

    //Metodo para retornar la info y enviarla al service y luego el service se la pasa al controller para mostrarla en postman.
    public String getData(){
        return data;
    }

    public int save(EntradaBlog blog){
        blog.setId(autoIncrement); //Creamos el dato que nos falta, que es el id
        blogs.add(blog);
        autoIncrement++;

        return blog.getId();
    }

    public boolean existBlogWithTitle(String title){
        for (EntradaBlog blog : blogs) {
            if(blog.getTitle().equalsIgnoreCase(title)){
                return true;
            }
        }
        return false;
    }

    public EntradaBlog searchBlog(int id) {

        for (EntradaBlog blog : blogs) {
            if (blog.getId() == id) {
                return blog;
            }
        }
        throw new RuntimeException("No existe el blog ");
    }

    public List<EntradaBlog> listBlogs(){

        return blogs;
    }

}
