package com.library.BookStore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.library.BookStore.entity.Book;
import com.library.BookStore.entity.Book;
import com.library.BookStore.service.BookService;


@Controller

public class BookController {

	@Autowired
	private BookService service;
	
	@GetMapping("/home")
	public String homepage() {
		return "home";
	}
	
	@GetMapping("/book_register")
	public String registerBook() {
		return "book_register";
	}
	
	@PostMapping("/save")
	public String saveBook(@ModelAttribute Book book) {
		service.saveBook(book);

		return "redirect:/avaliable_books";
	}
	
	
	@GetMapping("/avaliable_books")
	public ModelAndView showAllBooks()
	{
		
		List<Book> list=service.getAllBooks();
		return new ModelAndView("bookList","book",list);
		
	}
}
