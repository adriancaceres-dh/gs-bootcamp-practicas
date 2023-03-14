package com.bootcamp.practicaIntegradora.Repository;

import com.bootcamp.practicaIntegradora.Model.EntryBlog;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Repository;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Repository
@Getter
@Setter
public class BlogRepository {
    private List<EntryBlog> blogs;
    private int autoIncrement;

    public BlogRepository() {
        autoIncrement = 1;
        this.blogs = loadDataBase();
    }

    public List<EntryBlog> dataBlogs(){
        return blogs;
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

    private List<EntryBlog> loadDataBase() {
        List<EntryBlog> blogs = null;

        File file;
        ObjectMapper objectMapper = new ObjectMapper()
                .configure(SerializationFeature.WRAP_ROOT_VALUE, false)
                .registerModule(new JavaTimeModule());
        TypeReference<List<EntryBlog>> typeRef = new TypeReference<>() {};

        try {
            file = ResourceUtils.getFile("classpath:blogs.json");
            blogs = objectMapper.readValue(file, typeRef);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return blogs;
    }

}