package com.bootcamp.practicaIntegradora.Repository;

import com.bootcamp.practicaIntegradora.Model.EntryBlog;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
@Getter
@Setter
public class BlogRepository {
    private List<EntryBlog> blogs;
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

    public Integer save(EntryBlog blog) {
        blog.setId(autoIncrement);
        blogs.add(blog);
        autoIncrement++;
        return blog.getId();
    }

    public boolean existBlogWhitTitle(String title) {
        for (EntryBlog blog : blogs) {
            if (blog.getTitle().equalsIgnoreCase(title)) {
                return true;
            }
        }
        return false;
    }

    public boolean notExistBlogWhitId(Integer id) {
        for (EntryBlog blog : blogs) {
            if (blog.getId() == id) {
                return false;
            }
        }
        return true;
    }

    public EntryBlog getBlogWhitId(Integer id) {
        for (EntryBlog blog : blogs) {
            if (blog.getId() == id) {
                return blog;
            }
        }
        return null;
    }

    public List<EntryBlog> listBlogs(){
        return blogs;
    }

}