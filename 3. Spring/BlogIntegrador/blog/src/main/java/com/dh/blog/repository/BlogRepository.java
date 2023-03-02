package com.dh.blog.repository;

import com.dh.blog.model.EntradaBlog;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Repository
public class BlogRepository {
    private List<EntradaBlog> blogs;
    private int autoIncrement;
    private String data;

    public BlogRepository(){
        autoIncrement = 1;
        blogs = new ArrayList<>();
        data = "Hello World";
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

    public boolean existId(int id){
        for (EntradaBlog blog: blogs) {
            if(blog.getId()==id){
                return true;
            }
        }
        // Si llegamos aca significa que no encontramos el id en bucle
        return false;
    }

    public EntradaBlog devolverBlog(int id){
        for (EntradaBlog blog: blogs) {
            if(blog.getId()==id){
                return blog;
            }
        }
        // Si llegamos aca significa que no encontramos el id en bucle
        return null;
    }
}
