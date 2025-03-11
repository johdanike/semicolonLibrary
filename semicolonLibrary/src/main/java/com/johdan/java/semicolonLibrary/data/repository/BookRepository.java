package com.johdan.java.semicolonLibrary.data.repository;

import com.johdan.java.semicolonLibrary.data.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface BookRepository extends JpaRepository<Book, UUID> {

}
