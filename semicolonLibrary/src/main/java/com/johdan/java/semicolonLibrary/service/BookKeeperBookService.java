package com.johdan.java.semicolonLibrary.service;

import com.johdan.java.semicolonLibrary.data.model.Book;
import com.johdan.java.semicolonLibrary.data.repository.BookRepository;
import com.johdan.java.semicolonLibrary.dtos.request.AddBookRequest;
import com.johdan.java.semicolonLibrary.dtos.response.AddBookResponse;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class BookKeeperBookService implements BookService {

    private final ModelMapper modelMapper;
    private final BookRepository bookRepository;

//    @Autowired
//    public BookKeeperBookService(ModelMapper modelMapper) {
//        this.modelMapper = modelMapper;
//    }

    @Override
    public AddBookResponse addNewBook(AddBookRequest addBookRequest) {
        Book book = modelMapper.map(addBookRequest, Book.class);
        book = bookRepository.save(book);
//        TODO: upload e-book file to cloud
        return null;
    }
}
