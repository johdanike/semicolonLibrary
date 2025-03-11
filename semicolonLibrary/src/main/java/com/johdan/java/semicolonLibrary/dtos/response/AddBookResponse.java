package com.johdan.java.semicolonLibrary.dtos.response;

import lombok.Getter;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;

@Setter
@Getter
public class AddBookResponse {
    private String id;
    private String message;
    private String title;
    private String author;
    private String isbn;
    private MultipartFile image;
    private String url;
}
