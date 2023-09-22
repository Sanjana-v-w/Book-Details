package com.library.BookStore.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.BookStore.entity.Book;
import com.library.BookStore.entity.Customer;
import com.library.BookStore.repository.BookRepository;
import com.library.BookStore.repository.CustomerRepository;
import com.library.BookStore.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	private CustomerRepository repos;
	
	@Autowired
	private BookRepository repo;

	@Override
	public Customer saveCustomer(Customer cust) {
		
		return repos.save(cust);
	}

	@Override
	public List<Customer> getAllCustomers() {
		
		return repos.findAll();
	}

	@Override
	public int passIdValue(int id) {
		Book book =repo.getOne(id);
	int book_id=book.getId();
	
  System.out.println(book_id);
	return book_id;
		
	}

	
	

	

	
}
