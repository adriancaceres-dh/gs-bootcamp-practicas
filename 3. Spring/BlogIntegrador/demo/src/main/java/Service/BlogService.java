package Service;

import Repositorio.BlogRepository;
import dto.request.BlogRequestDto;
import dto.response.BlogResponseDto;
import model.EntradaBlog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class BlogService {

    @Autowired
    BlogRepository;
    public String greeting(){
        String message = BlogRepository.getdata();
        return message;
    }

    public String createBlog(BlogRequestDto){
        EntradaBlog blog = new EntradaBlog();
        blog.setTitle(BlogRequestDto.getTitle);
        //name;
        blog.setDate(LocalDate.now());//esta creada automáticamente, no lo crea el usuario

        BlogResponseDto response = new BlogResponseDto(blogIdSaved)
        return "save";
    }

}
