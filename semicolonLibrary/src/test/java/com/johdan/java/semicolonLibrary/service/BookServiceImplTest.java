package com.johdan.java.semicolonLibrary.service;

import com.johdan.java.semicolonLibrary.dtos.request.AddBookRequest;
import com.johdan.java.semicolonLibrary.dtos.response.AddBookResponse;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class BookServiceImplTest {
    @Autowired
    private BookKeeperBookService bookService;

    @Test
    public void testThatBookCanBeAdded(){
        AddBookRequest addBookRequest = new AddBookRequest();
        addBookRequest.setAuthor("John Doe");
        addBookRequest.setTitle("Java");
        addBookRequest.setIsbn("123467");

        AddBookResponse bookResponse = bookService.addNewBook(addBookRequest);

        assertEquals("Book added successfully", bookResponse.getMessage());
        assertThat(bookResponse.getTitle()).isEqualToIgnoringCase(addBookRequest.getTitle());
        assertThat(bookResponse.getAuthor()).isEqualToIgnoringCase(addBookRequest.getAuthor());
    }
}
