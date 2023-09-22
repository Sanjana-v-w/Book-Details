package com.library.BookStore.service;

import java.util.List;

import com.library.BookStore.entity.Book;


public interface BookService {
Book saveBook(Book book);
	
	void deleteBookById(int id);
	
	Book updateBook(Book book);
	
	Book getBookById(int id);
	
	List<Book> getAllBooks();
}
