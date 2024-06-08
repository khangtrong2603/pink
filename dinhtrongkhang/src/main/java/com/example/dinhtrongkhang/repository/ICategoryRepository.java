package com.example.dinhtrongkhang.repository;

import com.example.dinhtrongkhang.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.awt.print.Book;

public interface ICategoryRepository extends JpaRepository<Category, Long> {

}
