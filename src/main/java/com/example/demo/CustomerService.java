package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

	@Autowired
	CustomerRepository customerRepository;

	public List<Customer> getAllCustomer() {
		List<Customer> list = new ArrayList<Customer>();
		customerRepository.findAll().forEach(list::add);
		return list;
	}

	public Customer getCustomer(int id) {
		return customerRepository.findById(id).get();
	}

	public Customer addCustomer(Customer customer) {
		return customerRepository.save(customer);
	}

	public void updateCustomer(int id, Customer customer) {
		Customer cus = customerRepository.findById(id).get();
		cus.setAge(customer.getAge());
		cus.setEmail(customer.getEmail());
		cus.setName(customer.getName());

		customerRepository.save(cus);
	}

	public void deleteCustomer(int id) {
		customerRepository.deleteById(id);
	}

}
