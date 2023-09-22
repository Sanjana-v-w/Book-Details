package com.library.BookStore.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.library.BookStore.entity.Book;
import com.library.BookStore.entity.Customer;
import com.library.BookStore.service.CustomerService;

@Repository
public interface CustomerRepository  extends JpaRepository<Customer, Integer>{

	

}
