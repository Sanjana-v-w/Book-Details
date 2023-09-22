package com.library.BookStore.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.BookStore.entity.Book;
import com.library.BookStore.repository.BookRepository;
import com.library.BookStore.service.BookService;
@Service
public class BookserviceImpl implements BookService{

	@Autowired
	private BookRepository repos;
	@Override
	public Book saveBook(Book book) {
		// TODO Auto-generated method stub
		return repos.save(book);
	}

	@Override
	public void deleteBookById(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Book updateBook(Book book) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Book getBookById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> getAllBooks() {
	
		return repos.findAll();
	}

}
