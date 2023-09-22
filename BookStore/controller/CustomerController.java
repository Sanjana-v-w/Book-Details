package com.library.BookStore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.library.BookStore.entity.Book;
import com.library.BookStore.entity.Customer;
import com.library.BookStore.service.BookService;
import com.library.BookStore.service.CustomerService;

@Controller

public class CustomerController {

	@Autowired
	private CustomerService service;
	
	
	@GetMapping("/cust_register")
	public String registerCustomer() {
		return "cust_register";
	}
	
	@PostMapping("/save_cust")
	public String saveCustomer(@ModelAttribute Customer cust) {
		service.saveCustomer(cust);

		return "conformed";
	}
	
	
	@GetMapping("/cust_list")
	public ModelAndView showAllCustomers()
	{
		
		 List<Customer> list=service.getAllCustomers(); 
		 return new ModelAndView("custList","cust",list);	 	
	}
	
	
	
	public void getBookId(@ModelAttribute Book book )
	{
		
		int id=service.passIdValue(book.getId());
		System.out.println(id);
	}


}
