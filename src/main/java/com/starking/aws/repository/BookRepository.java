package com.starking.aws.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.starking.aws.data.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long>{

}