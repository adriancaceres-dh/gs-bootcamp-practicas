package com.bootcamp.practicaIntegradora.utils;

import com.bootcamp.practicaIntegradora.Model.EntryBlog;

public class EntryBlogDTOFactory {
    public static EntryBlog getBlog1(){
        return EntryBlog.builder().id(1)
                .title("Blog1")
                .nameAuthor("Martin M")
                .build();
    }
    public static EntryBlog getBlog2(){
        return EntryBlog.builder().id(2)
                .title("Blog2")
                .nameAuthor("Martin D")
                .build();
    }
    public static EntryBlog getBlog3(){
        return EntryBlog.builder().id(3)
                .title("Blog3")
                .nameAuthor("Martin L")
                .build();
    }
}
