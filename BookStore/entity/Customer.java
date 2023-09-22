package com.library.BookStore.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer_info")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int cust_id;	
private  String name;
private String contact;
private String address;
private int book_id;     // This field will store the ID of Books
public Customer() {
	super();
	// TODO Auto-generated constructor stub
}
public Customer(int cust_id, String name, String contact, String address, int book_id) {
	super();
	this.cust_id = cust_id;
	this.name = name;
	this.contact = contact;
	this.address = address;
	this.book_id = book_id;
}
@Override
public String toString() {
	return "Customer [cust_id=" + cust_id + ", name=" + name + ", contact=" + contact + ", address=" + address
			+ ", book_id=" + book_id + "]";
}
public int getCust_id() {
	return cust_id;
}
public void setCust_id(int cust_id) {
	this.cust_id = cust_id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getContact() {
	return contact;
}
public void setContact(String contact) {
	this.contact = contact;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public int getBook_id() {
	return book_id;
}
public void setBook_id(int book_id) {
	this.book_id = book_id;
}




}
