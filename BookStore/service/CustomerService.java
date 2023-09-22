package com.library.BookStore.service;

import java.util.List;

import com.library.BookStore.entity.Book;
import com.library.BookStore.entity.Customer;

public interface CustomerService {
	Customer saveCustomer(Customer cust);
	
	List<Customer> getAllCustomers();
	
	int passIdValue(int id);
	
	
}
