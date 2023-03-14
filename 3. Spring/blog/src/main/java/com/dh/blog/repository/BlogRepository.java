package com.dh.blog.repository;

import com.dh.blog.dto.request.BlogRequestDto;
import com.dh.blog.model.EntradaBlog;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class BlogRepository {
    private List<EntradaBlog> blogs;
    private int autoIncrement;
    private String data;
    public BlogRepository(){ //EL constructor define un estado inicial para los objetos que se creen.
        autoIncrement = 1;
        blogs = new ArrayList<>();
        data = "Hello World";
    }

    public String getData() {//con get data nos comunicamos.
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
            if (blog.getTitle().equalsIgnoreCase(title)){
                return true;
            }
        }
        //Si llegamos aca significa que no encontramos el titulo en el bucle
        return false;
    }
    public List<EntradaBlog> getBlogs() {return blogs;}

    /*public EntradaBlog existBlogWithId(Integer id){
        for(EntradaBlog blog: blogs){
            if(blog.getId() == (id)){
                return blog;
            }
        }
        return null;
    }*/
    private Map<Integer, EntradaBlog> blogsMap = new HashMap<>();

    public void addBlog(EntradaBlog blog) {
        blogsMap.put(blog.getId(), blog);
    }

    public EntradaBlog getBlogById(Integer id) {
        return blogsMap.get(id);
    }

}
