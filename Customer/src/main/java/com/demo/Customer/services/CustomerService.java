package com.demo.Customer.services;
import com.demo.Customer.entity.Customer;
import com.demo.Customer.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class CustomerService {
	@Autowired
    private CustomerRepository customerRepository;

    // Create or Update Customer
    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    // Get all customers
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    // Get customer by ID
    public Optional<Customer> getCustomerById(int id) {
        return customerRepository.findById(id);
    }

    // Delete customer
    public void deleteCustomer(int id) {
        customerRepository.deleteById(id);
    }
}
