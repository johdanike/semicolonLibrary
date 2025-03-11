package com.johdan.java.semicolonLibrary.dtos.request;

import lombok.Getter;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;

@Setter
@Getter
public class AddBookRequest {
    private String title;
    private String author;
    private String isbn;
    private MultipartFile image;
}
