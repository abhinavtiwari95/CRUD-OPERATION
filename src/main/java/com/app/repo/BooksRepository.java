package com.app.repo;

import com.app.model.Books;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BooksRepository extends CrudRepository <Books, Long>{
	

}
