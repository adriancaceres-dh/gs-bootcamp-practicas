package com.dh.blog.repository;

import com.dh.blog.model.EntradaBlog;
import lombok.Data;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
@Data
@Repository
public class BlogRepository {
    private List<EntradaBlog> blogs;
    private int autoIncrement;
    private String data;

    public BlogRepository(){
        autoIncrement = 1;
        blogs = this.agregar();
        data = "Hello World";
    }

    private List<EntradaBlog> agregar() {
        List<EntradaBlog> lista = new ArrayList<>();
        EntradaBlog blog = new EntradaBlog(1,"nombre", "apellido", LocalDate.now());
        lista.add(blog);
        return lista;

    }

    public String getData() {
        return data;
    }

    public int save(EntradaBlog blog){
        blog.setId(autoIncrement);
        blogs.add(blog);
        autoIncrement++;
        return blog.getId();
    }

    public boolean existBlogWithTitle(String title){
        for (EntradaBlog blog: blogs) {
            if(blog.getTitle().equalsIgnoreCase(title)){
                return true;
            }
        }
        // Si llegamos aca significa que no encontramos el titulo en bucle
        return false;
    }

    public boolean notExistBlogWhitId(Integer id) {
        for (EntradaBlog blog : blogs) {
            if (blog.getId() == id) {
                return false;
            }
        }
        return true;
    }

    public EntradaBlog getBlogWhitId(Integer id) {
        for (EntradaBlog blog : blogs) {
            if (blog.getId() == id) {
                return blog;
            }
        }
        return null;
    }


}
