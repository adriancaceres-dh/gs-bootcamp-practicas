package com.dh.blog.repository;

import com.dh.blog.model.EntradaBlog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class BlogRepository {
    private List<EntradaBlog> blogs;
    private String data;
    private int autoIncrement;

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
        for (EntradaBlog blog : blogs) {
            if(blog.getTitle().equalsIgnoreCase(title)){
                return true;
            }
        }
        return false;
    }
}
