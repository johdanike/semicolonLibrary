package com.johdan.java.semicolonLibrary.service;

import com.johdan.java.semicolonLibrary.dtos.request.AddBookRequest;
import com.johdan.java.semicolonLibrary.dtos.response.AddBookResponse;
import org.springframework.stereotype.Repository;

@Repository
public interface BookService {
    AddBookResponse addNewBook(AddBookRequest addBookRequest);
}
