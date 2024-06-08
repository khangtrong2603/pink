package com.example.dinhtrongkhang.repository;

import com.example.dinhtrongkhang.entity.Book;
import com.example.dinhtrongkhang.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBookRepository extends JpaRepository<Book, Long> {

}
