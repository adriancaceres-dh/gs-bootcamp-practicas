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

    public BlogRepository() {
        autoIncrement = 1;
        blogs = new ArrayList<>();
        data = "Hello World";
    }

    public String getData() {
        return data;
    }

    public int save(EntradaBlog blog) {
        blog.setId(autoIncrement);
        blogs.add(blog);
        autoIncrement++;
        return blog.getId();
    }

    public boolean existBlogWithTitle(String title) {
        for (EntradaBlog blog : blogs) {
            if (blog.getTitle().equalsIgnoreCase(title)) {
                return true;
            }
        }
        // Si llegamos aca significa que no encontramos el título en bucle
        return false;
    }

    public List<EntradaBlog> getBlogs() {
        return blogs;
    }

    public void setBlogs(List<EntradaBlog> blogs) {
        this.blogs = blogs;
    }

    public EntradaBlog buscarBlogId(Integer id) {
        for (EntradaBlog entradaBlog : blogs) {
            System.out.println(entradaBlog);
            if (id == entradaBlog.getId()) {
                return entradaBlog;
            }
        }
        return null;
    }
}
